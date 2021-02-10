package com.cybage.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.EnrolledDao;
import com.cybage.dao.EnrolledDaoImpl;
import com.cybage.model.Enrolled;
import com.cybage.service.EnrolledService;
import com.cybage.service.EnrolledServiceImpl;



public class EnrolledController extends HttpServlet {
	
	private EnrolledDao enrollDao = new EnrolledDaoImpl();

	private EnrolledService enrollService = new EnrolledServiceImpl(enrollDao);

	private static final long serialVersionUID = 1L;

	public EnrolledController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		System.out.println("inside Enroll controller");

		String path = request.getPathInfo();

		if (path.equals("/enroll")) {
			System.out.println("inside Enroll method....");
			try {
				List<Enrolled> enroll = enrollService.findEnrolled();
				request.setAttribute("enroll", enroll);

				request.getRequestDispatcher("/enrolled.jsp").forward(request, response);

			} catch (Exception e) {
				System.out.println("error occurred: " + e.getMessage());
			}
		}
		}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	doGet(request, response);
}
}

