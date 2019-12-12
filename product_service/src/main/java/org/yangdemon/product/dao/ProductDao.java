package org.yangdemon.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.yangdemon.product.entity.Product;

/**
 * @author 接口
 *
 */
public interface ProductDao extends JpaRepository<Product, Long>,JpaSpecificationExecutor<Product>{

}
