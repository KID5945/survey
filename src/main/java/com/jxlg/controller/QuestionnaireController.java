package com.jxlg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jxlg.entity.Problem;
import com.jxlg.entity.Questionnaire;
import com.jxlg.service.impl.ProblemServiceImpl;
import com.jxlg.service.impl.QapServiceImpl;
import com.jxlg.service.impl.QuestionnaireserviceImpl;
import com.jxlg.utils.ResultHelper;

@Controller
@RequestMapping("questionnaire")
public class QuestionnaireController {
	
	@Autowired
	private QuestionnaireserviceImpl questionnaireserviceImpl;
	@Autowired
	private ProblemServiceImpl problemServiceImpl;
	@Autowired
	private QapServiceImpl qapServiceImpl;
	
	@RequestMapping("index")
	@ResponseBody
	public ModelAndView online_web(Questionnaire questionnaire,String openId,HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("12356");
		List<Questionnaire> questionnairelist = questionnaireserviceImpl.findQuestionnaire(questionnaire);
		Questionnaire qnaire = questionnairelist.get(0);
		
		List<Problem> problemList  = problemServiceImpl.findProblemList(qnaire.getQid());
		
		List<Integer> qaids = new ArrayList<Integer>();
		for (Problem problem : problemList) {
			
			Integer qaid = qapServiceImpl.findQaid(qnaire.getQid(), problem.getPid())[0];
			qaids.add(qaid);
		}
		
		modelAndView.addObject("problemList", problemList);
		modelAndView.addObject("listSize", problemList==null?0:problemList.size());
		modelAndView.addObject("questionnaire", qnaire);
		modelAndView.addObject("qaids", qaids);
		modelAndView.addObject("openId", StringUtils.isEmpty(openId)?"0":openId);
		
		modelAndView.setViewName("questionnaireIndex");
		return modelAndView;
	}

	
	@RequestMapping("nametest")
	@ResponseBody
	public ModelAndView nametest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("12356");
		modelAndView.setViewName("nametest");
		return modelAndView;
	}

	
}
