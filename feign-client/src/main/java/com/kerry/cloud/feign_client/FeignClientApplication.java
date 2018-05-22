package com.kerry.cloud.feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign Client 用于服务间相互调用
 * @author Kerry Dong
 * @date 2018/05/22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
