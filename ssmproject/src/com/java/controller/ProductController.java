package com.java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.pojo.Category;
import com.java.pojo.Product;
import com.java.service.CategoryService;
import com.java.service.ProductService;
import com.java.util.Page;
//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listProduct")
	public ModelAndView listProduct(Category category,Page page) {
		System.out.println("beforecategory: "+category);
		category = categoryService.get(category.getId());
		System.out.println("aftercategory"+category);
		ModelAndView mav = new ModelAndView();
		Map m =new HashMap();
		m.put("category", category);
		m.put("page", page);
		
		List<Product> cs = productService.list(m);
		int total = productService.total(category);
		page.caculateLast(total);
		// 放入转发参数
		mav.addObject("ps",cs);
		mav.addObject("category", category);
		// 放入jsp路径
		mav.setViewName("listProduct");
		return mav;
	 }
	@RequestMapping("addProduct")
	public ModelAndView addProduct(Product product){
		System.out.println("add product:"+product);
		productService.add(product);
		ModelAndView mav =new ModelAndView("redirect:/listProduct?id="+product.getCategory().getId());
		return mav;
	}
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(Product product) {
		System.out.println("will be delete product:"+product);
		product = productService.get((product.getId()));
		productService.delete(product);
		System.out.println("after service delete product:"+product);
		ModelAndView mav =new ModelAndView("redirect:listProduct?id="+product.getCategory().getId());
		return mav;
	}
	@RequestMapping("updateProduct")
	public ModelAndView updateProduct(Product product) {
		productService.update(product);
		ModelAndView mav =new ModelAndView("redirect:listProduct?id="+product.getCategory().getId());
		return mav;
	}
	@RequestMapping("editProduct")
	public ModelAndView editProduct(Product product) {
		Product p =productService.get(product.getId());
		ModelAndView mav = new ModelAndView("editProduct");
		mav.addObject("p",p);
		return mav;
	}
}
