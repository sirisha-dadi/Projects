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
import com.model.Class_sub_Teacher;

/**
 * Servlet implementation class viewSubjects
 */
@WebServlet("/viewSubjects")
public class viewSubjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewSubjects() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataCall model=new DataCall();
	    List list=null;
	   // int str=(int)request.getAttribute("id");
	    
	   int id=Integer.parseInt(request.getParameter("id"));
	    request.setAttribute("classid", id);
	    list=model.viewSubjects(id);
	    System.out.println(list.size());
	    System.out.println(id);
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rs = null;
        rs = request.getRequestDispatcher("viewSubjects.jsp");
	    request.setAttribute("list", list);
	    rs.forward(request, response);
	}

}
