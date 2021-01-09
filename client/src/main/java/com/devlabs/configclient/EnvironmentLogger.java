package com.devlabs.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RefreshScope
public class EnvironmentLogger {
	
	private final String message;
	
	public EnvironmentLogger(@Value("${message}") final String message) {
		this.message = message;
	}
	
	public void log() {
		log.info("Message from config server: " + message);	}
}
