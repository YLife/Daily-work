package com.yl.vo;
/**
 * 封装条件信息
 * @author Mr.Yang
 *
 */
public class TrainInfoVo {
	private String begin;
	private String end;
	private int type;
	public TrainInfoVo() {
		super();
	}
	public TrainInfoVo(String begin, String end, int type) {
		super();
		this.begin = begin;
		this.end = end;
		this.type = type;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
