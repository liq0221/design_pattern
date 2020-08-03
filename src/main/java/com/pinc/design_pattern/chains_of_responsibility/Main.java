package com.pinc.design_pattern.chains_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "<font>大家好</font>,我是傻瓜计算机。";
        Response response = new Response();
        response.str = "response";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request,response);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}
