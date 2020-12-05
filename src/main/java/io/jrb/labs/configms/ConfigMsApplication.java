package io.jrb.labs.configms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Provides a Spring Cloud Configuration Server.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigMsApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ConfigMsApplication.class, args);
	}

}
