<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Search for it!</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
	function submitFunct() {
		var searchQuery = document.getElementById("searchQuery").value;
		alert(searchQuery);
	}
</script>
</head>
<body>

	<%-- <h1>${testObj.testString}</h1> --%>
	<h1>${displayText}</h1>
	<br>
	<form>
		<input type="text" class="form-control"
			placeholder="Search for something.." id="searchQuery">
	</form>
	<br>
	<button type="button" class="btn btn-success" onclick="submitFunct()">Submit</button>
</body>
</html>