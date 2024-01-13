<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file ="../include/header.jsp" %>
 
 
 <!-- Content section-->
        <section class="py-5">
            <div class="container my-5">
                <div class="row justify-content-center">
                    <div class="col-lg-6">
                    	
                <div class="text-center my-5">
                 <h3>내일 해야 할 일이 많을 때</h3>
                   	
                   	<br>
                   	
                   	<h6>둘 중 하나를 선택 해주세요</h6>
           			  	</div>
    
           	<form action="question05.question" method="post" required>
  					<table>
  				<tr>
           			<td>
           				<label> 
           			<img src="https://item.kakaocdn.net/do/3ea0dcf6359d9830f82f3f311c16f6fe9f5287469802eca457586a25a096fd31" alt="Image mbti J" width="300" height="300">
           			<br>
           			<input type="radio" name="q4" value="내일의 나를 계획함">

           					
           				</label>
           			</td>
  					
  					<td>
  					<label>
           			<img src="https://item.kakaocdn.net/do/1a48cfe54cb07176640e1daa483c1dcff604e7b0e6900f9ac53a43965300eb9a" alt="Image mbti P" width="300" height="300">  			
           			<br>
           			<input type="radio" name="q4" value="내일의 나에게 맡김">
           			 
           			
           			<br>
           			
           			</label>
           			
					</td>
  	
  					</tr>
  					
  					</table>
                	<input type="submit" value="선택완료" style="float:right">
		       		 								</form>
 
 
 
 			</div>
 		</div>
 	</div>
 </section>