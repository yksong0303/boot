<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/head.jsp"></jsp:include>
</head>
<body>

<script>
$(document).ready(function(){
	$.ajax({
		url:'/ajax/user',
		method:'GET',
		success:function(res){

			console.log(res)
		}
			
	})
})

</script>
<h3>유저리스트</h3>
<div id="userListDiv"></div>
</body>
</html>