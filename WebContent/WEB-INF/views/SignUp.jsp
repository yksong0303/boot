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
 <div class="limiter">
      <div class="container-login100" style="background-image: url('/res/images/bg-01.jpg');">
         <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <form class="login100-form validate-form">
               <span class="login100-form-title p-b-49">
					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">ID</span>
						<input class="input100" type="text" name="ui_id" id="ui_id"placeholder="Type your ID">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">PASSWORD</span>
						<input class="input100" type="password" name="ui_password" id="ui_password"placeholder="Type your ID">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">NAME</span>
						<input class="input100" type="text" name="ui_name" id="ui_name"placeholder="Type your ID">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">PHONE</span>
						<input class="input100" type="text" name="ui_phone" id="ui_phone"placeholder="Type your ID">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">E-MAIL</span>
						<input class="input100" type="text" name="ui_id" id="ui_id"placeholder="Type your ID">
						<input class="input100" type="select" name="ui_email" id="ui_email" >
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-23" data-validate = "ID is reauired">
						<span class="label-input100">NICKNAME</span>
						<input class="input100" type="text" name="ui_nickname" id="ui_nickname"placeholder="Type your ID">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
            <div class="flex-c-m">
                  <a href="#" class="login100-social-item bg1">
                     <i class="fa fa-facebook"></i>
                  </a>

                  <a href="#" class="login100-social-item bg2">
                     <i class="fa fa-twitter"></i>
                  </a>

                  <a href="#" class="login100-social-item bg3">
                     <i class="fa fa-google"></i>
                  </a>
               </div>
               
               <div class="flex-col-c p-t-155">
                  <span class="txt1 p-b-17">
                     Or Sign Up Using
                  </span>

                  <a href="#" class="txt2" onclick="doSignUp()">
                     Sign Up
                  </a>
               </div>
            </form>
         </div>
      </div>
   </div>


   <div id="dropDownSelect1"></div>
   
</body>
</html>