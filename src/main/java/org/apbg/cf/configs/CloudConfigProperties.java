package org.apbg.cf.configs;

import org.springframework.context.annotation.Profile;

import java.util.Properties;

@Profile("cloud")
public interface CloudConfigProperties {

    public Properties cloudProperties();
}
