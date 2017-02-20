package com.yl.biz;

import java.util.List;

import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

/**
 * ҵ���ӿ�
 * @author Mr.Yang
 *
 */
public interface TrainInfoBiz {
	/**
	 * ��ҳ��ѯ
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return ������Ϣ���󼯺�
	 */
	List<TrainInfo> findAll(int currentPage , int pageSize , TrainInfoVo vo);
	
	/**
	 * ͨ�����β�ѯ
	 * @param trainNo
	 * @return
	 */
	TrainInfo findById(String trainNo);
	
	/**
	 * ��ӳ�����Ϣ
	 * @param entity
	 * @return
	 */
	int save(TrainInfo entity);
	
	/**
	 * ɾ��������Ϣ
	 * @param entity
	 * @return
	 */
	int del(String trainNo);
	
	/**
	 * ���³�����Ϣ
	 * @param entity
	 * @return
	 */
	int update(TrainInfo entity);
	
	/**
	 * ��ȡ��ҳ��
	 * @param pageSize
	 * @param vo
	 * @return ��ҳ��
	 */
	int getTotalPage(int pageSize , TrainInfoVo vo);
}
