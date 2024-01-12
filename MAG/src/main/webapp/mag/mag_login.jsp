<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ include file="../include/header.jsp" %>

	<style>
	    .div_center {
	        width: 300px;
	        margin: auto;
	        margin-top: 50px;
	        text-align: center;
	    }
	
	    h3 {
	        color: #333;
	    }
	
	    form {
	        text-align: left;
	        margin-top: 20px;
	    }
	
	    input[type="text"],
	    input[type="password"] {
	        width: 100%;
	        padding: 10px;
	        margin-bottom: 15px;
	        box-sizing: border-box;
	    }
	
	    input[type="submit"],
	    input[type="button"] {
	        color: white;
	        padding: 10px 20px;
	        border: none;
	        border-radius: 10px;
	        cursor: pointer;
	    }
	
	    input[type="submit"]:hover,
	    input[type="button"]:hover {
	        background-color: #45a049;
	    }
	</style>
	
	<div align="center" class="div_center">
	    <h3>로그인</h3>
	    <hr>
	    <form action="loginForm.mag" method="post">
	        <input type="text" name="member_id" placeholder="아이디"><br><br>
	        <input type="password" name="pw" placeholder="비밀번호"><br><br>
	        <input type="submit" value="로그인" class="btn btn-primary">&nbsp;&nbsp;
	        <input type="button" value="회원가입" class="btn btn-secondary" onclick="location.href=''; ">
	    </form>
	    <br>
	</div>
	
	<%@ include file="../include/footer.jsp" %>