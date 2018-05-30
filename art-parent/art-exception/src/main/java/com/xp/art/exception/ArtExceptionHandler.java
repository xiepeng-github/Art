package com.xp.art.exception;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xp.art.response.ArtCommonResult;
import com.xp.art.util.ArtCommonResultUtil;

@ControllerAdvice
@ResponseBody
public class ArtExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(value = BindException.class)
	public ArtCommonResult bindException(Exception e, HttpSession session) {
			
		return ArtCommonResultUtil.error("100", "[校验异常]:"+e.getMessage());			
		
	}	
	
	@ExceptionHandler(value = Exception.class)
	public ArtCommonResult exception(Exception e, HttpSession session) {
		
		return ArtCommonResultUtil.error("200","[系统异常]:" + e.getMessage());
	}
	
	@ExceptionHandler(value = RuntimeException.class)
	public ArtCommonResult runtimeException(RuntimeException e, HttpSession session) {
		
		if(e instanceof ArtException) {
			ArtException artException = (ArtException) e;
            return ArtCommonResultUtil.error(artException.getCode(),artException.getMessage());			
		}else {
			//将系统异常以打印出来
            logger.error("[系统运行时异常]{}",e);
            return ArtCommonResultUtil.error("-1","未知运行时异常");			
		}		
	}	
}
