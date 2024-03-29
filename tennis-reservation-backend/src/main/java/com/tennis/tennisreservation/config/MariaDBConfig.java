package com.tennis.tennisreservation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Profile("mariadb")
@EnableJpaRepositories(basePackages = "com.tennis.tennisreservation.repositories")
@EnableTransactionManagement
public class MariaDBConfig {
    
}
