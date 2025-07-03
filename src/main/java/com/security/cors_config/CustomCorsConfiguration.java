package com.security.cors_config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;

@Component
public class CustomCorsConfiguration implements CorsConfigurationSource {

    @Override
    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // Specify allowed origins (move to config in production)
        corsConfiguration.setAllowedOrigins(List.of(
                "http://localhost:8080",
                "http://127.0.0.1:8080",
                "http://192.168.162.113:8080"
        ));

        // Alternatively, for wildcards (Spring 5.3+)
        // corsConfiguration.addAllowedOriginPattern("http://*.yourdomain.com");

        corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        corsConfiguration.setAllowedHeaders(List.of(
                "Authorization", "Content-Type", "X-Requested-With"
        ));
        corsConfiguration.setAllowCredentials(true); // If using cookies/authorization
        corsConfiguration.setExposedHeaders(List.of("Location")); // Example
        corsConfiguration.setMaxAge(3600L); // Cache preflight response for 1 hour

        return corsConfiguration;
    }
}