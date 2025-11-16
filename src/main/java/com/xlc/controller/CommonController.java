package com.xlc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.Properties;

@RestController
public class CommonController {


    @GetMapping("/version")
    public String getVersion(){
        String ip="";
        Properties properties = System.getProperties();
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()){
            Object o = enumeration.nextElement();
            String property = properties.getProperty(String.valueOf(o));
            if(String.valueOf(o) !=null && String.valueOf(o).contains("ip")){
                ip = property;
            }
        }
        return "2025-11-16"+":"+ip;
    }

}
