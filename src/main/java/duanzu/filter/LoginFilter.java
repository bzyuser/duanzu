package duanzu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		//��ȡcookie
		Cookie[] cookies = request.getCookies();
		String path = request.getServletPath();
		if("/log_in.html".equals(path)) {
			chain.doFilter(request, response);
		}
		else if("/user/login.do".equals(path)) {
			chain.doFilter(request, response);
		}
		else if(cookies==null) {
			//δ��¼,�ض��򵽵�¼ҳ��
			response.sendRedirect("/cloud_node1/log_in.html");
		}
		else chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
