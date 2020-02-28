package es.keytree.klockin.app1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Autowired
    private AppConfigurator configurator;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("es.keytree.klockin.app1.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInformation());
    }

    private ApiInfo getApiInformation(){
        return new ApiInfo("POC ",
                "The POC for " + configurator.getCompanyName(),
                "1.0",
                "API Terms of Service URL",
                new Contact("Klockin App", "www.keytree.es", "team@keytree.es"),
                "API License",
                "API License URL",
                Collections.emptyList()
        );
    }
}
