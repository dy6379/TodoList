package webapp.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

//필터를 거치는 주소(.do로 끝나는 모든 요청)
@WebFilter("*.do") 
public class LoginRequiredFilter implements Filter {

	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain) throws IOException, ServletException {
		// 요청시 필터
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		if(request.getSession().getAttribute("name") !=null) {
			chain.doFilter(servletrequest, servletresponse);
		} else {
			// 요청시 로그인 상태가 아니면 요청주소를 login.do로 보낸다
			request.getRequestDispatcher("login.do").forward(servletrequest, servletresponse);
		}
		// 응답시 필터
	}

}