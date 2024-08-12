<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="employee/add">
		EmpName:<input type="text" name="empName" id="empName">
		EmpId:<input type="text" name="empId" id="empId">
		EmpSal:<input type="text" name="empSal" id="empSal">
		
		<button type="submit">submit</button>
	</form>
</body>
</html>