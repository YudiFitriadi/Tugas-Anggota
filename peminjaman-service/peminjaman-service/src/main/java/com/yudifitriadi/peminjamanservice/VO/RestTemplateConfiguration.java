/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudifitriadi.peminjamanservice.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
@Configuration
public class RestTemplateConfiguration{
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}