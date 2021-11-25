package com.bima.thread;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bima.model.ThreadModel;
import com.bima.service.ThreadService;

/**
 * Servlet implementation class ThreadSimple
 */
@WebServlet("/thread")
public class ThreadSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ThreadService siThread;

	public ThreadSimple() {
		// TODO Auto-generated constructor stub
		siThread = new ThreadService();

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter siPrint = response.getWriter();
		siPrint.println(siThread.listofThread());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter siPrint = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String quote = request.getParameter("quote");

		ThreadModel thread1 = new ThreadModel();
		thread1.setId(id);
		thread1.setName(name);
		thread1.setQuote(quote);
		siThread.addThread(thread1);

		if (thread1 != null) {
			siPrint.println("Succes add thread");
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
