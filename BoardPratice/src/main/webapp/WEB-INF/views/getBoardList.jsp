<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ���</title>
</head>
<body>
		<h1>�Խñ�</h1>
		
	<table border="1">
			<tr>
				<th width="100">��ȣ</th>
				<th width="200">����</th>
				<th width="150">����</th>
				<th width="150">�ۼ���</th>			
			</tr>
			<c:forEach items="${boardList}" var="board">
				<!-- ������Ƽ�̸� ���� -->
				<tr>
					<td>${board.b_no}</td>
					<td align="left"><a href="getBoard.do?b_no=${board.b_no }">
							${board.title }</a></td>
					<td>${board.content }</td>
					<td>${board.writer }</td>
					
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard.do">���� ���</a>
</body>
</html>