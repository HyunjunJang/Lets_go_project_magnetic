<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .div_center {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h3 {
            color: #333;
        }

        form {
            margin-top: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            border: 1px solid #ddd;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        input[type="text"],
        textarea,
        input[type="submit"],
        input[type="button"],
        input[type="radio"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        input[type="submit"],
        input[type="button"],
        input[type="radio"] {
            background-color: #000;
            color: #fff;
            cursor: pointer;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover,
        input[type="button"]:hover,
        input[type="radio"]:hover {
            background-color: #333;
        }

    </style>
    <title>게시판 글 작성 페이지</title>
</head>

<body>
    <div class="div_center">
        <h3>게시판 글 작성 페이지</h3>
        <hr>

        <form action="registForm.board" method="post">
            <table>
                <tr>
                    <td>아이디</td>
                    <td>
                        <input type="text" name="member_id" required>
                    </td>
                    <td>닉네임</td>
                    <td>
                        <input type="text" name="nick" required>
                    </td>
                </tr>
                <tr>
                    <td>게시판</td>
                    <td colspan="3">
                        <label>
                            <input type="radio" name="entty_type" value="A"> 자유게시판
                        </label>
                        <label>
                            <input type="radio" name="entty_type" value="B"> 취향게시판
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>글 제목</td>
                    <td colspan="3">
                        <input type="text" name="bd_title" required>
                    </td>
                </tr>
                <tr>
                    <td>글 내용</td>
                    <td colspan="3">
                        <textarea rows="10" style="width: 95%;" name="bd_contents" required></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        <input type="submit" value="작성 완료">
                        &nbsp;&nbsp;
                        <input type="button" value="목록" onclick="location.href='list.board';">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>

</html>



<%@ include file="../include/footer.jsp" %>


