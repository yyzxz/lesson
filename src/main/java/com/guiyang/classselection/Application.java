package com.guiyang.classselection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述
 * @author zhangya
 * @date 2019-10-15
 * @param
 * @return
 */
@SpringBootApplication
@MapperScan("com.hisense.hitobdmanage.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
