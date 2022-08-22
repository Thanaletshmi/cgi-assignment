package com.cgi.nl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cgi.nl.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInformation())
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, getCustomResponseMessage());
    }

    private ApiInfo getApiInformation() {
        return new ApiInfo("Recipe and Log Analyzer APP",
                "This app is created using Spring Boot", "0.0.1",
                "API Terms of Service URL",
                new Contact("CGI Assessment", "www.cgiassessment.com", "support.cgiassessment@gmail.com"),
                "API License", "www.apilicenseurl.com", Collections.emptyList());
    }


    private List<ResponseMessage> getCustomResponseMessage() {
        List<ResponseMessage> responseMessages = new ArrayList<>();
        responseMessages.add(new ResponseMessageBuilder().code(500).message("Server is down!. Please try again after sometime.").build());
        responseMessages.add(new ResponseMessageBuilder().code(400).message("Request is invalid. Please provide the valid information").build());
        responseMessages.add(new ResponseMessageBuilder().code(404).message("Requested Data Not Found !").build());
        return responseMessages;
    }


}
