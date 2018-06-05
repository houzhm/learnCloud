package com.example.learncloudproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: producerController
 * @Package: com.example.learncloudproducer.controller
 * @Description:
 * @Author houzhm
 * @Date 2018/5/21 16:50
 */
@RestController
public class producerController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi"+name+",I am from port:"+port;
    }
}
