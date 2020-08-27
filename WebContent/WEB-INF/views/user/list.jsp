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
      var param = {
         cmd : 'list',
         page : 1
      }
      $.ajax({
         url : '/ajax/member',
         method : 'GET',
         data : {
            json : JSON.stringify(param)
         },
         success : function(res) {
            var html = '';
            for(var i = 0; i<res.list.length;i++){
               var mi = res.list[i];
               html += '<tr>';
               $('th[data-col]').each(function(idx,th){
                  var mio = th.getAttribute('data-col');
                  html += "<td>" + mi[mio] + "</td>";
               })
               html += "</tr>";
            }
            $('#dataCol').html(html);
         },
         error : function(err) {
            console.log(err.responseText);
         }
      })
   </script>
   <table class='table table-bordered'>
      <tr>
         <th data-col = "rNum"> 번호</th>
         <th data-col = "miName"> 멤버 이름</th>
         <th data-col = "miId"> 멤버 아이디</th>
      </tr>
      <tbody id = "dataCol"></tbody>
   </table>
</body>
</html>