package com.ele_cloud.fp5i.security.filter;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.*;

import javax.servlet.http.HttpServletResponse;

/**
 * 跨域过滤器配置
 * User : zhiyong.li
 * Date : 2017/1/9
 * Time : 16:06
 */
public class SimpleCORSFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleCORSFilter.class);

    private  ControllFilter controllFilter;

    private void setControllFilter(ControllFilter controllFilter){
        this.controllFilter=controllFilter;
    }

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        Result result = invoker.invoke(invocation);
        LOGGER.debug("dubbo过滤器设置");
        if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
            RpcContext.getContext().getResponse(HttpServletResponse.class).addHeader("Access-Control-Allow-Origin","*");
            return new RpcResult();
        }
        return result;
    }
}
