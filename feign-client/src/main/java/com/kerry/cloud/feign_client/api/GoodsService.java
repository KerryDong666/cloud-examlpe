package com.kerry.cloud.feign_client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kerry dong
 * @date 2019/3/31
 */
@FeignClient(value = "micro-server-goods", url = "http://localhost:8082")
public interface GoodsService {

	@RequestMapping(value = "getName", method = RequestMethod.GET)
	String getGoodsName(@RequestParam("name") String name);

}
