package org.yangdemon.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yangdemon.product.entity.Product;
import org.yangdemon.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Product findById(@PathVariable Long id) {
		
		Product product = productService.findById(id);
		return product;
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void findById(@RequestBody Product product ) {
		productService.save(product);
	}
}
