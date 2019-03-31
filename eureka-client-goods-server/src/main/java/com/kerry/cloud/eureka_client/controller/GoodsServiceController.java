package com.kerry.cloud.eureka_client.controller;

import com.kerry.cloud.eureka_client.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kerry dong
 * @date 2019/3/31
 */
@RestController
public class GoodsServiceController {

	@Autowired
	private GoodsServiceImpl goodsService;

	@RequestMapping(value = "getName", method = RequestMethod.GET)
	public String getGoodsName(@RequestParam("name") String name){
		return goodsService.getGoodsName(name);
	}
}
