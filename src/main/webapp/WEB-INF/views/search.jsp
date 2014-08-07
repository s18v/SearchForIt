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
<style>
h1 {
	font-family: arial;
}
</style>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
	<%-- <h1>${testObj.testString}</h1> --%>
	<h1>${displayText}</h1>
	<div id="searcharea">
		<form>
			<!-- add this in the input tag - class="form-control" -->
			<input type="text" placeholder="Search for something.."
				id="searchquery">
		</form>
		<br>
		<button type="button" class="btn btn-success" id="btnsubmit">Submit</button>
	</div>

	<div id="searchresults">
		<h2 id="h2"></h2>
	</div>
	<!-- <script src="js/script.js" type="text/javascript"></script> -->

	<script type="text/javascript">
		$(document).ready(function() {
			$("#btnsubmit").click(function() {
				$("h1").hide();
			});
		});
	</script>
</body>
</html>