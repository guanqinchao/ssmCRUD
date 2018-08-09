package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.pojo.Category;
import com.java.pojo.Product;

public interface ProductService {
	void add(Product c);

	void delete(Product c);

	void update(Product c);

	Product get(int id);

	int total(Category c);

	List<Product> list(Map m);
}
