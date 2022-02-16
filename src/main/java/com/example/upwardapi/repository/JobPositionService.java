package com.example.upwardapi.repository;

import ch.qos.logback.core.property.ResourceExistsPropertyDefiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RestController
public class JobPositionService implements IJobPositionService{

    @Autowired
    private JedisPool pool;

    @RequestMapping(value = "/jobPositionEntering",method = RequestMethod.GET)
    @Override
    public String jobPositionEntering(String industry, String jobTitle) {
        //组装JobPosition
        JobPosition jobPosition=new JobPosition();
        jobPosition.JobId=industry+"_"+jobTitle;
        jobPosition.jobIndustryInfo=new JobIndustryInfo();
        jobPosition.jobIndustryInfo.industry=industry;
        jobPosition.jobIndustryInfo.jobTitle=jobTitle;

        String key=jobPosition.JobId;
        String value=jobPosition.jobIndustryInfo.toString();

        //写入Redis
        try (Jedis jedis = pool.getResource()) {
            jedis.set(key, value);
        }

        return "ok";
    }
}
