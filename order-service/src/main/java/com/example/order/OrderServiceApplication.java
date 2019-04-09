package com.example.order;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderServiceApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }

}

