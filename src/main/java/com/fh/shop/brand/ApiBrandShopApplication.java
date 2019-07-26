package com.fh.shop.brand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.fh.shop.brand.mapper")
@EnableFeignClients("com.fh.shop.brand")
public class ApiBrandShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBrandShopApplication.class, args);
    }

}
