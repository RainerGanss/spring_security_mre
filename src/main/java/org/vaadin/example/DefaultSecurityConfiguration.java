package org.vaadin.example;

import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class DefaultSecurityConfiguration extends VaadinWebSecurity {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        super.configure(http);
        http.oauth2ResourceServer().jwt();
    }
}