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
 * Servlet implementation class TeacherList
 */
@WebServlet("/TeacherList")
public class TeacherList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataCall model=new DataCall();
	    List list=null;
	    list=model.getAllTeachers();
	    System.out.println(list.size());
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rs = null;
        rs = request.getRequestDispatcher("teacherlist.jsp");
	    request.setAttribute("list", list);
	    rs.forward(request, response);
	    
	}

}
