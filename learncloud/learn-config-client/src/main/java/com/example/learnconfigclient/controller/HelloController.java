package com.example.learnconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: HelloController
 * @Package: com.example.learnconfigclient.controller
 * @Description:
 * @Author houzhm
 * @Date 2018/5/24 10:44
 */
@RestController
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
public class HelloController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
