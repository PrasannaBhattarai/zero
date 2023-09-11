<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Post</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="panel">
        <h1>Edit Post</h1>
        <!-- Edit Post Form Here -->
    </div>
    <h1>
     <c:forEach items="${postList}" var="post">
    <p>Name: ${post.name}</p>
	</c:forEach>
    
    </h1>
</body>
</html>
