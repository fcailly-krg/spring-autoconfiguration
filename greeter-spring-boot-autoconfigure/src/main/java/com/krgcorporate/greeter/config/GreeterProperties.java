package com.krgcorporate.greeter.config;

import com.krgcorporate.greeter.Mood;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "krg.greeter")
public class GreeterProperties {

    private Mood mood = Mood.BAD;

}
