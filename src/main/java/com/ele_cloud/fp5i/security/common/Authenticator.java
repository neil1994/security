package com.ele_cloud.fp5i.security.common;

public interface Authenticator {
	
	public  String buildToken(String id, String issuer, String subject, long ttlMillis);
	
	public  boolean Authenticate(String token);
	


}
