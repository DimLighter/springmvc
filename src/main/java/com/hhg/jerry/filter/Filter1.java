package com.hhg.jerry.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lining on 2018/9/13.
 */
public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(this.getClass().getSimpleName() + " " + new Exception().getStackTrace()[0].getMethodName() + " init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(this.getClass().getSimpleName() + " " + new Exception().getStackTrace()[0].getMethodName() + " before filter");
        chain.doFilter(request, response);
        System.out.println(this.getClass().getSimpleName() + " " + new Exception().getStackTrace()[0].getMethodName() + " after filter");
    }

    @Override
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " " + new Exception().getStackTrace()[0].getMethodName() + " destroy");
    }
}
