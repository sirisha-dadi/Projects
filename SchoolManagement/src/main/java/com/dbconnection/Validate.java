package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class Validate {
	
	public static Connection con=null;
	public static boolean checkUser(String username,String password) 
    {
        boolean st =false;
       
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","root");
            PreparedStatement ps = con.prepareStatement("select * from admin where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }//close of try
        catch(Exception e) {
            e.printStackTrace();
        }//close of catch
//        finally {
//        	if(con!=null)
//        	{
//        		try {
//					con.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        	}//close of if
//        }//close of finally
        return st;                 
    } 
	
	
	}

