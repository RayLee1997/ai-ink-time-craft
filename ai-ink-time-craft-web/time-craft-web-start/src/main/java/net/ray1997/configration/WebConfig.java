package net.ray1997.configration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.reactive.config.DelegatingWebFluxConfiguration;
import org.springframework.web.reactive.config.PathMatchConfigurer;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfig extends DelegatingWebFluxConfiguration {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/**")
                    .addResourceLocations("/public", "classpath:/static/")
                    .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS));
        }

        @Override
        public void configurePathMatching(PathMatchConfigurer configurer) {
            configurer.addPathPrefix("/api", HandlerTypePredicate.forAnnotation(RestController.class));
        }

}