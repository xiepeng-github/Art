package com.xp.art.exception;

public class ArtException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1089030826435289285L;
	
	//异常码
	private String code;

	public ArtException(String message) {
		super(message);
		this.code = "300";
	}
	
	public ArtException(String code, String message) {
		super(message);
		this.code = code;
	}
	
	public ArtException(String code, Throwable t) {
		super(t);
		this.code = code;
	}
	
	public ArtException(String code, String message, Throwable t) {
		super(message, t);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}	
}
