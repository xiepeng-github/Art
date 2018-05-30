package com.xp.art.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xp.art.bean.ArtBean;
import com.xp.art.response.ArtCommonResult;
import com.xp.art.service.ArtService;

@Controller
@RequestMapping("/")
public class ArtController {
	
	@Autowired
	private ArtService artService;
	
	@RequestMapping("/register")
	public String registerArtPage() {
		return "registerArt";
	}
	
	@RequestMapping("/doRegister")
	@ResponseBody
	public ArtCommonResult registerArtResult(@Valid ArtBean artBean) throws Exception {
		ArtCommonResult artCommonResult = new ArtCommonResult();
		artService.registerArt(artBean);
		return artCommonResult;
	}
}
