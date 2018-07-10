package bupt.websocket.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns={"/*"})
public class DispatcherFilter implements Filter {

	private Logger logger = Logger.getLogger(DispatcherFilter.class);
	
	public void destroy() {
		// Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		// Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) arg0;
		logger.info("Request URL: " + request.getRequestURL());
		chain.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// Auto-generated method stub

	}

}
