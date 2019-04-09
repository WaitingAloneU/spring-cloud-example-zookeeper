package com.example.gateway.config;

import com.example.gateway.filter.StatisticsFilter;
import com.example.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

    @Bean
    public StatisticsFilter statisticsFilter(){
        return new StatisticsFilter();
    }
}
