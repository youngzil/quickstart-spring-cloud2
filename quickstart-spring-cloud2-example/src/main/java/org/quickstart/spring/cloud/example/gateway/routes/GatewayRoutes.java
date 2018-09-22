/**
 * 项目名称：quickstart-spring-boot-web 
 * 文件名：GatewayRoutes.java
 * 版本信息：
 * 日期：2018年9月22日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.cloud.example.gateway.routes;

import java.util.concurrent.TimeUnit;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * GatewayRoutes 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年9月22日 下午2:46:11 
 * @since 1.0
 */

@Configuration
public class GatewayRoutes {
    private final String httpbinUri = "http://httpbin.org:80";

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(r ->
                        r.path("/get/**")
                                .uri(httpbinUri))
                .route(r ->
                        r.host("*.header.org")
                                .filters(f -> f.addRequestHeader("DEMO-HEADER", "Demo-value"))
                                .uri(httpbinUri)
                )
                .route(r ->
                        r.host("*.rewrite.org")
                                .filters(f -> f.rewritePath("/foo/(?<segment>.*)", "/${segment}"))
                                .uri(httpbinUri)
                )
                .route(r ->
                        r.host("*.setpath.org").and().path("/foo/{segment}")
                                .filters(f -> f.setPath("/{segment}"))
                                .uri(httpbinUri)
                )
                .route(r ->
                        r.host("*.hystrix.org")
                                .filters(f -> f.hystrix("somecommand"))
                                .uri(httpbinUri)
                )
                .route(r ->
                        r.host("*.throttle.org")
                                .filters(f -> f.filter(ThrottleGatewayFilter.newBuilder()
                                        .withCapacity(1)
                                        .withRefillTokens(1)
                                        .withRefillPeriod(10)
                                        .withRefillUnit(TimeUnit.SECONDS).build()))
                                .uri(httpbinUri)
                )
                .build();
    }

}