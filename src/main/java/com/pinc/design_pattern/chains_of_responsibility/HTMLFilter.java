package com.pinc.design_pattern.chains_of_responsibility;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replace("<font>","<font color='red'>") + " htmlFilter()";
        chain.doFilter(request,response);
        response.str += "--htmlFilter()";
    }
}
