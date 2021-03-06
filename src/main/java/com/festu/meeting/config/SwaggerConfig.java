//package com.festu.meeting.config;
//
//import com.google.common.collect.Sets;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RestController;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
//
///**
// * @author Vladislav Shelengovskiy
// */
//@Configuration
//@EnableSwagger2
////@EnableWebMvc
//public class SwaggerConfig {
//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//                .build()
//                .produces(Sets.newHashSet(APPLICATION_JSON_VALUE))
//                .consumes(Sets.newHashSet(APPLICATION_JSON_VALUE));
//    }
//}
//
