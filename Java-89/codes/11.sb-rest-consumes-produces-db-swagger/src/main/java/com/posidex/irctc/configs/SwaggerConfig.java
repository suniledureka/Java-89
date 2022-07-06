package com.posidex.irctc.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
						.groupName("com.posidex")
						.apiInfo(apiInfo())
						.select()
						.paths(PathSelectors.any())
						.build();
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("IRCTC TICKET BOOKING APPLICATION")
							.description("Train Ticket Booking Application")
							.termsOfServiceUrl("https://www.posidex.com/terms")
							.license("Licence @ Posidex")
							.licenseUrl("https://www.posidex.com/licence")
							.version("1.0.1")
							.build();
	}
}
