package com.yx.star.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.yx.star.mbg.mapper", "com.yx.star.dao"})
public class MyBatisConfig {
}
