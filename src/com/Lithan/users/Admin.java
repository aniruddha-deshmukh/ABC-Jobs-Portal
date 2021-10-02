package com.Lithan.users;

import java.sql.Connection;
import java.sql.DriverManager;

import com.Lithan.users.UserPojo;
import com.Lthan.action.RegisterAction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {

	public static Connection con;
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	//	con= DriverManager.getConnection("jdbc:mysql://localhost/in0719a04h?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","IN0719A04H","b5bgcI0TM");
				con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/struts2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		return con;
	}
	public static int register(RegisterAction ra) {
		int flag = 0;
		try {
			PreparedStatement pst = getConnection().prepareStatement("INSERT INTO user_details (ufname,ulname,uemail,unum,pword,ubasequali,country) values (?,?,?,?,?,?,?)");
			pst.setString(1, ra.getUfname());
			pst.setString(2, ra.getUlname());
			pst.setString(3, ra.getUemail());
			pst.setString(4, ra.getUnum());
			pst.setString(5, ra.getPword());
			pst.setString(6, ra.getUbasequali());
			pst.setString(7, ra.getCountry());
			flag=pst.executeUpdate();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return flag;
	}


	public boolean loginCheck(String uemail, String pword) throws SQLException, Exception
	{
	boolean status = false; 
		try {
			String sqls = "Select * from user_details WHERE uemail=? and pword=?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, uemail);
			ps.setString(2, pword);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		}catch(SQLException e){
			e.printStackTrace();	
			
		}catch(Exception b){
			b.printStackTrace();
		}
		return status;
	}
	
	public ResultSet report(String uemail) throws SQLException, Exception {
	ResultSet rs = null;
		try {
			String sql = "SELECT * FROM user_details where uemail = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, uemail);
			rs = ps.executeQuery();
			return rs;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}finally {
			if (getConnection() != null) {
			getConnection().close();
			}
		}
	}

	public ResultSet reportEmail(String uemail) throws SQLException, Exception {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM user_details where uemail = ?";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, uemail);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }
	
	public boolean adminLogin(String aemail, String apword) throws Exception {
		boolean check = false;

		try {
			String sqls = "Select * from admin_details where aemail =? and apword = ?";

			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, aemail);
			ps.setString(2, apword);
			ResultSet rs = ps.executeQuery();
			check = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return check;
	}

	public int updateProfile(String ufname, String ulname, String unum, String Email) throws SQLException, Exception
	{
		int i = 0;
		try {
			String sqls = "Update user_details set ufname = ?, ulname = ?, unum = ? where uemail = ?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, ufname);
			ps.setString(2, ulname);
			ps.setString(3, unum);
			ps.setString(4, Email);
			i = ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();	
			
		}catch(Exception f){
			f.printStackTrace();	 
		}
		return i;
	}


	public int updateUserDetails(String ufname, String ulname, String unum, String ubasequali, String pword)
	throws SQLException, Exception {
	getConnection().setAutoCommit(false);
	int i = 0;
		try {
			String sql = "UPDATE user_details SET ufname=?,ulname=?,pword=? WHERE uemail=?";
			PreparedStatement ps =
			getConnection().prepareStatement(sql);
			ps.setString(1, ufname);
			ps.setString(2, ulname);
			ps.setString(3, unum);
			ps.setString(4, pword);
			ps.setString(5, ubasequali);
			i = ps.executeUpdate();
			return i;
			
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
			
		} finally {
			if (getConnection() != null) {
			getConnection().close();
			}
		}
	}
	
	public ResultSet search(String request) throws SQLException,Exception{
        ResultSet rs = null;
        try {
        	String query = "Select * from user_details where ufname like ?  or ulname like ?  or ubasequali like ? or unum like ? ORDER BY ufname ASC";
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setString(1, "%"+request+"%");
            ps.setString(2, "%"+request+"%");
            ps.setString(3, "%"+request+"%");
            ps.setString(4, "%"+request+"%");
            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if  (getConnection() != null) {
                getConnection().close();
            }
        }

        }
	
		public  ResultSet viewUsers()throws SQLException, Exception {
			ResultSet rs = null;
			try {
				String sql = "SELECT * FROM user_details ORDER BY ufname";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				rs = ps.executeQuery();
				
			} catch (Exception e) {
				e.printStackTrace();
			
			} finally {
				if (getConnection() != null) {
					getConnection().close();
				}
			}
			return rs;
	}
		
		
	
		public int deleteUserDetails(UserPojo bean) throws SQLException, Exception {
			int i = 0;
			try {
				String sql = "DELETE FROM user_details  where uemail = ?";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				ps.setString(1, bean.getUemail());
				i = ps.executeUpdate();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			} finally {
				if (getConnection() != null) {
					getConnection().close();
				}
			}
	
		}
	
}