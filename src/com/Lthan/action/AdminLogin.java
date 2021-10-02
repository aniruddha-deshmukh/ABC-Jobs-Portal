package com.Lthan.action;

import java.sql.SQLException;
	import java.util.Map;

	import org.apache.struts2.dispatcher.SessionMap;
	import org.apache.struts2.interceptor.SessionAware;

import com.Lithan.users.Admin;
import com.opensymphony.xwork2.ActionSupport;

	public class AdminLogin extends ActionSupport implements SessionAware{

		private static final long serialVersionUID = -3353507406394033775L;
		private String email;
		private String password;
		private SessionMap<String,Object> sessionMap;
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public void setSession(Map<String, Object> map) {  
		    this.sessionMap=(SessionMap<String, Object>)map;  
		}  
		
		
		public String execute() throws SQLException, Exception
		{   
		
		if(email != null) {
			sessionMap.put("login","true");  
			 sessionMap.put("Email",email);  
			Admin bao = new Admin();
			boolean check = bao.adminLogin(email, password);
			
			
			if(check == true)
			{
				String  messages = "Login is successfull";
			
				return "success";
			   
			}
			else {
				String messages = "Please Enter Valid Username and Password";
				
			}
			 
		}
		
		return "success";
		}
		
		public String logout(){  
		    if(sessionMap!=null){  
		        sessionMap.invalidate();  
		        
		    }  
		    return "logout";  
		}  
	   
		
		}
		

