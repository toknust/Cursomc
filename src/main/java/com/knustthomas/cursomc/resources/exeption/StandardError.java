package com.knustthomas.cursomc.resources.exeption;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String msg;
	private Integer status;
	private Long timeStamp;
	
	public StandardError(String msg, Integer status, Long timeStamp) {
		super();
		this.msg = msg;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	
	public Long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
