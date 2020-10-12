package com.krgcorporate.greeter.config;

import com.krgcorporate.greeter.Greeter;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Greeter.class)
@EnableConfigurationProperties(GreeterProperties.class)
@AllArgsConstructor
public class GreeterAutoConfiguration {

    private final GreeterProperties properties;

    @Bean
    @ConditionalOnMissingBean(Greeter.class)
    public Greeter greeter() {
        return Greeter.builder()
                .mood(properties.getMood())
                .build();
    }
}
