package com.kerry.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关测试
 *
 * @author CP_dongchuan
 * @date 2018/6/4
 */
@RestController
public class ApiController {


	//@Autowired
	//private FeignService feignService;
	//
	//@RequestMapping(value = "/api/test", method = RequestMethod.GET)
	//@ResponseBody
	//public String apiTest(){
	//	return feignService.getUserServer();
	//}

	@RequestMapping("/api/test")
	public String apiTest(){
		return "api gateway";
	}
}
