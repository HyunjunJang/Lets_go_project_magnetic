<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file ="../include/header.jsp" %>
 
 
 <!-- Content section-->
        <section class="py-5">
            <div class="container my-5">
                <div class="row justify-content-center">
                    <div class="col-lg-6">
                    	
                <div class="text-center my-5">
                   	<h3>내가 충전되는 시간은??</h3>
                   	
                   	<br>
                   	
                   	<h6>둘 중 하나를 선택 해주세요</h6>
           			  	</div>
    
           	<form action="question02.question" method="post" required>
  					<table>
  				<tr>
           			<td>
           				<label> 
           					<img src="https://ogq-sticker-global-cdn-z01.afreecatv.com/sticker/17ce3ec21500cc8/main.png" alt="Image Q1_a" width="300" height="300">
           					 <br> 			
           					<input type="radio" name="q1" value="혼자 있을 때"> 
           					
           				</label>
           			</td>
  					
  					<td>
  					<label>
           			<img src="https://i.pinimg.com/originals/8b/48/d0/8b48d086c0410f513f2c4876db224e04.png" alt="Image mbti Q1_b" width="300" height="300"><br>
           			<input type="radio" name="q1" value="함께 있을 때"> 
           			 
           			
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   <%@ include file = "../include/footer.jsp" %>