package com.thirdgear.example.erp_api_demo.core;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.thirdgear.example.erp_api_demo.entity","com.thirdgear.example.erp_api_demo.service.*"})
@EntityScan(basePackages={"com.thirdgear.example.erp_api_demo.entity","com.thirdgear.example.erp_api_demo.service"}) 
public class CoreConfiguration {
	
}
