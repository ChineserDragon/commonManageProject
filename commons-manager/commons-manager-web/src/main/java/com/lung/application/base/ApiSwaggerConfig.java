package com.lung.application.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Title: ApiSwaggerConfig
 * @Author: lung
 * @Date: 19-1-18 下午4:45
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Configuration
@EnableSwagger2
@EnableWebMvc
public class ApiSwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger接口集成测试")
                .description("swagger集成的接口测试页面")
                .termsOfServiceUrl("https://github.com/ChinPangLung")
                .contact(new Contact("ChinPangLung", "https://github.com/ChinPangLung", "chinpang9527@gmail.com"))
                .license("")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }

}
