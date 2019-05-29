package com.guangc.kfc.kfc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.guangc.kfc.kfc.mapper")
public class MybatisConfig {

}
