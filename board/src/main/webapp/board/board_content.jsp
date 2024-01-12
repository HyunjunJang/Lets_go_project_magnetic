<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    


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
    <h3>게시글 내용 보기</h3>
    <hr>

    <table class="table-container">
        <tr>
            <th width="20%">글번호</th>
            <td width="30%">${vo.board_id}</td>

            <th width="20%">조회수</th>
            <td width="30%">${vo.bd_cnt}</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${vo.member_id}</td>

            <th>작성일</th>
            <td>${vo.bd_date}</td>
        </tr>

        <tr>
            <th width="20%">글제목</th>
            <td colspan="3">${vo.bd_title}</td>
        </tr>
        <tr>
            <th width="20%">글내용</th>
            <td colspan="3" height="120px">${vo.bd_contents}</td>
        </tr>
    </table>

    <div class="button-container">
        <button onclick="location.href='list${vo.entty_type}.board';">목록</button>
        <button onclick="location.href='modify.board?board_id=${vo.board_id}';">수정</button>
        <button onclick="confirmDelete(${vo.board_id});">삭제</button>
    </div>
</div>

<script>
    function confirmDelete(boardId) {
        if (confirm("게시글을 삭제하시겠습니까?")) {
            // 삭제 동작 수행 (추가적인 로직을 여기에 추가)
        }
    }
</script>






<%@ include file="../include/footer.jsp" %>
