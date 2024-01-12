package com.magneti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magneti.service.MagService;
import com.magneti.service.MagServiceImpl;
import com.magneti.model.MagVO;


@WebServlet("*.mag")
public class MagController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MagController() {
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
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		
		MagService service = new MagServiceImpl();
		
		if (path.equals("/index.mag")) {
		    request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		if(path.equals("/mag/join.mag")) {
			request.getRequestDispatcher("mag_join.jsp").forward(request, response);
			
		} else if(path.equals("/mag/login.mag")) {
			request.getRequestDispatcher("mag_login.jsp").forward(request, response);
		
		} else if (path.equals("/mag/loginForm.mag")) {
	        MagVO vo = service.login(request, response);
	           if (vo != null) {
	        	   HttpSession session = request.getSession();
	               session.setAttribute("mag_id", vo.getMember_id());
	               session.setAttribute("mag_name", vo.getName());
	               String homePageURI = ("/index.mag"); 

	               response.sendRedirect(request.getContextPath() + homePageURI);
	           } else {
	               request.setAttribute("msg", "아이디 비밀번호를 확인하세요");
	               request.getRequestDispatcher("mag_login.jsp").forward(request, response);
	           }
	           
		} else if(path.equals("/mag/logout.mag")) { 
			HttpSession session = request.getSession();
			session.invalidate();
			
			response.sendRedirect(request.getContextPath() );
		} else if(path.equals("/mag/mypage.mag") ) { 
			
			request.getRequestDispatcher("mag_mypage.jsp").forward(request, response);
		} else if(path.equals("/mag/update.mag")) { 
			
			MagVO vo = service.getUserInfo(request, response);
			request.setAttribute("vo", vo);
			request.getRequestDispatcher("mag_update.jsp").forward(request, response);
		} else if(path.equals("/mag/updateForm.mag") ) {
			
			int result = service.update(request, response);
			
			if(result == 1) { 
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('업데이트에 성공했습니다');");
				out.println("location.href='mypage.mag'; ");
				out.println("</script>");
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('업데이트에 실패했습니다');");
				out.println("location.href='mypage.mag'; ");
				out.println("</script>");
				response.sendRedirect("update.mag");
			}
		} else if( path.equals("/mag/delete.mag") ) {
			request.getRequestDispatcher("mag_delete.jsp").forward(request, response);
		} else if( path.equals("/mag/deleteForm.mag")) {
			
			int result = service.delete(request, response);
			
			if(result == 1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('정상적으로 탈퇴되었습니다');");
				out.println("location.href='../index.mag'; ");
				out.println("</script>");
			} else { 
				request.setAttribute("msg", "비밀번호를 확인하세요");
				request.getRequestDispatcher("mag_delete.jsp").forward(request, response);
			}
		}
	}
}

				
	
		
	
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
