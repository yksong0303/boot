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
/* var tableInfo={
		cols : ['uiNum','uiName,']
}
$(document).ready(function(){
	$.ajax({
		url:'/ajax/user',
		method:'GET',
		data : {cmd:'list'},
		success:function(res){
			var html = '<table border="1">';
			html += '<tr><th>이름</th><th>비번</th><th>아이디</th><th>생일</th><th>폰</th><th>별명</th><th>이메일</th><th>관리번호</th><th>나이</th></tr>';
			for(var i=0;i<res.list.length;i++){
				var user = res.list[i];
				html += '<tr><th>' + user.uiName +'</th>';
				html += '<th>' + user.uiPassword +'</th>';
				html += '<th>' + user.uiId +'</th>';
				html += '<th>' + user.uiBirth +'</th>';
				html += '<th>' + user.uiPhone +'</th>';
				html += '<th>' + user.uiNickname +'</th>';
				html += '<th>' + user.uiEmail +'</th>';
				html += '<th>' + user.uiAdmin +'</th>';
				html += '<th>' + user.uiAge +'</th></tr>';
				
			}
			html += '</table>';
			$('#userListDiv').html(html);
		}
	})
}) */
var uiList=[
	{uiName:user.uiName,uiPassword:user.uiPassword,uiId:user.uiId,uiBirth:user.uiBirth,uiPhone:user.uiPhone,uiNickname:user.uiNickname,uiEmail:user.uiEmail,uiAdmin:user.uiAdmin,uiAge:user.uiAge},
];
$.ajax({
	url:'/ajax/user',
	method:'GET',
	data:{cmd:'list'},
}
	


var loadData=function(){
	$('th[data-col]').each(function(idx,th){
		var userList = th.getAttribute('data-col');
	})
	var html='';
	for(var i=0;i<uiList.length;i++){
		var uiL = uiList[i];
		html +='<th>';
		$('th[data-col]').each(function(idx,th){
			var col=th.getAttribute('data-col')
			html+= '<td>'+uiL[userList]+'</td>';
		})
		html +='</tr>';
	}
	$('#dataBody').html(html);
}
$(document).ready(loadData);

})
</script>
<h3>유저리스트</h3>
<div id="userListDiv"></div>
	<table class="table table-bordered">
		<tr>
			<th data-col="uiName">이름</th>
			<th data-col="uiPassword">비밀번호</th>
			<th data-col="uiId">아이디</th>
			<th data-col="uiBirth">생일</th>
			<th data-col="uiPhone">폰</th>
			<th data-col="uiNickname">닉네임</th>
			<th data-col="uiEmail">이메일</th>
			<th data-col="uiAdmin">관리번호</th>
			<th data-col="uiAge">나이</th>
		</tr>
		<tbody id="dataBody"></tbody>
	</table>

	
</body>
</html>