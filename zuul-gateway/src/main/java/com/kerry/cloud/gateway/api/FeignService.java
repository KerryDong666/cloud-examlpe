package com.kerry.cloud.gateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author CP_dongchuan
 * @date 2018/6/4
 */
@FeignClient("micro-server-feign")
@Component
public interface FeignService {


	@RequestMapping(value = "/feign/getUser", method = RequestMethod.GET)
	String getUserServer();
}
