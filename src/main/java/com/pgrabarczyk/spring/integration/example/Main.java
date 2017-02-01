package com.pgrabarczyk.spring.integration.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		"/spring/integration-stdin-stdout.xml");

    }
}
