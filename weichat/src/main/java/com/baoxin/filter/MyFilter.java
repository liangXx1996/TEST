/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyFilter
 * Author:   hasee
 * Date:     2018/11/13 9:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/20
 * @since 1.0.0
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO 自动生成的方法存根

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        //防止sql注入
        Enumeration<String> params = req.getParameterNames();
        String sql = "";
        while(params.hasMoreElements()) {
            //得到参数名
            String name = params.nextElement().toString();
            //System.out.println("name:"+name+"--");
            String[] value = req.getParameterValues(name);
            for(int i=0;i<value.length;i++) {
                sql = sql+value[i];
            }
        }
        if(sqlValidate(sql)){
            throw new IOException("您发送请求的参数中含有非法字符");
        }else {
            chain.doFilter(request, response);
        }
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
    }

    private boolean sqlValidate(String str) {
        // TODO 自动生成的方法存根
        str = str.toLowerCase();//统一转为小写
        String badStr = "'|and|exec|execute|insert|select|delete|update|count|drop|*|%|chr|mid|master|truncate|" +
                "char|declare|sitename|net user|xp_cmdshell|;|or|-|+|,|like'|and|exec|execute|insert|create|drop|" +
                "table|from|grant|use|group_concat|column_name|" +
                "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|" +
                "chr|mid|master|truncate|char|declare|or|;|-|--|+|,|like|//|/|%|#";//过滤掉的sql关键字，可以手动添加
        String[] badStrs = badStr.split("\\|");
        for (int i = 0; i < badStrs.length; i++) {
            if (str.indexOf(badStrs[i]) >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void destroy() {
        // TODO 自动生成的方法存根

    }

}


