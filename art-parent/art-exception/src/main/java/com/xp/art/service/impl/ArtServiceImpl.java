package com.xp.art.service.impl;

import org.springframework.stereotype.Service;

import com.xp.art.bean.ArtBean;
import com.xp.art.exception.ArtException;
import com.xp.art.service.ArtService;

@Service("artService")
public class ArtServiceImpl implements ArtService {

	@Override
	public void registerArt(ArtBean artBean) throws Exception {
		
		if(artBean.getCountry().contains("_")) {
			throw new ArtException("301","国家不允许包含下划线");
		}else if(artBean.getCountry().contains("$")) {
			throw new RuntimeException();
		}else if(artBean.getCountry().contains("#")) {
			throw new Exception();
		}

	}

}
