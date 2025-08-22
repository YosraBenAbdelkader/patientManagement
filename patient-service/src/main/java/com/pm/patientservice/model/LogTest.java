package com.pm.patientservice.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LogTest implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Override
    public void run(String... args) {
        log.info("Test log au démarrage");
    }
}