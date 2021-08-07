package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
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
 * Servlet implementation class CreateStudent
 */
@WebServlet("/CreateStudent")
public class CreateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataCall model=new DataCall();
		int classid=Integer.parseInt((String)(request.getParameter("classes")));
		String firstName=(String)(request.getParameter("firstname"));
		String lastName=(String)(request.getParameter("lastname"));
		String date=request.getParameter("dob");
        System.out.println("dateString:"+date);
        Date utilDate=null;
		try {
			utilDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   int stu= model.addStudent(firstName,lastName,utilDate,classid);
	    
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body><b> Successfully Inserted</b></body></html>");
	}

}
