<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessPage</title>
</head>
<body>
	Login successfully 123...

	<form action="AddCart" method="post">
		<c:forEach var="tempItem" items="${item_list}">

			<table>
				<tr>
					<td>${tempItem.itemNo}</td>
					<td>${tempItem.itemName}</td>
					<td>${tempItem.price}</td>
					<td><input type="hidden" name="selectedItem"
						value="${tempItem.itemNo}" /> <input type="submit"
						value="Add to Cart" /></td>
				</tr>
				<br />
			</table>
		</c:forEach>
	</form>
</body>
</html>