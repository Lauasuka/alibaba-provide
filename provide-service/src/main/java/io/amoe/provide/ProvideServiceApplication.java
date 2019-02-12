package io.amoe.provide;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Amoe
 */
@SpringBootApplication
@MapperScan("io.amoe.mapper")
@EnableDubbo(scanBasePackages = "io.amoe")
public class ProvideServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideServiceApplication.class, args);
    }

}

