<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
		<h1>글 상세</h1>		
		<hr>
		<form action="updateBoard.do" method="post">
			<input name="b_no" type="hidden" value="${board.b_no}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="70">제목</td>
					<td align="left"><input name="title" type="text"
						value="${board.title}" /></td>
				</tr>
				<tr>
					<td >내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10">${board.content}</textarea></td>
				</tr>
				<tr>
					<td >작성자</td>
					<td align="left">${board.writer}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="글 수정"/></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.do">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteBoard.do?b_no=${board.b_no}">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList.do">글목록</a>
</body>
</html>
