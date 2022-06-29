package com.dhy.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.dhy"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
