package com.Lthan.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.Lithan.users.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class LoginUserAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1576051092207034216L;
	private String uemail;
	private String pword;
	private SessionMap<String,Object> sessionMap;
	
	
	
	public String getUemail() {
		return uemail;
	}


	public void setUemail(String uemail) {
		this.uemail = uemail;
	}


	public String getPword() {
		return pword;
	}


	public void setPword(String pword) {
		this.pword = pword;
	}


	public void setSession(Map<String, Object> map) {  
	    this.sessionMap=(SessionMap)map;  
	}  
	
	
	public String execute() throws SQLException, Exception
	{   
	
	if(uemail != null) {
		Admin dao = new Admin();
		boolean check = dao.loginCheck(uemail,pword);
		
		
		if(check == true)
		{
			String  messages = "Login is successfull";
			
		   
		}
		else {
			String messages = "Please Enter Valid Username and pword";
			return "LoginAgain";
		}
		 sessionMap.put("login","true");  
		 sessionMap.put("uemail",uemail);  
	}
	return "Logged";
	}
	
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "logout";  
	}  
   
	
	}
	

