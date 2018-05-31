package com.xp.art.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xp.art.exception.ArtException;
import com.xp.art.response.ArtCommonResult;

@Controller
@RequestMapping("/")
public class WebSocketController {


	@RequestMapping("websocket")
	public String websocket() {
		return "websocket";
	}
	
}
