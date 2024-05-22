<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<%@page import="servlet.Bean"%>
<%
Bean b = (Bean) request.getAttribute("bean");
%>
名前：<%=b.getName()%><br>
<%
if (!b.getCompany().equals("")) {
%>
会社名：<%=b.getCompany()%><br>
<%
}
%>
メールアドレス：<%=b.getAddress()%><br>
お問い合わせ内容：<%=b.getInfo()%><br>
<%
if (b.getInfoType() != null) {%>
メルマガ種類：
<%
for (String type : b.getInfoType()) {
%>
<%=type%>
<%
}
}
%><br>
<%
if (b.getYesNo().equals("yes")) {
%>
<p>
	この度は資料請求いただきありがとうございます<br> 以下のリンクから資料ダウンロードが可能です。
</p>
<a href="text.html">資料請求</a>
<%
}
%>

<%@include file="../footer.html"%>
