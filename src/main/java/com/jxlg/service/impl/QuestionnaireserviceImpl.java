package com.jxlg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxlg.dao.QuestionnaireDao;
import com.jxlg.entity.Questionnaire;
import com.jxlg.service.IQuestionnaireService;

/**
 * 问卷表服务接口实现
 * 
 * @author feng
 * 
 */

@Service(value = "iQuestionnaireService")
public class QuestionnaireserviceImpl implements IQuestionnaireService {

	@Resource(name = "questionnaireDao")
	private QuestionnaireDao questionnaireDao;

	// 添加问卷表
	@Override
	public int addQuestionnaire(Questionnaire questionnaire) {
		System.out.println(questionnaire);
		return questionnaireDao.addQuestionnaire(questionnaire);
	}

	// 查询所有问卷表
	@Override
	public List<Questionnaire> findAllQuestionnaire() {
		return questionnaireDao.findAllQuestionnaire();
	}

	// 按条件查询问卷表
	@Override
	public List<Questionnaire> findQuestionnaire(Questionnaire questionnaire) {
		return questionnaireDao.findQuestionnaire(questionnaire);
	}

	// 更新问卷表
	@Override
	public int updateQuestionnaire(Questionnaire questionnaire) {
		return questionnaireDao.updateQuestionnaire(questionnaire);
	}

	// 通过id伤处问卷表
	@Override
	public int deleteQById(int qid) {
		return questionnaireDao.deleteQById(qid);
	}

}
