package com.db.ms.rest;


import com.db.ms.bean.FilterBean;
import com.db.ms.component.FilterServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterServiceController {

    @Autowired
    FilterServiceConfig configProp;

    @GetMapping("/filter")
    public FilterBean getFilterConfig() {
        return new FilterBean(configProp.getMaximum(), configProp.getMinimum(), configProp.getEnv());
        //return new FilterBean(10, 0);
    }


    @GetMapping("/config")
    public FilterServiceConfig getConfig() {
        return configProp;
    }

    @GetMapping("/test")
    public String test() {
        //return new FilterBean(configProp.getMaximum(), configProp.getMinimum());
        return "test";
    }
}
