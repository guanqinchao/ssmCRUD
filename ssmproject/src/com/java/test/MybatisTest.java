package com.java.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.mapper.CategoryMapper;
import com.java.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

/*	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void testAdd() {
		Category category = new Category();

		category.setName("new Categorynew");
		categoryMapper.add(category);

	}

	@Test
	public void testTotal() {
		int total = categoryMapper.total();
		System.out.println("total:" + total);
	}

	@Test
	public void testList() {
		System.out.println(categoryMapper);
		List<Category> cs = categoryMapper.list();
		for (Category c : cs) {
			System.out.println(c.getName());
		}
	}*/

}
