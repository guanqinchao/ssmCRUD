package com.java.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mapper.ProductMapper;
import com.java.pojo.Category;
import com.java.pojo.Product;
import com.java.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductMapper productMapper;
	
	@Override
	public void add(Product product) {
		productMapper.add(product);

	}

	@Override
	public void delete(Product product) {
		productMapper.delete(product.getId());

	}

	@Override
	public void update(Product product) {
		productMapper.update(product);

	}

	@Override
	public Product get(int id) {
		// TODO 自动生成的方法存根
		return productMapper.get(id);
	}

	@Override
	public int total(Category c) {
		// TODO 自动生成的方法存根
		return productMapper.total(c);
	}

	@Override
	public List<Product> list(Map m) {
		// TODO 自动生成的方法存根
		return productMapper.list(m);
	}

}
