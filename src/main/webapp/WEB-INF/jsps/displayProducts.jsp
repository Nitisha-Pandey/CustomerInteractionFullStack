<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Products</title>
</head>
<body>
<h2>Products:</h2>

<table>

		<tr>
			<th> Product Id </th>
			<th> Product Name </th>
			<th> Product Category </th>
			<th> Brand ID </th>
		</tr>
		
		<c:forEach items="${AllProducts}" var="product">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.productCategory}</td>
				<td>${product.brandId}</td>
				<td><a href= "SelectProduct?id=${product.productId}">Select</a></td>
				
			</tr>

		</c:forEach>

	</table>
</body>
</html>