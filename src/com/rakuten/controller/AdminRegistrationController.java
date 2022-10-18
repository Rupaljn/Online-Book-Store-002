package com.rakuten.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rakuten.dto.Admin;
import com.rakuten.execptions.DataInvalidExecption;
import com.rakuten.model.AdminModel;

/**
 * Servlet implementation class AdminRegistrationController
 */
@WebServlet("/AdminRegistrationController")
public class AdminRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminRegistrationController() {
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
    String name = request.getParameter("name");
	String emailId = request.getParameter("emailId");
	String password = request.getParameter("password");
	
	Admin ad = new Admin();
	try{
	ad.setName(name);
	ad.setEmailId(emailId);
	ad.setPassword(password);
	}
	catch(DataInvalidExecption d){
		d.printStackTrace();
		String errorMsg = d.getMessage();
		request.setAttribute("errorMsg", errorMsg);
		RequestDispatcher rd = request.getRequestDispatcher("AdminRegistrationView.jsp");
		rd.forward(request, response);
		return;
		
	}
	
	AdminModel am = new AdminModel();
	boolean flag = am.addAdmin(ad);
	
	if(flag==true){
		String successMsg = "Admin Registration is Successfull";
		request.setAttribute("successMsg", successMsg);
		RequestDispatcher rd = request.getRequestDispatcher("AdminLoginView.jsp");
		rd.forward(request, response);
	
	}
	else{
		String errorMsg = "Admin Registration is not successfull";
		request.setAttribute("errorMsg", errorMsg);
		RequestDispatcher rd = request.getRequestDispatcher("AdminRegistrationView.jsp");
		rd.forward(request, response);
	}
	
	}

}
