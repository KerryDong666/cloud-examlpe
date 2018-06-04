package com.kerry.cloud.feign_client.controller;

import com.kerry.cloud.feign_client.api.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CP_dongchuan
 * @date 2018/5/22
 */
@RestController
public class TestController {

	@Autowired
	private UserFeignClient userFeignClient;

	@RequestMapping("/test")
	public String test(){
		return "this is feign client";
	}

	@RequestMapping(value = "/feign/getUser", method = RequestMethod.GET)
	public String getUserServer(){
		return userFeignClient.test();
	}
}
