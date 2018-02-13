package co.com.jjoc007.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Value("${bocc.endpoint.base}")
    private String apiBaseUrl;
	
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        			.select()
        			.apis(RequestHandlerSelectors.any())
        			.paths(PathSelectors.regex(apiBaseUrl + ".*"))
        			.build();
    }
    
}
