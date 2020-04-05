package com.updownload;

import com.updownload.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class UpDownLoad {

	public static void main(String[] args) {
		SpringApplication.run(UpDownLoad.class, args);
	}

}
