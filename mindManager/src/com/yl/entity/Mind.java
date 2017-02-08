package com.yl.entity;

import java.util.Date;

/**
 * 实体类，存放心情信息
 * @author Administrator
 *
 */
public class Mind {
	private int id;
	private String title;
	private String content;
	private Date  writeDate;
	
	public Mind() {
		super();
	}

	public Mind(int id, String title, String content, Date writeDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
}
