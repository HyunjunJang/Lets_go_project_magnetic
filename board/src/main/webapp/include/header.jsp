<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	request.setCharacterEncoding("utf-8");
 %>   
<!DOCTYPE html>
<html lang="en">
 <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="${pageContext.request.contextPath }/js/scripts.js"></script>
        
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Full Width Pics - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath }/assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="${pageContext.request.contextPath }/css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Responsive navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#!">Magnetic</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="../index.jsp">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="http://localhost:8181/MAG/mag/login.mag">로그인</a></li>
                        <li class="nav-item"><a class="nav-link" href="http://localhost:8181/MAG/mag/mypage.mag">마이페이지</a></li>
                        <li class="nav-item"><a class="nav-link" href="http://localhost:8181/MAG/mag/join.mag">회원가입</a></li>
                        <li class="nav-item"><a class="nav-link" href="/bbs/board/listA.board">성향 게시판</a></li>
                        <li class="nav-item"><a class="nav-link" href="/bbs/board/listB.board">자유 게시판</a></li>
                        
                    </ul>
                </div>
                
            </div>
        </nav>
        <!-- Header - set the background image for the header in the line below-->
        <header class="py-5 bg-image-full" style="background-image: url('https://cdn.kormedi.com/wp-content/uploads/2023/02/gettyimages-1393750776.jpg.webp')"> <!-- https://source.unsplash.com/wfh8dDlNFOk/1600x900 -->
            <div class="text-center my-5">
                <img class="img-fluid rounded-circle mb-4" src="https://dummyimage.com/150x150/6c757d/dee2e6.jpg" alt="..." />
                <h1 class="text-white fs-3 fw-bolder">Full Width Pics</h1>
                <p class="text-white-50 mb-0">Landing Page Template</p>
            </div>
        </header>
        <!-- Content section-->
        
    