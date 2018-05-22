package com.kerry.cloud.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 具体的业务服务
 * @author Kerry Dong
 * @date 2018/05/22
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientUserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientUserServerApplication.class, args);
	}

}
