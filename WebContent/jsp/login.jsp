<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link rel="Stylesheet" href="${pageContext.request.contextPath}/jsp/login.css" />

<div class="form-wrapper">
    <h1>Sign In</h1>
    <form action="../Login.action" method="post">
      <div class="form-item">
        <label for="ログイン名"></label>
        <input type="text" name="login" required="required" placeholder="ログイン名を入力して下さい。"></input>
      </div>
      <div class="form-item">
        <label for="パスワード"></label>
        <input type="password" name="password" required="required" placeholder="パスワード"></input>
      </div>
      <div class="button-panel">
        <input type="submit" class="button" value="ログイン"></input>
      </div>
    </form>
    <div class="form-footer">
      <p><a href="#">新しくアカウントを作成しますか？</a></p>
      <p><a href="#">パスワードを忘れた場合</a></p>
    </div>
  </div>


<%@include file="../footer.html" %>