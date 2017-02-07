package com.ele_cloud.fp5i.security.common;

import com.alibaba.dubbo.rpc.RpcContext;

import javax.servlet.http.HttpServletResponse;

/**
 * 跨域工具类
 * User : zhiyong.li
 * Date : 2017/1/10
 * Time : 14:58
 */
public class CorsFilterUtil {
    /**
     * 设置跨域的头信息
     */
   public static  void setHttpHeader(){
       if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
           RpcContext.getContext().getResponse(HttpServletResponse.class).addHeader("Access-Control-Allow-Origin","*");
       }
   }
}
