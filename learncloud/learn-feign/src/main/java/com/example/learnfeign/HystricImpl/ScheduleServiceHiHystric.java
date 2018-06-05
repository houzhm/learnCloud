package com.example.learnfeign.HystricImpl;

import com.example.learnfeign.feignInterface.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Title: ScheduleServiceHiHystric
 * @Package: com.example.learnfeign.HystricImpl
 * @Description:
 * @Author houzhm
 * @Date 2018/5/22 15:14
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromProducer(String name) {
        return "sorry "+name+" error!";
    }
}
