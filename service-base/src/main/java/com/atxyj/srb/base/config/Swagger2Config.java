package com.atxyj.srb.base.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * @author: xyj
 * @date: 2021/4/28
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select().paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();
    }

    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("webApi")
                .apiInfo(webApiInfo())
                .select().paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();
    }

    private ApiInfo adminApiInfo () {
      return new ApiInfoBuilder()
                .title("尚融宝后台管理系统API")
                .description("本文档描述了后台管理系统的各个模块的接口的调用方式")
                .version("1.6")
                .contact(new Contact("xyj" , "http://atxyj.com" ,"736354146@qq.com" ))
                .build();
    }

    private ApiInfo webApiInfo () {
        return new ApiInfoBuilder()
                .title("尚融宝网站API文档")
                .description("本文档描述了网站的各个模块的接口的调用方式")
                .version("1.6")
                .contact(new Contact("xyj" , "http://atxyj.com" ,"736354146@qq.com" ))
                .build();
    }


}
