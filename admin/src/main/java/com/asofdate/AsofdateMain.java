package com.asofdate;

import com.asofdate.utils.Adaptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import com.asofdate.batch.InitBatch;

@ComponentScan(basePackages = {"com.asofdate.utils", "com.asofdate.hauth","com.asofdate.batch"})
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class AsofdateMain {
    // main函数，Spring Boot程序入口
    public static void main(String[] args) {
        SpringApplication.run(AsofdateMain.class, args);
        Adaptor.initDb();
        InitBatch.initBatchInfo();
    }
}