<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>주석처리</h3>
<!--  html 주석 -->

<%--  jsp 주석 --%>

<%--
EL(Expression Language) : 표현 언어
1. jsp 스크립트를 대신해서 속성값을 편리하게 출력할 수 있도록 제공해주는 언어이다.
2. ${} 
 --%>
 
 <% 
 // scope(영역) : 데이터를 참조할수 읻ㅆ도록 제공해주는 공간
 // page dㅇ
 %>
 <p>
 <%= pageContext.getAttribute("p1") %> / <%=request.getAttribute("p2") %>
 
</body>
</html>