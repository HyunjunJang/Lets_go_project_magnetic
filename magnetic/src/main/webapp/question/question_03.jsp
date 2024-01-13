<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file ="../include/header.jsp" %>
 
 
 <!-- Content section-->
        <section class="py-5">
            <div class="container my-5">
                <div class="row justify-content-center">
                    <div class="col-lg-6">
                    	
                <div class="text-center my-5">
                  <h3>내가 더 듣기 좋은 말은??</h3>
                   	
                   	<br>
                   	
                   	<h6>둘 중 하나를 선택 해주세요</h6>
           			  	</div>
    
           	<form action="question04.question" method="post" required>
  					<table>
  				<tr>
           			<td>
           				<label> 
           			<img src="https://item.kakaocdn.net/do/a00d5e72d5b334b76a3c1e6acd78596c8f324a0b9c48f77dbce3a43bd11ce785" alt="Image mbti F" width="300" height="300">
           			<br>
           			<input type="radio" name="q3" value="네가 있으면 기분이 좋아!">
           					
           				</label>
           			</td>
  					
  					<td>
  					<label>
           			<img src="https://d2u3dcdbebyaiu.cloudfront.net/uploads/atch_img/156/6ba4563145238a685a856351f5a0deea_crop.jpeg" alt="Image mbti T" width="300" height="300">  			
           			<br>
           			<input type="radio" name="q3" value="너 덕분에 문제가 해결 됐어!"> 
           			 
           			
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
 
 