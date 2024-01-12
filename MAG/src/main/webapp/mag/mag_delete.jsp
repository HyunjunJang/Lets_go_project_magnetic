<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

	<%@ include file="../include/header.jsp" %>
	
	<div class="container mt-4">
	    <div class="row justify-content-center">
	        <div class="col-md-5">
	            <div class="text-center">
	                <h3 style="font-size: 23px">현재 비밀번호를 입력하세요.</h3>
	                <hr>
	            </div>
	
	            <form action="deleteForm.mag" method="post" class="text-center">
	                <div class="form-group">
	                    <label for="pw">비밀번호:</label>
	                    <input type="password" name="pw" id="pw" class="form-control" placeholder="비밀번호 입력해주세요" required>
	                </div>
	                <br>
		
	                <button type="submit" class="btn btn-primary">확인</button>
	            </form>
	            
	
	            <div class="text-center mt-3">
	                ${msg }
	            </div>
	        </div>
	    </div>
	</div>
	
	<%@ include file="../include/footer.jsp" %>