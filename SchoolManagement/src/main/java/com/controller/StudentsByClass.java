package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.DataCall;

/**
 * Servlet implementation class StudentsByClass
 */
@WebServlet("/StudentsByClass")
public class StudentsByClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsByClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DataCall model=new DataCall();
		    List list=null;
		    int classid=Integer.parseInt((String)request.getParameter("id"));
		    list=model.getStudentsByClass(classid);
		    System.out.println(list.size());
		    response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        RequestDispatcher rs = null;
	    rs = request.getRequestDispatcher("studentsByClass.jsp");
		    	   request.setAttribute("list", list);
		           rs.forward(request, response);
	}

}
