package com.lgo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import com.jdbcconnection.JDBCconnection;
import com.login.Logindetails;
import com.loginuser.Loginentry;

public class CRUD {

	public boolean InsertLogindetails(Logindetails emp)
	 {
		String sql="insert into usersheet(uniquecode,empid,intime,indate) values(?,?,current_time,current_date);";
		 try
		 {
			PreparedStatement sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1, emp.getUniqcode());
			sts.setString(2,emp.getEmpid());
			 
		//	sts.setInt(3,s.getIntime());
			return sts.executeUpdate()>0;
		} 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		}
		 return false;
	 }
	
	
	public boolean InsertLogoutdetails(String uniqueCode)
	 {
		String sql="update usersheet set outtime=current_time(),outdate=current_date() where uniquecode=?";
		 try
		 {
			PreparedStatement sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1, uniqueCode);
			
			 
		//	sts.setInt(3,s.getIntime());
			return sts.executeUpdate()>0;
		} 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		}
		 return false;
	 }
	
	public String getUniqueCode() {
		String uniqueCode=UUID.randomUUID().toString();
		String sql="select EXISTS(select uniquecode from usersheet where uniquecode=?)as status";
		 try
		 {
			int currentUniqueCode = 0;
			PreparedStatement sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1, uniqueCode);
			if(sts.executeQuery()!=null) {
				ResultSet rs=sts.executeQuery();
				
				while(rs.next()) {
					currentUniqueCode=rs.getInt("Status");
//					System.out.println(currentUniqueCode);
				}
				if(currentUniqueCode==1) {
					getUniqueCode();
				}
			}
			
			 
		//	sts.setInt(3,s.getIntime());
			
		} 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		}
		 
		 return uniqueCode;
		
	}
	public boolean isUser(String empid) {
		String sql="select EXISTS(select empid from users where empid=?)as status;";
		 try
		 {
			PreparedStatement sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1, empid);
			byte status=0;
			 ResultSet record=sts.executeQuery();
			 while(record.next()) {
				 status=(byte)record.getInt("status");
			 }
			 if(status==1) {
				 return true;
			 }
		//	sts.setInt(3,s.getIntime());
			
		} 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		}
		 return false;
	 }
	
	public boolean register(String empid,String username) {
		String sql="insert into users values(?,?);";
		PreparedStatement sts;
		try {
			sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1, empid);
			sts.setString(2, username);
			return sts.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	}


