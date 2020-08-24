<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
var json ='{"list":[{"uiNum":23,"uiName":"123123","uiAge":1,"uiBirth":"2020-08-25","uiId":"test","uiPassword":"test","uiPhone":"123123123  ","uiEmail":"123123123","uiCredat":"2020-08-21 15:35:49.0","uiNickname":"123123123","uiAdmin":"0"},{"uiNum":27,"uiName":"123123","uiAge":1,"uiBirth":"2020-08-27","uiId":"test2","uiPassword":"test2","uiPhone":"12312311234","uiEmail":"1231231","uiCredat":"2020-08-21 15:36:28.0","uiNickname":"1231231","uiAdmin":"0"},{"uiNum":13,"uiName":"테스트2","uiAge":0,"uiBirth":"2020-08-19","uiId":"123123","uiPassword":"123123","uiPhone":"15151515   ","uiEmail":"123132123","uiCredat":"2020-08-20 16:10:29.0","uiNickname":"2312313","uiAdmin":"1"}]}';
json = JSON.parse(json);

for(vari=0;i<json.list.length;i++){
	var ui = json.list[i];
	alert(ui.uiName)
}


var m ={name:['동동','경훈','지훈']};

for(var i=0; i<m.name.length;i++){
	var name = m.name[i];
	alert(name);
}
</script>
</body>
</html>