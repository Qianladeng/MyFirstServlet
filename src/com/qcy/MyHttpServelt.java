package com.qcy;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServelt extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// �� ��ǿ��ת��
		try {
			HttpServletRequest hreq = (HttpServletRequest) req;
			HttpServletResponse hres = (HttpServletResponse) res;
			this.service(hreq, hres);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void service(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException, IOException{
		
		String method=hreq.getMethod();
		if(method.equalsIgnoreCase("GET")){
			doGet(hreq,hres);
		}else if (method.equalsIgnoreCase("POST")){
			doPost(hreq,hres);
		}
	}

	// �������� ������Ա�����
	protected void doPost(HttpServletRequest hreq, HttpServletResponse hres) throws ServletException, IOException{
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest hreq, HttpServletResponse hres) throws ServletException, IOException{
		// TODO Auto-generated method stub
	}

}
