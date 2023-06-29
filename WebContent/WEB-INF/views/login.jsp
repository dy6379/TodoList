<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container" style="width:50%">
		<form action="login.do" method="post">
			<p>
				<font color="red">${error}</font>
			</p>
			이름: <input class="form-control" type="text" name="name" /> <br>
			패스워드:<input class="form-control" type="password" name="password" /> <br>
			 <input class="form-control" type="submit" value="로그인" />
		</form>
	</div>

<%@ include file="../common/footer.jspf" %>