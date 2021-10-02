package com.Lthan.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.Lithan.users.Admin;
import com.Lithan.users.UserPojo;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport  {

	
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	Admin dao = new Admin();
	private boolean noData = true;
	private String profiles;
	ArrayList<UserPojo> userbean = null;
	UserPojo user = null;

	// getters & setters
	public String getProfiles() {
		return profiles;
	}

	public UserPojo getUser() {
		return user;
	}

	public void setUser(UserPojo user) {
		this.user = user;
	}

	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

	public ArrayList<UserPojo> getUserbean() {
		return userbean;
	}

	public void setUserbean(ArrayList<UserPojo> userbean) {
		this.userbean = userbean;
	}

	public String execute() throws Exception {

		if (profiles != null) {
			rs = dao.search(profiles);
			int x = 0;

			// common constructor for ArrarList
			userbean = new ArrayList<UserPojo>();
			if (rs != null) {
				while (rs.next()) {
					x++;
					user = new UserPojo();
					user.setUfname(rs.getString("ufname"));
					user.setUlname(rs.getString("ulname"));
					user.setUbasequali(rs.getString("ubasequali"));
					user.setUnum(rs.getString("unum"));
					userbean.add(user);
				}
			}

			if (x == 0) {
				noData = false;
				System.out.println("No Results Found");
			} else {
				noData = true;
				System.out.println("Search Reults Found");

			}
		}
		return "success";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}
}
