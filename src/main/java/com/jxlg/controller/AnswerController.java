package com.jxlg.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jxlg.entity.Useranswer;
import com.jxlg.entity.UseranswersQueryVO;
import com.jxlg.service.impl.UseranswerServiceImpl;

@Controller
@RequestMapping("answer")
public class AnswerController {
	

	@Autowired
	private UseranswerServiceImpl useranswerServiceImpl;
	
	@RequestMapping("save")
	@ResponseBody
	public ModelAndView save(UseranswersQueryVO queryVO,HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("answer----save");
		for (Useranswer useranswer : queryVO.getAnswerList()) {
			useranswer.setCreatetime(new Date());
			useranswerServiceImpl.addUseranswer(useranswer);
		}
	
		modelAndView.addObject("over", "success");
		modelAndView.setViewName("index");
		
		return modelAndView;
	}

	
}
