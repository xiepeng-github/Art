package com.xp.art.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.websocket.Session;

public class WebSocketUtil {
	
	//多个线程可见
	volatile public static int onlineClientCount;
	
	private Lock reentrantLock = new ReentrantLock();
	
	public static Map<String, Session> clientsMap = new ConcurrentHashMap<String, Session>();
	
	/*
    public static int getOnlineCount() {
    	reentrantLock.lock
        return onlineCount;
    }

    public static void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }*/	
	
}
