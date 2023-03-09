package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.techpalle.Dao.AccessData;
import com.techpalle.model.StudentJdbc;


@WebServlet("/")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String path = request.getServletPath();
		switch(path) {
		case "/login":
			getLoginPage(request,response);
			break;
			
		case "/Register":
			getRegistrationPage(request,response);
			break;
			
		case "/insert":
			getInsertPage(request,response);
			break;
			
		case "/success":
			getSuccessPage(request,response);
			break;
		
			default :
				getstartupPage(request, response);
				break;
		}
	}

	
	private void getstartupPage(HttpServletRequest request, HttpServletResponse response) 
	{
        try {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void getSuccessPage(HttpServletRequest request, HttpServletResponse response) 
	{
		String email=request.getParameter("tbmail");
		String password=request.getParameter("tbpassword");
		boolean b = StudentJdbc.validateData(email, password);
		if (b)
		{
			try 
			{
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			else
			{
				getLoginPage(request,response);
			}
		}
			


	private void getInsertPage(HttpServletRequest request, HttpServletResponse response) 
	{		
		String n=request.getParameter("tbname");
		String e=request.getParameter("tbmail");
		String p=request.getParameter("tbpassword");
		String s=request.getParameter("ddlstates");
		
		AccessData a =new AccessData(n, e, p, s);
		StudentJdbc.inserting(a);
		try
		{
			RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}


	private void getRegistrationPage(HttpServletRequest request, HttpServletResponse response) {
		try 
		{
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void getLoginPage(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
