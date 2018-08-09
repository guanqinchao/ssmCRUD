package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mapper.CategoryMapper;
import com.java.pojo.Category;
import com.java.service.CategoryService;
import com.java.util.Page;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> list() {
		// TODO 自动生成的方法存根
		return categoryMapper.list();
	}

	@Override
	public void add(Category c) {
		// TODO 自动生成的方法存根
		  categoryMapper.add(c);
	}

	@Override
	public void update(Category c) {
		categoryMapper.update(c);
		
	}

	@Override
	public void delete(Category c) {
		// TODO 自动生成的方法存根
		categoryMapper.delete(c.getId());
	}

	@Override
	public Category get(int id) {
		// TODO 自动生成的方法存根
		return categoryMapper.get(id);
	}

	@Override
	public List<Category> list(Page page) {
		// TODO 自动生成的方法存根
		return categoryMapper.list(page);
	}

	@Override
	public int total() {
		// TODO 自动生成的方法存根
		return categoryMapper.total();
	}

}
