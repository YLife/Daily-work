package com.yl.dao;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.yl.dao.impl.QuestionDaoImpl;
import com.yl.entity.Answers;
import com.yl.entity.Questions;

public class QuestionTest {
	private QuestionDao dao = new QuestionDaoImpl();
	@Test
	public void test() {
		List<Questions> list = dao.queryList();
		for (Questions questions : list) {
			System.out.println(questions.getTitle() + ":" + questions.getLastModified());
		}
	}
	
	@Test
	public void test2() {
		Questions questions = dao.queryById(Integer.valueOf(1));
		Iterator it = questions.getAnswerses().iterator();
		while (it.hasNext()) {
			Answers answers = (Answers) questions.getAnswerses().iterator().next();
			System.out.println(questions.getTitle() + ":" + answers.getAnsContent());			
		}
	}

}
