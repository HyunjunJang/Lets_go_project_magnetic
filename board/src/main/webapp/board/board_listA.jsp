<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>        

<%@ include file="../include/header.jsp" %>


<div class="container" style="width: 70%;">
    <h3>게시판</h3>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
            <tr align="center">
                <th scope="col" width="10%">글 번호</th>
                <th scope="col">글 제목</th>
                <th scope="col" width="15%">아이디</th>
                <th scope="col" width="20%">등록일</th>
                <th scope="col" width="10%">조회수</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="vo" items="${list}">
			    <c:if test="${vo.entty_type eq 'A'}">
			        <tr>
			            <td align="center">${vo.board_id}</td>
			            <td align="center"><a href="content.board?board_id=${vo.board_id}" class="text-primary" style="text-decoration: none; color: black;">${vo.bd_title}</a></td>
			            <td align="center">${vo.member_id}</td>
			            <td align="center"><fmt:formatDate value="${vo.bd_date}" pattern="yyyy.MM.dd. HH:mm" /></td>
			            <td align="center">${vo.bd_cnt}</td>
			        </tr>
			    </c:if>
			</c:forEach>

        </tbody>

        <tfoot>
            <tr>
                <td colspan="5" align="center">
                    <form action="" class="form-inline">
                        <div class="form-group">
                            <input type="text" name="search" placeholder="제목검색" class="form-control">
                            <input type="submit" value="검색" class="btn btn-primary">
                            <input type="button" value="글 작성" class="btn btn-success" onclick="location.href='write.board';">
                        </div>
                    </form>
                </td>
            </tr>
        </tfoot>
    </table>
</div>





<%@ include file="../include/footer.jsp" %>


