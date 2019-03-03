package com.xp.art.log4j2.foo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2TestFoo {
	
    private static final Logger logger = LogManager.getLogger(Log4j2TestFoo.class);
    
    public void doFoo() {
    	
    	logger.info("Log4j2TestFoo.doFoo() begin");
    	
    	try {
    		String [] strArray = new String [3];
    		String c= strArray[3];
    	} catch(Exception e) {
    		logger.warn("Log4j2TestFoo.doFoo() Warning: " + e.toString());
    	} finally {
    		logger.info("Log4j2TestFoo.doFoo() end");
    	}
    }
}
