package com.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {
	

	// get a database connection
	public static Connection getConnection() {
		Connection connection = null;
		try {
			
			
			String driverName ="oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String userName ="SYSTEM";
			String password = "admin";			
			
			Class.forName(driverName);			
			connection = DriverManager.getConnection(url,userName,password);
			
			System.out.println("connection establisted");
		} catch (ClassNotFoundException ex) {

			System.out.println("connection not establisted" + ex);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		return connection;
	}

	// close all 
	public static void closeAll(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(con!=null) {
				con.close();
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	


}
