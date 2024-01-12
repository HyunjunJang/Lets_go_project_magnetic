 <%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

	<div class="container mt-4">
	    <div class="row justify-content-center">
	        <div class="col-md-6">
	            <h3 class="text-center">회원가입</h3>
	            <hr>
	
	            <form action="joinForm.mag" method="post" name="">
	                <div class="mb-3">
	                    <label for="member_id" class="form-label">아이디</label>
	                    <input type="text" name="member_id" class="form-control" pattern="[A-Za-z0-9]{5,}" required>
	                </div>
	                <div class="mb-3">
	                    <label for="pw" class="form-label">비밀번호</label>
	                    <input type="password" name="pw" class="form-control" required>
	                </div>
	                <div class="mb-3">
	                    <label for="name" class="form-label">이름</label>
	                    <input type="text" name="name" class="form-control" required>
	                </div>
	                <div class="mb-3">
	                    <label for="nick" class="form-label">닉네임</label>
	                    <input type="text" name="nick" class="form-control" required>
	                </div>
	                <div class="mb-3">
	                    <label for="age" class="form-label">나이</label>
	                    <input type="number" name="age" class="form-control">
	                </div>
	                <div class="mb-3">
	                    <label class="form-label">성별</label>
	                    <div>
	                        <input type="radio" name="gender" value="M" id="maleRadio">
	                        <label for="maleRadio">남자</label>
	                        <input type="radio" name="gender" value="F" id="femaleRadio" checked>
	                        <label for="femaleRadio">여자</label>
	                    </div>
	                </div>
	                <div class="mb-3">
	                    <label for="type" class="form-label">성향</label>
	                    <input type="text" name="type" class="form-control" required>
	                </div>

	                <button type="submit" class="btn btn-primary">회원가입</button>
	                <button type="reset" class="btn btn-secondary">취소</button>
	
	                <div class="mt-3">${msg}</div>
	            </form>
	        </div>
	    </div>
	</div>
	
	<%@ include file="../include/footer.jsp" %>
	
		