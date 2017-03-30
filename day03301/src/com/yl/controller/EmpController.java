package com.yl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yl.biz.EmpBiz;

@Controller
public class EmpController {
	
	private EmpBiz biz;
	
	@RequestMapping(value="/list")
	public ModelAndView queryEmps(ModelAndView mav){
		mav.addObject("list", biz.queryEmps());
		mav.setViewName("index");
		return mav;
	}

	@Autowired
	public void setBiz(EmpBiz biz) {
		this.biz = biz;
	}
}
