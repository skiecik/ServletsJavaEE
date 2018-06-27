<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="entry" items="${headerValues}">
		<c:out value="${entry.key} <br>" escapeXml="false" />
		<c:forEach var="val" items="${entry.value}">
			<c:out value="${val} <br><br>" escapeXml="false" />
		</c:forEach>
	</c:forEach>
</body>
</html>