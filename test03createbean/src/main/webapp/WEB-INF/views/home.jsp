<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Insert title here</title>
		<!-- 부트스트랩 -->
    	<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    	<script src="/resources/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1 class="display-3">Create Bean</h1>
			
			<table class="table table-dark table-hover">
				<thead class="thead-dark">
					<tr>
						<th>목록</th> 
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${list }</td>
					</tr>
					<tr>
						<td>${tb }</td>
					</tr>
					<tr>
						<td>${tb2 }</td>
					</tr>
					<tr>
						<td>${tb3 }</td>
					</tr>
					<tr>
						<td>${tb4 }</td>
					</tr>
					<tr>
						<td>${tb5 }</td>
					</tr>
					<tr>
						<td>${tb6 }</td>
					</tr>
				</tbody>
			</table>
		</div>
	</body>
</html>