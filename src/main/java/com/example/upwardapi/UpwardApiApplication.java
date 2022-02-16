package com.example.upwardapi;

import com.example.upwardapi.repository.JobPositionService;
import com.example.upwardapi.utils.AutomaticDetectionIpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UpwardApiApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(UpwardApiApplication.class, args);

        System.out.println("Hello world!");


  /*      List<String> ipList=AutomaticDetectionIpUtil.getIpList();
        for (String ip:ipList)
        {
            System.out.println(ip);
        }*/
    }

}
