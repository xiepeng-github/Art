package com.xp.art.response;

public class ArtCommonResult<T> {
	
	//错误码
	private String code;
	
	//错误信息
	private String msg;
	
	//具体内容
	private T result;
	
	public ArtCommonResult(String code, String msg, T result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	
	public ArtCommonResult(String msg, T result) {
		this("0", msg, result);
	}
	
	public ArtCommonResult(String msg) {
		this("0", msg, null);
	}
	
	public ArtCommonResult(T result) {
		this("0", "success", result);
	}
	
	public ArtCommonResult() {
		this("0", "success", null); 
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
}
