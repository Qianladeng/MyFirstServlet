package com.qcy;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
 	

@WebServlet("/MyServlet")
public class MyServlet extends MyGenericServlet{
	
			
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletContext context=getServletConfig().getServletContext();

		//接收服务器信息 
		String username_web=req.getParameter("username(web)");
		String psw_web=req.getParameter("password(web)");
		
		//我的表单信息
		Properties properties=new Properties();
		String popFileRealPath=context.getRealPath("info.properties");
		properties.load(new FileReader(popFileRealPath));
		
		String user_sql=properties.getProperty("user");
		String psw_sql = properties.getProperty("psw");
		
		//判断
		if(username_web.equals(user_sql) && psw_web.equals(psw_sql)) {
			res.getWriter().println("True");
		}else{
			res.getWriter().println("False");
			res.getWriter().println("Account : admin");
			res.getWriter().println("Password : 123456");
		}
	}
	

}
