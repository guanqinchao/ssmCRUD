package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.java.pojo.Category;
import com.java.service.CategoryService;
import com.java.util.Page;

//����spring mvc ����һ����������
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {
		/*ModelAndView mav = new ModelAndView();
		 PageHelper.offsetPage(page.getStart(),5);
	 	List<Category> cs = categoryService.list();
		int total = categoryService.total(); 
	 	int total = (int) new PageInfo<>(cs).getTotal();*/
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list(page);
		int total = categoryService.total();
		page.caculateLast(total);
		// ����ת������
		mav.addObject("cs", cs);
		// ����jsp·��
		mav.setViewName("listCategory");
		return mav;

	}
	@RequestMapping("addCategory")
	    public ModelAndView addCategory(Category category) throws Exception {
		categoryService.add(category);    
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
	        return mav;
	    }
	@RequestMapping("deleteCategory")
    public ModelAndView deleteCategory(Category category) throws Exception {
	categoryService.delete(category);    
	ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }
	@RequestMapping("updateCategory")
    public ModelAndView updateCategory(Category category) throws Exception {
	categoryService.update(category);    
	ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category){
		Category c= categoryService.get(category.getId());
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}
}