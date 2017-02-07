package com.ele_cloud.fp5i.security.facade;

import com.ele_cloud.fp5i.security.common.JsonResponseStatus;

public interface TokenRestService {
	
	public JsonResponseStatus TokenAuthenticate(String token);

}
 