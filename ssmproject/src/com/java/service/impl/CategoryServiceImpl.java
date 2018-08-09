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
		// TODO �Զ����ɵķ������
		return categoryMapper.list();
	}

	@Override
	public void add(Category c) {
		// TODO �Զ����ɵķ������
		  categoryMapper.add(c);
	}

	@Override
	public void update(Category c) {
		categoryMapper.update(c);
		
	}

	@Override
	public void delete(Category c) {
		// TODO �Զ����ɵķ������
		categoryMapper.delete(c.getId());
	}

	@Override
	public Category get(int id) {
		// TODO �Զ����ɵķ������
		return categoryMapper.get(id);
	}

	@Override
	public List<Category> list(Page page) {
		// TODO �Զ����ɵķ������
		return categoryMapper.list(page);
	}

	@Override
	public int total() {
		// TODO �Զ����ɵķ������
		return categoryMapper.total();
	}

}