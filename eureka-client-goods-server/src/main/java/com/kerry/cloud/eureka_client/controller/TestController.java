package com.kerry.cloud.eureka_client.controller;

import com.kerry.cloud.eureka_client.service.GoodsServiceImpl;
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
	private GoodsServiceImpl goodsService;

	@RequestMapping("test")
	public String test(){
		return "this is goods server";
	}

	@RequestMapping(value = "/getGoodsName", method = RequestMethod.GET)
	public String getGoodsName(String name){
		return goodsService.getGoodsName(name);
	}
}
