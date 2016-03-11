package com.ms.demo;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.SqlSessionTemplate;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import com.ms.demo.service.testService;


import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */


@SpringBootApplication
@EnableConfigurationProperties
public class App
{


    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);// 从main方法启动spring
    }


}
