package org.yangdemon.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangdemon.product.dao.ProductDao;
import org.yangdemon.product.entity.Product;
import org.yangdemon.product.service.ProductService;

@Service
public class ProductServiceImple implements ProductService{
	@Autowired
	private ProductDao productdao;
	@Override
	public Product findById(Long id) {
		return productdao.findById(id).get();
	}

	@Override
	public void save(Product product) {
		productdao.save(product);
	}

	@Override
	public void update(Product product) {
		productdao.save(product);
	}

	@Override
	public void delete(Long id) {
		productdao.deleteById(id);
	}

}
