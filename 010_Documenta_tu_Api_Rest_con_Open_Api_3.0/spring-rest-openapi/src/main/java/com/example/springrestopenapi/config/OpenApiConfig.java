package com.example.springrestopenapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
http://localhost:8080/v3/api-docs
http://localhost:8080/swagger-ui/index.html
 */


@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Employees API")
                        .description("Api rest para empleados de la empresa x")
                        .version("v0.0.01")
                        .license(new License().name("Apache 2.0").url("htts://www.example.com/")))

                .externalDocs(new ExternalDocumentation()
                        .description("Wiki Docs")
                        .url("htts://www.example.com/"));
    }

}
