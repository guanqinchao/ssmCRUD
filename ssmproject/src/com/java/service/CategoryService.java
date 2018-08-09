package com.java.service;

import java.util.List;

import com.java.pojo.Category;
import com.java.util.Page;

public interface CategoryService {
	List<Category> list();
	List<Category> list(Page page);
	void add(Category c);
	void update(Category c);
	void delete(Category c);
	Category get(int id);
    int total();
}
