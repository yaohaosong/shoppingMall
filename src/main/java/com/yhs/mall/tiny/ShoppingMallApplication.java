package com.yhs.mall.tiny;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yaohaosong
 * @Date 2019/9/5 14:50
 */
@SpringBootApplication
@Slf4j
public class ShoppingMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApplication.class, args);
        log.info("********—shoppingMall项目启动完成—********");
    }

}
