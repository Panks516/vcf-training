package org.apbg.cf.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Properties;

@Configuration
@Profile("local")
public class LocalCloudProps {

    @Bean
    public Properties cloudProperties() {
        return new Properties();
    }
}
