package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/welcome")
public class LoginFilter implements Filter {

	public void destroy() {	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uid = request.getParameter("txt_uid");
		String pwd = request.getParameter("txt_pwd");
		
		if(uid.equals("admin") && pwd.equals("123"))
			chain.doFilter(request, response);
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=font-size:18px;color:yellow;text-align:center>Invalid User Name/ Password</p>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);			
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}
