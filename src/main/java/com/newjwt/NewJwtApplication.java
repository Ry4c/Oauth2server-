package com.newjwt;

import com.newjwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class NewJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewJwtApplication.class, args);
	}

}
