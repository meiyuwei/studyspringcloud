package org.yangdemon.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yangdemon.order.entity.Product;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 注入DiscoveryClient
	 */
	@Autowired
	private DiscoveryClient discoverClient;
	/**
	 * 通过订单系统，调用商品服务根据id查询商品信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/buy/{id}",method = RequestMethod.GET)
	public Product findById(@PathVariable Long id) {
		List<ServiceInstance> instances = discoverClient.getInstances("service-product");
		ServiceInstance instance = instances.get(0);
		Product product = restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/"+id, Product.class);
		return product;
	}
}
