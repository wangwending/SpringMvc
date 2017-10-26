package com.wwd.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
		* ClassName: ServletUtil <br/>
		* Function: Servlet工具类. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@WebServlet("/servletUtils")
public class ServletUtil extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static Logger log = LoggerFactory.getLogger(ServletUtil.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = req.getServletContext();
		WebApplicationContext webContext = WebApplicationContextUtils.getWebApplicationContext(sc);
		String webContextString = webContext.toString();
		log.info("Web Container info : {}", webContextString);
//		WebApplicationContext subContextString = RequestContextUtils.getWebApplicationContext(req);
//		System.out.println(subContextString);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
