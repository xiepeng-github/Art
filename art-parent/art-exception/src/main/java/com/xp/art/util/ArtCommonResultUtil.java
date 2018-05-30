package com.xp.art.util;

import com.xp.art.response.ArtCommonResult;

public class ArtCommonResultUtil {
	
	public static ArtCommonResult success(Object object) {
		ArtCommonResult commonresult = new ArtCommonResult();
		commonresult.setCode("0");
		commonresult.setMsg("成功");
		commonresult.setResult(object);
	    return commonresult;
	}

	public static ArtCommonResult success() {
	    return success(null);
	}
	
	public static ArtCommonResult error(String code, String msg) {
		ArtCommonResult commonresult = new ArtCommonResult();
		commonresult.setCode(code);
		commonresult.setMsg(msg);
	    return commonresult;
	}
	
	
}
