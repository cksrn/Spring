<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 목록</title>
</head>
<body>
		<h1>게시글</h1>
		
	<table border="1">
			<tr>
				<th width="100">번호</th>
				<th width="200">제목</th>
				<th width="150">내용</th>
				<th width="150">작성자</th>			
			</tr>
			<c:forEach items="${boardList}" var="board">
				<!-- 프라퍼티이름 변경 -->
				<tr>
					<td>${board.b_no}</td>
					<td align="left"><a href="getBoard.do?b_no=${board.b_no }">
							${board.title }</a></td>
					<td>${board.content }</td>
					<td>${board.writer }</td>
					
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard.do">새글 등록</a>
</body>
</html>