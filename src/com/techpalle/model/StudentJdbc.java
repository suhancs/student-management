package com.techpalle.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;
import com.techpalle.Dao.AccessData;

public class StudentJdbc {
	static Connection con=null;
	static Statement s= null;
	static PreparedStatement ps = null;
	static ResultSet rs=null;
	
	public static String url ="jdbc:mysql://localhost:3306/project";
	public static String username="root";
	public static String dbpassword="admin";
	
	public static void inserting(AccessData a) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url,username,dbpassword);
			 ps=con.prepareStatement("insert into students(name,email,password,states) values(?,?,?,?)");
			 ps.setString(1, a.getName());
			 ps.setString(2, a.getEmail());
			 ps.setString(3, a.getPassword());
			 ps.setString(4, a.getStates());
			 ps.executeUpdate();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
			finally
			{
				try
				{
					if(ps!= null)
					{
						ps.close();
					}
					if(con!= null)
					{
						con.close();
					}
				}
					catch(SQLException e1)
					{
						e1.printStackTrace();
					}
				}
		}
	
	public static boolean validateData(String email,String password) 
	{
		boolean b=false;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(url,username,dbpassword);
		 ps= con.prepareStatement("select email,password from students where email=? and password=?");
		 ps.setString(1, email);
		 ps.setString(2, password);
		 rs=ps.executeQuery();
		 b=rs.next();
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	} 
	catch (SQLException e) {
		e.printStackTrace();
	}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(ps!= null)
				{
					ps.close();
				}
				if(con!= null)
				{
					con.close();
				}
			}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
	return b;
	}
	}

