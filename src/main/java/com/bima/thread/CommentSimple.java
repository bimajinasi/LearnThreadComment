package com.bima.thread;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bima.model.Comment;
import com.bima.service.CommentService;

/**
 * Servlet implementation class CommentSimple
 */
@WebServlet("/comment")
public class CommentSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CommentService siComment;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentSimple() {
        super();
        // TODO Auto-generated constructor stub
        siComment = new CommentService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter siPrint = response.getWriter();
		siPrint.println(siComment.listOfComment());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter siPrint = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String quote = request.getParameter("quote");
		
		Comment commentObj = new Comment();
		commentObj.setId(id);
		commentObj.setName(name);
		commentObj.setQuote(quote);
		siComment.addComment(commentObj);
		
		if(commentObj != null) {
			siPrint.println("Comment has been send");
		}
		
	}

}
