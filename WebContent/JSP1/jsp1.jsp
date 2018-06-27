<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<%
			String strA = request.getParameter("a");
			String strB = request.getParameter("b");
			try {
				int a = Integer.parseInt(strA);
				int b = Integer.parseInt(strB);
				for (int i = a; i <= b; i++) {
		%>
		<li><%=i%></li>
		<%
			}
			} catch (NumberFormatException e) {
				response.getWriter().append("Wrong parameters");
			}
		%>
	</ul>
</body>
</html>