package com.ele_cloud.fp5i.security.common;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.Key;

import io.jsonwebtoken.*;
import java.util.Date; 

public class JWTAuthenticator implements Authenticator {
	
	static final String APIKEY="LUKE";
	static final String TOKEN_SUBJECT="SEC";
	static final String TOKEN_ISSUER="ELE";
	private final SignatureAlgorithm signatureAlgorithm ; 
	
    private static final Logger logger = LogManager.getLogger(JWTAuthenticator.class);
	
	JWTAuthenticator(){
		
		/*
		 HS256 or RS256
		 The JWT signature algorithm we will be using to sign the token
		*/
		signatureAlgorithm = SignatureAlgorithm.HS256;
		
		
	}
	
	
	public String buildToken(String id, String issuer, String subject, long ttlMillis){
		

		
	 
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		 
		//We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(APIKEY);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
		 
		  //Let's set the JWT Claims
		JwtBuilder builder = Jwts.builder().setId(id)
		                                .setIssuedAt(now)
		                                .setSubject(subject)
		                                .setIssuer(issuer)
		                                .signWith(signatureAlgorithm, signingKey);
		 
		//if it has been specified, let's add the expiration
		if (ttlMillis >= 0) {
		    long expMillis = nowMillis + ttlMillis;
		    Date exp = new Date(expMillis);
		    builder.setExpiration(exp);
		}
		
		//Builds the JWT and serializes it to a compact, URL-safe string
		return builder.compact();
	
	}
	

	
	 public boolean Authenticate(final String token) {
	
		    Claims claims;
			if(token==null){
				return false;
			}
			
			try{
				claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(APIKEY))
						.parseClaimsJws(token).getBody();
				
				System.out.println("ID: " + claims.getId());
				System.out.println("Subject: " + claims.getSubject());
				System.out.println("Issuer: " + claims.getIssuer());
				System.out.println("Expiration: " + claims.getExpiration());
				
				if( claims.getExpiration().after(new Date(System.currentTimeMillis()) ) ){
					
					System.out.println("token is good,expire time is not reached");
					logger.info("token is good,expire time is not reached");					
				}
				else{
					
					System.out.println("token expired,this else may not enter ");
					logger.info("token expired!");	
					return false;
				}
				
				/* not checking token_subject and token issuer for now
				if(!claims.getSubject().equals(TOKEN_SUBJECT) || !claims.getIssuer().equals(TOKEN_ISSUER)){
				 
					System.out.println("token subject or issuer not matched,authentication failed");
					return false;
					
				}
				*/
				return true; //authenticate successful!
			}
			catch (MalformedJwtException e){
				e.printStackTrace();
				System.out.println("catch jwt token Malformed exception");
			}
			catch (ExpiredJwtException e){
				e.printStackTrace();
				System.out.println("catch jwt token expire exception");

			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			
			
			return false;
	}

}
