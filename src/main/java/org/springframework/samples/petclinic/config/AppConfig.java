package org.springframework.samples.petclinic.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//发现映射器--可以动态生产mapper的实现类
@MapperScan(basePackages = {"org.springframework.samples.petclinic.dao.mapper"})
public class AppConfig {
}
