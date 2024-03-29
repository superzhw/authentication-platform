package com.taiji.authenticationplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//开启资源服务
@SpringBootApplication
@EnableResourceServer
public class AuthenticationPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationPlatformApplication.class, args);
        System.out.println("认证授权服务启动成功！！！");
    }

}
