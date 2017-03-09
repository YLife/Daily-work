package com.yl.exception;

public class NameException extends Exception {
	private static final long serialVersionUID = 1L;

	public NameException() {
		super("用户名不正确");
	}
}
