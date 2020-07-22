<%@ page language="java"%>
<%@taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a new Customer</title>
</head>
<body>
	<springform:form action="saveCustomer" modelAttribute="customerModel"  method="POST">
FIRST NAME: <br />
		<springform:input type="text" path="firstName" />
		<br />
		<br />
LAST NAME: <br />
		<springform:input type="text" path="lastName" />
		<br />
		<br />
EMAIL: <br />
		<springform:input type="text" path="email" />
		<br />
		<br />
		<input type="submit" name="Save Customer" />
	</springform:form>

</body>
</html>