package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/*")
public class MaintenanceFilter implements Filter {

	public void destroy() {	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			PrintWriter out = response.getWriter();
			out.println("<p style=font-size:38px;color:red;margin-top:100px;text-align:center>");
			out.println("Server under Maintenance!!!<br><br>");
			out.println("Please Try After Some Time!!!!</p>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}
