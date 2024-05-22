<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<form action="register" method="post">
	氏名：<input type="text" name="name" required><br> 会社名：<input
		type="text" name="company"><br> メールアドレス：<input
		type="email" name="address" required><br> お問い合わせ内容
	<textarea rows="4" cols="50" name="info" required></textarea>
	<br> メルマガ種類<br> <input type="checkbox" name="infoType"
		value="総合案内"> 総合案内<br> <input type="checkbox"
		name="infoType" value="セミナー案内"> セミナー案内<br> <input
		type="checkbox" name="infoType" value="求人採用情報">求人採用情報<br>

	資料請求希望 <input type="radio" name="yesNo" value="yes"> Yes <input
		type="radio" name="yesNo" value="no" checked> No<br> <input
		type="submit" value="送信">

</form>

<%@include file="../footer.html"%>