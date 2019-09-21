package com.naver.eng.appserver.business;

import org.springframework.stereotype.Service;

@Service
public class NicknameBusiness {
	public String getNickname(String id) {
		String ret = "baseball";
	
		if (id.equals("aa"))
			ret = "soccer";
		
		return ret;
	}
}
