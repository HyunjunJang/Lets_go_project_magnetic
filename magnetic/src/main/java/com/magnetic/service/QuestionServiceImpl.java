package com.magnetic.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magnetic.model.QuestionDAO;
import com.magnetic.model.QuestionVO;

public class QuestionServiceImpl implements QuestionService {

	private QuestionDAO dao = QuestionDAO.getInstance();
	
	
	@Override
	public int regist(HttpServletRequest request, HttpServletResponse response) {
		
		String sanswer_id = request.getParameter("answer_id");
		String member_id = request.getParameter("member_id");
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");
		String q6 = request.getParameter("q6");
		
		int result = dao.idCheck(member_id);
		int answer_id = Integer.parseInt(sanswer_id);
			
		if(result == 1) {
			
			QuestionVO vo = new QuestionVO(answer_id, member_id, q1, q2, q3, q4, q5, q6);
			
			HttpSession session = request.getSession();
			session.setAttribute("q1", q1);
			session.setAttribute("q2", q2);
			session.setAttribute("q3", q3);
			session.setAttribute("q4", q4);
			session.setAttribute("q5", q5);
			session.setAttribute("q6", q6);
			
			return 1;
		
		}else if(result == 0){
			QuestionVO vo = new QuestionVO(answer_id, member_id, q1, q2, q3, q4, q5, q6);
			dao.insertAnswer(vo);
			
			return 0;
		}
		return result;
		
	}

	@Override
	public QuestionVO getQuestionInfo(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String member_id = (String)session.getAttribute("member_id, q1, q2, q3, q4, q5, q6");
		
		QuestionVO vo = dao.getQuestionInfo(member_id);
		
		return vo;
	}
	

}
