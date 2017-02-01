package com.pgrabarczyk.spring.integration.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    private static final String SPRING_INTEGRATION_FILE_FILE_XML = "/spring/integration-file-file.xml";
    private static final String SPRING_INTEGRATION_FILE_FILTER_FILE_XML = "/spring/integration-file-filter-file.xml";
    private static final String SPRING_INTEGRATION_STDIN_STDOUT_XML = "/spring/integration-stdin-stdout.xml";

    public static void main(String[] args) {
	log.info("main start");
	new ClassPathXmlApplicationContext(SPRING_INTEGRATION_FILE_FILTER_FILE_XML);
	log.info("main finish");
    }
}
