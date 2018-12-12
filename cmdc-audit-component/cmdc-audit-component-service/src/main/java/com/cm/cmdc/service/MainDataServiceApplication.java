/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.cm.cmdc.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import com.cm.cmdc.framework.service.core.ApplicationStarter;

/**
 * 启动类
 * 
 * @author zhengzhenfu
 * @since 2018年1月16日
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cm.cmdc.service.component"})
@EnableEurekaClient
@MapperScan(basePackages = {"com.cm.cmdc.dao.component.*.mapper"})
//@MapperScan(basePackages = {"com.cm.cmdc.usermgmt.component.*.mapper"})
public class MainDataServiceApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(MainDataServiceApplication.class);
  }

  public static void main(String[] args) {
    ApplicationStarter.run(MainDataServiceApplication.class, args);
  }

}
