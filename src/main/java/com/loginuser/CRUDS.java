package com.loginuser;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcconnection.JDBCconnection;
import com.login.Logindetails;
public class CRUDS {

	public boolean InsertLoginentry(Logindetails al)
	 {
		String sql="insert into usersheet(uniqcode,empid,intime,indate) values(?,?,current_time(),current_date());";
		 try
		 {
			PreparedStatement sts = JDBCconnection.getconnect().prepareStatement(sql);
			sts.setString(1,al.getUniqcode());
			sts.setString(2,al.getEmpid());
			
			return sts.executeUpdate()>0;
		} 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		}
		 return false;
	 }

}

