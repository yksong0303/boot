package com.boot.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("*")
public class CommonFilter implements Filter {


    public CommonFilter() {
      System.out.println("무조건 1번");
    }


	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String uri = req.getRequestURI();
		if(!uri.startsWith("/ajax")) { //해당 uri가 /ajax로 시작하는지 
			System.out.println("난 매번 호출됨 ㅅㅂ놈아 나와라좀");	
		}
		
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
	 System.out.println("난 2번째");
	}

}
