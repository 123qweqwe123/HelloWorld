package com.bdcor.pip.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author <a href="mailto:shao.gq@gener-tech.com">ShaoGuoqing</a>
 * @version 1.0
 */
@SuppressWarnings("unchecked") 
public class JqgridResponseContext {
    protected static ThreadLocal<JqgridResponse> localResponse = new ThreadLocal<JqgridResponse>();

    private JqgridResponseContext() {

    }

    public static <T> JqgridResponse<T> getJqgridResponse() {
        JqgridResponse<T> jqgridResponse = localResponse.get();
        if (jqgridResponse == null) {
            jqgridResponse = new JqgridResponse<T>();
        }
        localResponse.remove();
        return jqgridResponse;
    }

    public static <T> JqgridResponse<T> getJqgridResponse(List<T> rows) {
        if(rows.size()==0){
            return new JqgridResponse<T>();
        }
        JqgridResponse<T> jqgridResponse = (JqgridResponse<T>) getJqgridResponse();
        return jqgridResponse.setRows(rows);
    }

}
