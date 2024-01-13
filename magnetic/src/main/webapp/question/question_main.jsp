<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../include/header.jsp" %>
	<!-- Content section-->
        <section class="py-5">
            <div class="container my-5">
                <div class="row justify-content-center">
                    <div class="col-lg-6">
                        <h2>이제 부터 취향 테스트를 시작 합니다.</h2>
                        <p class="lead">총 6개의 문항으로 이루어져 있으며 답변 중 하나를 선택 하여 주세요</p>      
                  	</div>  
                
                </div>
            
            </div>
            
            <hr>
            <form action ="question_start.jsp" method="post" style ="float:right">
                	
                	<input type="submit" value="다음">
                	
                	</form>
  			</section>

<%@ include file = "../include/footer.jsp" %>