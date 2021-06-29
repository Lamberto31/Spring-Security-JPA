package it.unisalento.springsecurityjpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedMethods("PUT", "DELETE", "PATCH", "GET", "POST")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
}
