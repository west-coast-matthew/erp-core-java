package com.wc_matthew.demo.erp.core;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * CoreConfiguration
 * 
 * Main annotated configuration class.
 * 
 */
@Configuration
@ComponentScan(basePackages = {"com.wc_matthew.demo.erp.core.entity","com.wc_matthew.demo.erp.core.service.*"})
@EntityScan(basePackages={"com.wc_matthew.demo.erp.core.entity"}) 
public class CoreConfiguration {
	
}
