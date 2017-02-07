package com.ele_cloud.fp5i.security.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ele_cloud.fp5i.security.common.Authenticator;
import com.ele_cloud.fp5i.security.common.AuthenticatorManager;

@Service
public class TokenService {
	
	private static final Logger logger = LogManager.getLogger(TokenService.class);
	
	public boolean AuthenticateToken(String token){
		
		if(token==null){
			
			logger.error("No Token info passed in");
			return false;
		}
		
		  
	    Authenticator au=AuthenticatorManager.getInstance("JWT");
	    return au.Authenticate(token);
		
	
		
	}

}
