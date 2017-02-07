package com.ele_cloud.fp5i.security.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

/**
 * dubbo 过滤器配置
 * User : zhiyong.li
 * Date : 2017/1/10
 * Time : 11:20
 */
public class ControllFilter implements ContainerResponseFilter {

    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        if (containerRequestContext.getMethod().equals("OPTIONS")) {
            containerResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
            containerResponseContext.getHeaders().add("Access-Control-Allow-Headers", "Content-Type,x-requested-with,Authorization,Access-Control-Allow-Origin");
            containerResponseContext.getHeaders().add("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
            containerResponseContext.getHeaders().add("Access-Control-Max-Age" ,"360");
        }
    }
}