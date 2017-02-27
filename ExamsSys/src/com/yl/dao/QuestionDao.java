package com.yl.dao;

import java.util.List;

import com.yl.entity.Question;
import com.yl.vo.QuestionVo;

public interface QuestionDao {
	/**
	 * 分页查询试题信息
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return
	 */
	List<Question> queryQuestion(Integer currentPage , Integer pageSize , QuestionVo vo);
	
	/**
	 * 通过id查询试题
	 * @param id
	 * @return
	 */
	Question queryById(Integer id);
	
	/**
	 * 更新试题
	 * @param question
	 */
	void saveOrUpdateQuestion(Question question);
	
	/**
	 * 删除指定编号的试题
	 * @param id
	 */
	void removeQuestion(Integer id);
	
	/**
	 * 获取记录总条数
	 * @param vo
	 * @return
	 */
	int getCount(QuestionVo vo);
}
