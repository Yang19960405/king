package com.yh.king;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching                  //启动缓存注解
public class KingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingApplication.class, args);
    }

}
