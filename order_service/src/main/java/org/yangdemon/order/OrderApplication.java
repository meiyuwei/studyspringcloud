package org.yangdemon.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("org.yangdemon.order.entity")
@EnableEurekaClient
public class OrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
	/**
	 * 使用Spring提供的RestTemplate发送http请求到商品服务
	 * 1.创建RestTemplate对象交给容器
	 * 2.在使用的时候，调用其方法完成操作（getXXXX,postXXXX）
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
