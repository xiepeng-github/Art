package com.xp.art.log4j2.bar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2TestBar {
	
    private static final Logger logger = LogManager.getLogger(Log4j2TestBar.class);
    
    public void doBar() {
    	
    	logger.info("Log4j2TestBar.doBar() begin");
    	
    	try {
    		float a = 1/0;
    	} catch(Exception e) {
    		logger.error("Log4j2TestBar.doBar() error: " + e.toString());
    	} finally {
    		logger.info("Log4j2TestBar.doBar() end");
    	}
    }
}
