<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
글번호 : ${dto.id}<br />
글쓴이 : ${dto.boardWriter }<br />
제목 : ${dto.boardSubject }<br />
내용 : ${dto.boardContent }<br />
<a href="boardUpdate?num=${dto.id}">수정</a>| 
<a href="boardDel?num=${dto.id}">삭제</a>  | 
<a href="boardList">게시글 리스트</a>
</body>
</html>