package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.DataCall;

/**
 * Servlet implementation class CreateTeacher
 */
@WebServlet("/CreateTeacher")
public class CreateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataCall model=new DataCall();
		
		String firstName=(String)(request.getParameter("firstname"));
		String lastName=(String)(request.getParameter("lastname"));
		long mobile=Long.parseLong((String)request.getParameter("mobile"));
       
		
	   model.addTeacher(firstName, lastName, mobile);
	    
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body><b>Successfully Inserted </b></body></html>");
	}

}
