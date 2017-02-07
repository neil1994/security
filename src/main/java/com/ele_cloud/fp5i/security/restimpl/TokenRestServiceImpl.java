package com.ele_cloud.fp5i.security.restimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ele_cloud.fp5i.security.common.JsonResponseStatus;
import com.ele_cloud.fp5i.security.facade.TokenRestService;
import com.ele_cloud.fp5i.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("token")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service  // dubbo annotation ,scan to inject,must have!!
public class TokenRestServiceImpl implements TokenRestService{
	
	@Autowired
	private TokenService tokenService;

	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	@GET
	@Path("authenticate/{token}")
	@Override
	public JsonResponseStatus TokenAuthenticate(@PathParam("token")String token) {
		boolean bool = tokenService.AuthenticateToken(token);
		if (bool){
		return 	new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS, "tokenAuthenticate");
		}
		return  new JsonResponseStatus(JsonResponseStatus.Status.FAILURE, "tokenAuthenticate");
		
	}
	
	
	
	

}
