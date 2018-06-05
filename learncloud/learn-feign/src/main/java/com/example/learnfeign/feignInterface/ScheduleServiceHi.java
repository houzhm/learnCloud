package com.example.learnfeign.feignInterface;

import com.example.learnfeign.HystricImpl.ScheduleServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: ScheduleServiceHi
 * @Package: com.example.learnfeign.feignInterface
 * @Description:
 * @Author houzhm
 * @Date 2018/5/21 17:25
 */
@FeignClient(value = "producer",fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromProducer(@RequestParam(value = "name") String name);
}
