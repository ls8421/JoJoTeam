<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.5//EN" "http://java.sun.com/dtd/web-app_2_3.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${personList}" var="list">
	id: ${list.id} <br/>
	name: ${list.name} <br/>
	phone: ${list.phone} <br/>
	<br/>
	<br/>
	</c:forEach>
</body>
</html>