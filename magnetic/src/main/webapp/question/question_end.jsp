<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../include/header.jsp" %>
	<!-- Content section-->
        <section class="py-5">
            <div class="container my-5">
                <div class="row justify-content-center">
                    <div class="col-lg-6">
                        <h2>테스트를 해 주셔서 감사합니다</h2>
                        <p class="lead">
                        ${vo.member_id}<br>
                    	 ${vo.q1}<br>
                    	 ${vo.q2}<br>
                    	 ${vo.q3}<br>
                    	 ${vo.q4}<br> 
                         ${vo.q5}<br>							
                         ${vo.q6}<br>							
                        							
                        							 </p> <br>
                        
                                                     
                  	</div>  
                
                </div>
            
            </div>
            
            <hr>
            <form action ="index.jsp" method="post" style ="float:right">
                	
                	<input type="submit" value="홈으로">
                	
                	</form>
  			</section>

<%@ include file = "../include/footer.jsp" %>