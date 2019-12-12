package org.yangdemon.order.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Product {
	private Long id;
	private String productName;
	private Integer status;
	private BigDecimal price;
	private String productDesc;
	private String caption;
	private Integer inventory;
}
