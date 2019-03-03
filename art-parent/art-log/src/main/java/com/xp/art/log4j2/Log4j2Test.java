package com.xp.art.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xp.art.log4j2.bar.Log4j2TestBar;
import com.xp.art.log4j2.foo.Log4j2TestFoo;

public class Log4j2Test {

    static final Logger logger = LogManager.getLogger(Log4j2Test.class);
    
    public static void main(String [] args) {
    	 
        // Set up a simple configuration that logs on the console.
 
        logger.info("Log4j2Test begin");
        Log4j2TestBar bar = new Log4j2TestBar();
        Log4j2TestFoo foo = new Log4j2TestFoo();
        
        for(int i=0; i<15000; i++) {
	        logger.trace("Log4j2Test bar.doBar()");
	        bar.doBar();
	        logger.trace("Log4j2Test foo.doFoo()");
	        foo.doFoo();
        }

        logger.info("Log4j2Test end");
    }
}
