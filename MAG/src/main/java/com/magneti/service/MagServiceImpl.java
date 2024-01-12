package com.magneti.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magneti.model.MagDAO;
import com.magneti.model.MagVO;

public class MagServiceImpl implements MagService {
	
	private MagDAO dao = MagDAO.getInstance();

	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {
		
		String member_id = request.getParameter("member_id");
	    String pw = request.getParameter("pw");
	    String name = request.getParameter("name");
	    String nick = request.getParameter("nick");
	    String age = request.getParameter("age");
	    String gender = request.getParameter("gender");
	    String type = request.getParameter("type");
	    
	    int result = dao.idCheck(member_id);
		
		if(result == 1) {
	        return 1;
	    } else {
	        MagVO vo = new MagVO(member_id, pw, name, nick, age, gender, type);
	        dao.insertUser(vo); 
	        return 0;
	    }
	}
	@Override
	public MagVO login(HttpServletRequest request, HttpServletResponse response) {
		
		String  member_id = request.getParameter("member_id");
		String pw = request.getParameter("pw");
		
		MagVO vo = dao.login(member_id, pw);
		return vo;
	}

	@Override
	public MagVO getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		String member_id = (String)session.getAttribute("mag_id");
		
		MagVO vo = dao.getUserInfo(member_id);
		return vo;
	}

	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {
		
		String member_id = request.getParameter("member_id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nick = request.getParameter("nick");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String type = request.getParameter("type");
		
		MagVO vo = new MagVO(member_id, pw, name, nick, age, gender, type);
		int result = dao.update(vo);
		
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("mag_name", name);
		}
		return result;
		
	}

	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
	    String member_id = (String) session.getAttribute("mag_id");
	    String pw = request.getParameter("pw");
		
	    MagVO vo = dao.login(member_id, pw);
		
	    if (vo != null) {
	        return 1;
	    } else {
	        return 0;
	    }
	}
}