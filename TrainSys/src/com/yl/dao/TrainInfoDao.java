package com.yl.dao;

import java.util.List;

import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

/**
 * dao��ӿ�
 * @author Mr.Yang
 *
 */
public interface TrainInfoDao {
	/**
	 * ��ҳ��ѯ���г���
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return ���ζ��󼯺�
	 */
	List<TrainInfo> queryAll(int currentPage , int pageSize , TrainInfoVo vo);
	
	/**
	 * ͨ����Ų�ѯ����
	 * @param trainNo
	 * @return ���ζ���
	 */
	TrainInfo queryById(String trainNo);
	
	/**
	 * ��ӳ�����Ϣ
	 * @param entity
	 * @return
	 */
	int save(TrainInfo entity);
	
	/**
	 * ɾ��������Ϣ
	 * @param trainNo
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
	 * ��ѯ��¼������
	 * @param entity
	 * @return ������
	 */
	int getCount(TrainInfoVo vo);
}
