package com.dhy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类替代 xml 文件
@ComponentScan(basePackages = "com.dhy")
public class SpringConfig {

}
