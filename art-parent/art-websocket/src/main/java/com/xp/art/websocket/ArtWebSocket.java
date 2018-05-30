package com.xp.art.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@ServerEndpoint(value="/websocket/{userId}")
@Component
public class ArtWebSocket {
	
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    
	//连接建立成功调用的方法
	@OnOpen
	public void onOpen(@PathParam("userId") String userId, Session session) {
		
	}
	
	//连接关闭调用的方法
	@OnClose
	public void onClose(@PathParam("userId") String userId) {
		
	}
	
	//收到客户端消息后调用的方法
	@OnMessage
	public void onMessage(@PathParam("userId") String userId, String message) {

		
	}
	
	//发生错误时调用
    @OnError
    public void onError(@PathParam("userId") String userId, Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }	
}
