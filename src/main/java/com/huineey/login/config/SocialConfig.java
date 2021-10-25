package com.huineey.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.oauth2.OAuth2Parameters;

@Configuration
public class SocialConfig {

    @Bean
    public GoogleConnectionFactory connectionFactory() {
        return new GoogleConnectionFactory("1051168153056-m9v7nto44bat0kk2piga3d2ler24do5r.apps.googleusercontent.com",
                "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");
    }

    @Bean
    public OAuth2Parameters auth2Parameters(){
        OAuth2Parameters googleauth2Parameter = new OAuth2Parameters();
        googleauth2Parameter.setRedirectUri("http://localhost:8080/google/callback");
        googleauth2Parameter.setScope("https://www.googleapis.com/auth/plus.login");
        return googleauth2Parameter;
    }

}