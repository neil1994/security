package com.ele_cloud.fp5i.security.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//import com.alibaba.dubbo.common.io.Bytes;

public class EncryptUtil {
	
	public static String encodeHex(byte[] bytes) {
		StringBuffer buffer = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			if (((int) bytes[i] & 0xff) < 0x10)
				buffer.append("0");
			buffer.append(Long.toString((int) bytes[i] & 0xff, 16));
		}
		return buffer.toString();
	}
	
	public static String encodeMd5(String source) {
		return encodeMd5(source.getBytes());
	}
	
	public static String encodeMd5(byte[] source) {
		try {
			return encodeHex(MessageDigest.getInstance("MD5").digest(source));
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
	}
	/*
	public static String encodeBase64(String source) {
		return Bytes.bytes2base64(source.getBytes());
	}

	public static String decodeBase64(String source) {
	    return new String(Bytes.base642bytes(source));
	}
	*/
	//private Coder() {}
	/*
	public static byte[] encryptMD5(byte[] data) throws Exception {  
		  
			if(data.length==0){
				throw new Exception("no data for encrption");
			}
		   MessageDigest md5 = MessageDigest.getInstance("MD5");  
		   md5.update(data);  
		  
		   return md5.digest();  
		  
	}  
*/

}
