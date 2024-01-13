package com.magnetic.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.magnetic.model.QuestionVO;
import com.magnetic.service.QuestionService;
import com.magnetic.service.QuestionServiceImpl;


@WebServlet("*.question")
public class QuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public QuestionController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring( request.getContextPath().length() );
		System.out.println(path);
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "JSP";
		String upw = "JSP";
		
		/////
		
		QuestionService service = new QuestionServiceImpl();
		
		if(path.equals("/question.question")) {
			
			int result = service.regist(request, response);
			
			System.out.println(result);
			if(result == 0) {
				response.sendRedirect("questionend.qustion");
			}else {
				response.sendRedirect("questionend.question");
			}
			
	   }else if(path.equals("questionend.question")) {
		   request.getRequestDispatcher("/question/questionend.jsp").forward(request, response);
		   
		   QuestionVO vo = service.getQuestionInfo(request, response);
		   request.setAttribute("vo", vo);
		   
	   }
			
		
		
	
		
	}

}
