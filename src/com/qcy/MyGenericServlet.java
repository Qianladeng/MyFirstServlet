package com.qcy;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet {

	private ServletConfig config;

	// ��
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	// ��
	public ServletConfig getServletConfig() {
		return this.config;
	}

	// ���󷽷�,��Ҳ�����ǳ�����
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	// û�õ�������˦
	public void destroy() {	}
	public String getServletInfo() {return null;}
}
