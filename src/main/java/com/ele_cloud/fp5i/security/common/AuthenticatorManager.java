package com.ele_cloud.fp5i.security.common;

public class AuthenticatorManager {
	
	private static final Authenticator jwtAuthenticator= new JWTAuthenticator() ;//thread-safe singleton
	
	static public Authenticator getInstance(String type){
		
		if(type=="JWT"){
	      
			 return  jwtAuthenticator;		
	    }
        return null;
	}
}
