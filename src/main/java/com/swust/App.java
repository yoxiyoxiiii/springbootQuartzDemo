package com.swust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *  使用 xml 的方式来配置 quartz 的job
 *  @ImportResource(locations = "classpath:quartz-spring.xml") 加载 配置文件
 */
@SpringBootApplication
@ImportResource(locations = "classpath:quartz-spring.xml")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
