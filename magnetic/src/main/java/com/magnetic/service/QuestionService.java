package com.magnetic.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.magnetic.model.QuestionVO;

public interface QuestionService {
	
	
	public int regist(HttpServletRequest request, HttpServletResponse response);
	
	public QuestionVO getQuestionInfo(HttpServletRequest request, HttpServletResponse response);
}
