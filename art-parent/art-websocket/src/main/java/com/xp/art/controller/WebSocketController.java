package com.xp.art.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebSocketController {

	@RequestMapping("hello")
	public void hello() throws ArithmeticException{
		int i = 1/0;
	}
}
