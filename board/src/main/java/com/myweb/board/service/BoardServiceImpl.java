package com.myweb.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class BoardServiceImpl implements BoardService {

	//dao
	private BoardDAO dao = BoardDAO.getInstance();
	
	@Override
	public void regist(HttpServletRequest request, HttpServletResponse response) {
		
		String member_id = request.getParameter("member_id"); //board_writer에서 닉네임 바꾸면 처리해야함
		String nick = request.getParameter("nick");
		String entty_type = request.getParameter("entty_type"); //자유게시판은 A
		String bd_title = request.getParameter("bd_title");
		String bd_contents = request.getParameter("bd_contents");
		
		dao.insert(member_id, entty_type, bd_title, bd_contents);
		
	}

	@Override
	public ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<BoardVO> list = dao.getList();
		
		return list;
	}

	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		
		String board_id = request.getParameter("board_id");	
		BoardVO vo = dao.getContent(board_id);
		return vo;
	}

	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {
		
		String board_id = request.getParameter("board_id");
		String bd_title = request.getParameter("bd_title") + "(수정)";
		String bd_contents = request.getParameter("bd_contents");
		
		int result = dao.update(board_id, bd_title, bd_contents);
		
		return result;
	}

	@Override
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void bd_cntUpdate(HttpServletRequest request, HttpServletResponse response) {
//		String board_id = request.getParameter("board_id");
//		String bd_cnts = request.getParameter("bd_cnt");
//		int bd_cnt = Integer.parseInt(bd_cnts) + 1;
//		
//	}

}
