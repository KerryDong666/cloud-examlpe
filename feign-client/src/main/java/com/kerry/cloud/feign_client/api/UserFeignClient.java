package com.kerry.cloud.feign_client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FeignClient,用于本服务调用其他服务
 * @author CP_dongchuan
 * @date 2018/5/22
 */
@FeignClient("micro-server-user")
public interface UserFeignClient {

	/**
	 * 调用user-server里的test接口
	 * 注意事项:
	 *     1.只能使用RequestMapping注解,使用GetMapping/PostMapping等注解无效;
	 *     2.必须指定method,原始接口中也必须指定
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String test();
}
