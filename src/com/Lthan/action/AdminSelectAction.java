package com.Lthan.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.Lithan.users.Admin;
import com.Lithan.users.UserPojo;

public class AdminSelectAction {

	ResultSet rs = null;
	UserPojo bean = null;
	private boolean noData = false;
	ArrayList<UserPojo> beanList = null;
	Admin admin = new Admin();
	
	public ArrayList<UserPojo> getBeanList() {
		return beanList;
	}

	public void setBeanList(ArrayList<UserPojo> beanList) {
		this.beanList = beanList;
	}

	public String execute() throws Exception {
		
		rs = admin.viewUsers();
		int i = 0;
		beanList = new ArrayList<UserPojo>();
		if (rs != null) {
			while (rs.next()) {
				i++;
				bean = new UserPojo();
				bean.setUfname(rs.getString("ufname"));
				bean.setUlname(rs.getString("ulname"));
				bean.setUemail(rs.getString("uemail"));
				bean.setUnum(rs.getString("unum"));
				bean.setPword(rs.getString("pword"));
				bean.setCountry(rs.getString("country"));
				beanList.add(bean);
			}

			if (i == 0) {
				setNoData(false);
			} else {
				setNoData(true);
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
