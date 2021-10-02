package com.Lthan.action;

import com.Lithan.users.Admin;
import com.Lithan.users.UserPojo;
import com.opensymphony.xwork2.ActionSupport;

public class AdminDeleteAction extends ActionSupport {

	private static final long serialVersionUID = 7789977831340637290L;
	UserPojo bean = new UserPojo();
	Admin dao = new Admin();
	
	public UserPojo getBean() {
		return bean;
	}
	public void setBean(UserPojo bean) {
		this.bean = bean;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(bean.getUemail());
		int i = dao.deleteUserDetails(bean);
		try {
			if(i > 0) {
				System.out.println("User Data Deleted");
			}else {
				System.out.println("User Data not Deleted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}
