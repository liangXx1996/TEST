/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: JwtFilter
 * Author:   hasee
 * Date:     2018/11/28 9:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baosight.filter;

import com.baosight.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/28
 * @since 1.0.0
 */
@WebFilter(filterName = "loginFilter", urlPatterns = "/cust/*")
public class JwtFilter implements Filter{

    @Autowired
    JwtHelper jwtHelper;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{

    }

    @Override
    public void doFilter(final ServletRequest servletRequest,final ServletResponse servletResponse,final FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        //等到请求头信息authorization信息
        final String authHeader = request.getHeader("Authorization");

        if (!"OPTIONS".equals(request.getMethod())) {
            String jwt = resolveToken(request);
            System.out.println("jwt:"+jwt);
            try {
                jwtHelper.validateToken(jwt);
                chain.doFilter(servletRequest, servletResponse);
            } catch (Exception e) {
                e.printStackTrace();
                response.sendError(401, e.getMessage());
            }
        } else {
            chain.doFilter(servletRequest, servletResponse);
            return;
        }
    }

        public String resolveToken (HttpServletRequest httpServletRequest){
            String bearerToken = httpServletRequest.getHeader("Authorization");
            if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("bearer;")) {
                return bearerToken.substring(7, bearerToken.length());
            }
            return null;
        }

        @Override
        public void destroy () {

        }

    }