package com.hiya.dp.javaee.intercepting;

public class FilterManager
{
    FilterChain filterChain;

    public FilterManager(ITarget target)
    {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter)
    {
        filterChain.addFilter(filter);
    }

    public void sendRequest(String request)
    {
        filterChain.execute(request);
    }
}
