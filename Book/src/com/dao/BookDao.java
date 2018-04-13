package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Book;
import com.util.DatabaseUtil;

public class BookDao {
	public ArrayList<Book> view() {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		ArrayList<Book> arrt = new ArrayList<>();
		try{
			con=DatabaseUtil.getConnection();
			pst=con.prepareStatement("select * from book");
			rs=pst.executeQuery();
			while(rs.next()){
				arrt.add(new Book(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
								
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			DatabaseUtil.closeAll(con, pst, rs);
		}
		return arrt;

}
	
	public ArrayList<Book> search(String name) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		ArrayList<Book> arrt = new ArrayList<>();
		try{
			con=DatabaseUtil.getConnection();
			pst=con.prepareStatement("select * from book where name=?");
			pst.setString(1, name);
			rs=pst.executeQuery();
			
			while(rs.next()){
				arrt.add(new Book(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
								
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			DatabaseUtil.closeAll(con, pst, rs);
		}
		return arrt;

}

	
	public int delete(int id) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=DatabaseUtil.getConnection();
			
			pst=con.prepareStatement("delete from book where id=?");
			pst.setInt(1, id);
			int i =pst.executeUpdate();
			
			if(i>0){
				return 1;
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			DatabaseUtil.closeAll(con, pst, rs);
		}
		return 0;

}

	
}
