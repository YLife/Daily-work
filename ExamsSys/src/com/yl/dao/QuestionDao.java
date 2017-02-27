package com.yl.dao;

import java.util.List;

import com.yl.entity.Question;
import com.yl.vo.QuestionVo;

public interface QuestionDao {
	/**
	 * ��ҳ��ѯ������Ϣ
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return
	 */
	List<Question> queryQuestion(Integer currentPage , Integer pageSize , QuestionVo vo);
	
	/**
	 * ͨ��id��ѯ����
	 * @param id
	 * @return
	 */
	Question queryById(Integer id);
	
	/**
	 * ��������
	 * @param question
	 */
	void saveOrUpdateQuestion(Question question);
	
	/**
	 * ɾ��ָ����ŵ�����
	 * @param id
	 */
	void removeQuestion(Integer id);
	
	/**
	 * ��ȡ��¼������
	 * @param vo
	 * @return
	 */
	int getCount(QuestionVo vo);
}
