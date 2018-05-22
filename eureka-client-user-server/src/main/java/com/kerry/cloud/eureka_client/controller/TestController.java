package com.kerry.cloud.eureka_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CP_dongchuan
 * @date 2018/5/22
 */
@RestController
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		return "this is user server";
	}

}
