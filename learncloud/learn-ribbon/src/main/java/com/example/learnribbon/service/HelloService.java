package com.example.learnribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: HelloService
 * @Package: com.example.learnribbon.service
 * @Description:
 * @Author houzhm
 * @Date 2018/5/21 17:06
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){

        System.out.println("consumer----");
        return restTemplate.getForObject("http://PRODUCER/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+" sorry,error!";
    }
}
