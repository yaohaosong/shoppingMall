package com.yhs.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yaohaosong
 * @Date 2019/9/5 15:24
 */
@Configuration
@MapperScan("com.yhs.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
