package com.myweb.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardVO;
import com.myweb.board.service.BoardService;
import com.myweb.board.service.BoardServiceImpl;

@WebServlet("*.board") ///
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); ///
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); ///
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//3. URL주소를 분기(각 요청별로 코드를 만듬)
		request.setCharacterEncoding("utf-8"); //한글처리
		
		String uri = request.getRequestURI();
		String path = uri.substring( request.getContextPath().length()  );
		
		System.out.println(path);
		
		
		BoardService service = new BoardServiceImpl();
		
		
		if(path.equals( "/board/listA.board"  )) { 
			
			
			ArrayList<BoardVO> list = service.getList(request, response);
			request.setAttribute("list", list);	
			request.getRequestDispatcher("board_listA.jsp").forward(request, response);
			
		} else if (path.equals( "/board/listB.board"  )) { 
			
			
			ArrayList<BoardVO> list = service.getList(request, response);
			request.setAttribute("list", list);	
			request.getRequestDispatcher("board_listB.jsp").forward(request, response);
			
		}
		
		else if( path.equals("/board/write.board") ) { 
			
			request.getRequestDispatcher("board_write.jsp").forward(request, response);
			
		} else if( path.equals("/board/registForm.board") ) { 
		
			service.regist(request, response);
			
			response.sendRedirect("list.board");
		} else if( path.equals("/board/content.board") ) {
			
//			service.bd_cntUpdate(request, response); 
			BoardVO vo = service.getContent(request, response); 
			request.setAttribute("vo", vo);
			
			request.getRequestDispatcher("board_content.jsp").forward(request, response);
		} else if( path.equals("/board/modify.board") ) {
			
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			request.getRequestDispatcher("board_modify.jsp").forward(request, response);
			
		} else if( path.equals("/board/update.board") ) {
			
			int result = service.update(request, response);
			
			if(result == 1) {
				response.sendRedirect("content.board?board_id=" + request.getParameter("board_id") ); 
			} else {
				response.sendRedirect("modify.board?board_id=" + request.getParameter("board_id") ); 
			}
			
			
		} else if( path.equals("/board/delete.board")) {
			
			service.delete(request, response);
			response.sendRedirect("list.board");
		}
					
	}

}
