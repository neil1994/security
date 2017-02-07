package com.ele_cloud.fp5i.security.common;


public class JsonResponseStatus {
	
	
	static public enum Status{
		SUCCESS(1),FAILURE(0);
	
	
		private int code;
		
	
		Status(int code){
			this.code=code;
		}
	
		
		
		@Override
		public String toString(){
			return String.valueOf(code);
		
		}
		
	
	}
		
	

	private Status status;
	private String message; //operation message
	private String id;  // key of db
	private String token; // return token if request login successful

	public JsonResponseStatus(){
		super();
	}
	public JsonResponseStatus(Status status,String message){
		this.status=status;
		this.message=message;
		this.setId("");
		this.setToken(null);
		
	}
	public JsonResponseStatus(Status status,String message,String id,String token){
		this.status=status;
		this.message=message;
		this.id=id;
		this.token=token;

	}
	public JsonResponseStatus(Status status,String message,String id){
		this.status=status;
		this.message=message;
		this.id=id;
		this.setToken(null);
		
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
