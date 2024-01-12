<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<style>
    .table-container {
        margin: 20px auto;
        border-collapse: collapse;
        width: 80%;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .table-container th, .table-container td {
        border: 1px solid #ddd;
        padding: 10px;
        text-align: left;
    }

    .table-container th {
        background-color: #f2f2f2;
    }

    .button-container {
        margin: 20px auto;
    }

    .button-container button {
        padding: 10px 20px;
        font-size: 16px;
        margin-right: 10px;
        cursor: pointer;
    }

    .button-container button:last-child {
        margin-right: 0;
    }
</style>

<div align="center" class="div_center">
	<h3>게시판 글 수정 페이지</h3>
	<hr>
	<form action="update.board" method="post">
		<input type="hidden" name="board_id" value="${vo.board_id }">
		
		<table class="table-container">
			<tr>
				<td>글 번호</td>
				<td>${vo.board_id}</td>
			</tr>
			
			<tr>
				<td>작성자</td>
				<td>${vo.member_id }</td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>
					<input type="text" name="bd_title" value=${vo.bd_title }>
				</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="10" style="width: 95%;" name="bd_contents">${vo.bd_contents }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정 하기" onclick="">&nbsp;&nbsp;
					<input type="button" value="목록" onclick="location.href='list.board'; ">        
				</td>
			</tr>
		</table>
	</form>
	
</div>


<%@ include file="../include/footer.jsp" %>


