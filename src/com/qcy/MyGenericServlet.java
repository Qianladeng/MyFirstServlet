package com.qcy;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet {

	private ServletConfig config;

	// ①
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	// ②
	public ServletConfig getServletConfig() {
		return this.config;
	}

	// 抽象方法,类也必须是抽象类
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	// 没用的往后面甩
	public void destroy() {	}
	public String getServletInfo() {return null;}
}
