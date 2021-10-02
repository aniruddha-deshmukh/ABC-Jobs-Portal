package com.Lthan.action;


import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.Lithan.users.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{

	private static final long serialVersionUID = -1561443970643900046L;
	
	private String ufname;
	private String ulname;
	private String unum;
	
	public String getUfname() {
		return ufname;
	}

	public void setUfname(String ufname) {
		this.ufname = ufname;
	}

	public String getUlname() {
		return ulname;
	}

	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	public String getUnum() {
		return unum;
	}

	public void setUnum(String unum) {
		this.unum = unum;
	}
	

	public String execute() throws SQLException, Exception 
	{
		HttpSession session=ServletActionContext.getRequest().getSession(false); 
		 
        if(session==null || session.getAttribute("login")==null){  
        	return "Failure";
             
        }  
        
        else 
        {
        	String Email = (String) session.getAttribute("uemail");
        	
        	Admin dao = new Admin();
        	int insert = dao.updateProfile(ufname, ulname, unum, Email);
        	String msgs;
        	if (insert > 0) 
        	{
        		msgs = "Data Successfully Updated";
        	} 
        	else
        	{
        		msgs = "Error Occured";
        	}
         } 
        		return "update";
        	
        }
	
	public String updateJsp()
	{
		return "redirect";
	}
	}

