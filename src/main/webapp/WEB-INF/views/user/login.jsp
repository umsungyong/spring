<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
	crossorigin="anonymous"></script>
</head>
<body>
		<input type="text" id="id" name="id"> 
		<input type="text" id="pwd" name="pwd">
		
	<button onclick="login()">로그인</button>
	
	<script>
		function login() {
			var data ={
				id:$('#id').val(),
				pwd:$('#pwd').val()
			}
			$.ajax({
				method : 'post',
				url : '/user/login',
				data : JSON.stringify(data),
				contentType:'application/json',
				success : function(res) {
					console.log(res);
				}

			})
		}
	</script>
</body>
</html>