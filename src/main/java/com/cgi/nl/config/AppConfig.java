package com.cgi.nl.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfig {
    @Value("${json.file.path}")
    private String jsonFilePath;

    @Value("${log.file.path}")
    private String logFilePath;
}

