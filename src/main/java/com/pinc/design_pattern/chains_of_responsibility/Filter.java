package com.pinc.design_pattern.chains_of_responsibility;

public interface Filter {

    void doFilter(Request request,Response response,FilterChain chain);
}
