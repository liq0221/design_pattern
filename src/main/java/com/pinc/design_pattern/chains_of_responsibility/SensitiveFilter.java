package com.pinc.design_pattern.chains_of_responsibility;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replace("傻瓜","笨蛋") + " sensitiveFilter()";
        chain.doFilter(request,response);
        response.str += "--sensitiveFilter()";
    }
}
