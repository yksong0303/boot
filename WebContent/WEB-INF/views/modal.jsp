<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/head.jsp" />
</head>
<body>
	<button class="btn btn-primary" data-toggle="modal"
		data-target="#modal">눌러봐</button>
	<div class="modal" id="modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">안녕 난 모발이라고 해</h4>
					<button class="close" data-dismiss="modal">x</button>
				</div>
				<div class="modal-body">
					<img src="/res/image/1.gif" width="400px" class="rounded-circle mx-auto d-block">
				</div>
				<div class="modal-footer">
					<button class="btn btn-dnager" data-dismiss="modal">닫기</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>