package com.java.mapper;

import java.util.List;
import java.util.Map;

import com.java.pojo.Category;
import com.java.pojo.Product;

public interface ProductMapper {
	public int add(Product product);

	public void delete(int id);

	public int update(Product product);

	public Product get(int id);

	public List<Product> list(Map m);

	public int total(Category c);
}
