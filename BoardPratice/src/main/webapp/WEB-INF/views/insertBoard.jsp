<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>새글등록</title>
</head>
<body>
		<h1>글 등록</h1>		
		<!-- 1. 폼태그에 속성 추가  -->
		<form action="saveBoard.do"> 
			<table border="1" cellpadding="0" cellspacing="0">
				<!-- 2. 각 항목에  name 맞추기 -->
				<tr>
					<td width="70">제목</td>
					<td align="left"><input type="text" name="title"/></td>
				</tr>
				<tr>
					<td >작성자</td>
					<td align="left"><input type="text" size="10" name="writer"/></td>
				</tr>
				<tr>
					<td >내용</td>
					<td align="left"><textarea cols="40" rows="10" name="content"></textarea></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit"	value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<a href="getBoardList.do">글 목록 가기</a>
</body>
</html>