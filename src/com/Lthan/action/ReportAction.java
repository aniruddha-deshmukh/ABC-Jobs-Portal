package com.Lthan.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

import com.Lithan.users.Admin;
import com.Lithan.users.UserPojo;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{


	private static final long serialVersionUID = -1853695180176999020L;
	ResultSet rs = null;
	UserPojo bean = null;
	ArrayList<UserPojo> beanList = null;
	Admin admin = new Admin();
	private boolean noData = false;
	@Override
	public String execute() throws Exception {
		
		HttpSession session=ServletActionContext.getRequest().getSession(false); 
		 
		 if(session==null || session.getAttribute("login")==null){  
		       return "Failure";
		       
		     }else{  
	            String uemail = (String) session.getAttribute("uemail");
	            beanList = new ArrayList<UserPojo>();
		        rs = admin.report(uemail);
		        int i = 0;
		        if (rs != null) {
		        while (rs.next()) {
		        i++;
		        bean = new UserPojo();
		        bean.setUfname(rs.getString("ufname"));
		        bean.setUlname(rs.getString("ulname"));
		        bean.setUemail(rs.getString("uemail"));
		        bean.setUnum(rs.getString("unum"));
		        bean.setUbasequali(rs.getString("ubasequali"));
		        beanList.add(bean);
		       }
		     }
		      if (i == 0) {
		        noData = false;
		      } else {
		        noData = true;
		      }
		        return "REPORT";  
	     }  
	}
		public boolean isNoData() {
		return noData;
		}
		public void setNoData(boolean noData) {
		this.noData = noData;
		}
		public ArrayList<UserPojo> getBeanList() {
		return beanList;
		}
		public void setBeanList(ArrayList<UserPojo> beanList) {
		this.beanList = beanList;
	}
}


