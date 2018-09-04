package com.api.zuul.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GatewayConfig {

    @Bean
    public CorsFilter corsFilter() {
       final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
       final CorsConfiguration corsConfiguration = new CorsConfiguration();
       corsConfiguration.setAllowCredentials(true);
       corsConfiguration.addAllowedHeader("*");
       corsConfiguration.addAllowedOrigin("*");
       corsConfiguration.setMaxAge(3600L);
       corsConfiguration.addAllowedMethod("*");
       urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
       return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
