package co.com.bancolombia.service.sessionManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-17T09:04:15.518-05:00")

@EnableSwagger2
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Generación de sesión y control de concurrencia")
            .description("Microservicio encargado de validar y generar la sesión para un cliente autenticado")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "juagomez@bancolombia.com.co"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("co.com.bancolombia.service.sessionManagement.api"))
                    .paths(PathSelectors.any())
                    .build()
                .apiInfo(apiInfo());
    }

}
