<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表</title>
</head>
<body>
	<div class="container">



		<div>
			<table class="table table-light table-bordered table-hover table-sm">
				<tr align="center">
					<th>序号</th>
					<th>链接名称</th>
					<th>URL</th>
					<th>修改日期</th>
					<th>操作|<button type="button" onclick="add()">增加</button></th>
				</tr>
				<c:forEach items="${links}" var="u" varStatus="i">

					<tr align="center">
						<td>${i.index+1 }</td>
						<td>${u.text }</td>
						<td>${u.url }</td>
						<td><fmt:formatDate value="${u.created}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td></td>
					</tr>

				</c:forEach>

			</table>
			<div>
				${pages }
			</div>
		</div>
	</div>

	<script type="text/javascript">
	  function add(){
		  $("#content-wrapper").load("/links/add")
		  
		  
	  }
	</script>
	<script type="text/javascript" src="/resource/js/cms.js"></script>
</body>
</html>