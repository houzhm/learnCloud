package com.example.learnribbon.controller;

import com.example.learnribbon.service.HelloService;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: HelloController
 * @Package: com.example.learnribbon.controller
 * @Description:
 * @Author houzhm
 * @Date 2018/5/21 17:10
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("ribbon start ---");
        return helloService.hiService(name);
    }


    /**
     * springboot 版本如果是2.0则需要添加 ServletRegistrationBean 因为springboot的默认路径不是 "/hystrix.stream"，只要在自己的项目里配置上下面的servle
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
