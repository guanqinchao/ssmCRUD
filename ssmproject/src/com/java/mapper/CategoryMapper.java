package com.java.mapper;

import java.util.List;

import com.java.pojo.Category;
import com.java.util.Page;

public interface CategoryMapper {
	public int add(Category category);

	public void delete(int id);

	public Category get(int id);

	public int update(Category category);

	public List<Category> list(Page page);

	public List<Category> list();

/*	public int count();
*/
	public int total();
}
