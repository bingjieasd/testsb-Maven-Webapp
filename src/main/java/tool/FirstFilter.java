package tool;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import biz.StudentBiz;
import entity.Student;

/**
 * Servlet Filter implementation class FirstFilter
 */
public class FirstFilter implements Filter {
    /**
     * Default constructor. 
     */
    public FirstFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) srequest;
        System.err.println("this is MyFilter,url :"+request.getRequestURI());
        chain.doFilter(srequest, sresponse);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
		BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(fConfig.getServletContext()); 
		//获取service层
		StudentBiz studentBiz = (StudentBiz) factory.getBean(StudentBiz.class);
		Student stu=studentBiz.findStudentById(1006);
		fConfig.getServletContext().setAttribute("stu", stu);
		System.err.println("过滤器----"+stu);
	}

}
