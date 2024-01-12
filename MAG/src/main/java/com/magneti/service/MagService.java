package com.magneti.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.magneti.model.MagVO;

public interface MagService {
	
	public int join(HttpServletRequest request, HttpServletResponse response);
	public MagVO login(HttpServletRequest request, HttpServletResponse response);
	public MagVO getUserInfo(HttpServletRequest request, HttpServletResponse response);
	public int update(HttpServletRequest request, HttpServletResponse response);
	public int delete(HttpServletRequest request, HttpServletResponse response);


}
