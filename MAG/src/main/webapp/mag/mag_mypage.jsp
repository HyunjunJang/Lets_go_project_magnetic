<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%@ include file="../include/header.jsp" %>

		<style>
	    body {
	        font-family: Arial, sans-serif;
	        background-color: #f4f4f4;
	        margin: 0;
	        padding: 0;
	    }
	
	    .div_center {
	        width: 70%;
	        margin: auto;
	        margin-top: 40px;
	        text-align: center;
	        background-color: #fff;
	        padding: 30px;
	        border-radius: 10px;
	        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	    }
	
	    h3 {
	        color: #333;
	    }
	
	    p {
	        font-size: 18px;
	        color: #555;
	        margin-bottom: 20px;
	    }
	
	    b {
	        color: red;
	    }
	
	    a {
	        text-decoration: none;
	        color: #007bff;
	        font-weight: bold;
	    }
	
	    a:hover {
	        text-decoration: underline;
	    }
	
	    hr {
	        border: 1px solid #ccc;
	        margin: 20px 0;
	    }
		</style>
	
	<div align="center" class="div_center">
	    <h3>MY PAGE</h3>
	    <hr>
	    <p><b>${sessionScope.mag_name }</b>님의 정보를 관리합니다.</p>
	
	    <a href="update.mag">[회원 정보 변경]</a>&nbsp;&nbsp;
	    <a href="delete.mag">[회원 탈퇴]</a>
	</div>
	 <hr>
	<%@ include file="../include/footer.jsp" %>