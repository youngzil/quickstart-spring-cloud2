package org.quickstart.spring.cloud.example.gateway.routes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzl
 * @description TODO
 * @createTime 2020/7/7 19:22
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaclientApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaclientApplication.class, args);
  }

  @Value("${server.port}")
  String port;

  @RequestMapping("/")
  public String home() {
    return "i'm 软件老王，欢迎光临，服务端口号为：" + port;
  }
}


