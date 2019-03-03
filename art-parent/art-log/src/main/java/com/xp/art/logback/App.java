package com.xp.art.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for(int i=0; i<150000; i++) {
        	logger.info(i + ": Hello World Again!");
        }
    }
}
