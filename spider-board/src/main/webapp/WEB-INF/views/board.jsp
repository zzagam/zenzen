<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%-- bootstrap --%>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">
<%-- bootstrap-theme --%>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css" rel="stylesheet">
<%-- bootstrap-dialog --%>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-dialog.css" rel="stylesheet">
<%-- favicon --%>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/favicon/favicon-brown.ico" type="image/x-icon">

<%-- jquery --%>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.js"></script>
<%-- fontawesom --%>
<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<%-- bootstrap --%>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<%-- bootstrap-dialog --%>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap-dialog.js"></script>
<title>noah</title>
</head>
<body>
   <div class="container-fluid">
      <div class="row main">
         <div class="col-sm-offset-2 col-sm-8">
            <h3>게시판</h3><br>
            <table class="table table-hover text-center">
                <thead>
                    <tr class="text-center">
                        <th>글번호</th><th>글제목</th><th>작성자</th><th>조회수</th><th>등록일</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${pagingList.list}" var="board">
                    <tr>
                       <td>${board.no}</td>
                       <td>${board.title}</td>
                       <td>${board.vo.name}</td>
                       <td>${board.hits}</td>
                       <td>${board.regdate}</td>
                    </tr>
                    </c:forEach>
                </tbody>               
            </table>
            <c:if test="${pagingList.pb.previousPageGroup==true}">
                <a href="readBoardList.do?nowPage=${pagingList.pb.startPageOfPageGroup-1}">이전</a>
            </c:if>
            <c:forEach var="i" begin="${pagingList.pb.startPageOfPageGroup}" end="${pagingList.pb.endPageOfPageGroup}">
                <c:choose>
                    <c:when test="${i==pagingList.pb.nowPage}">
                        ${i}
                    </c:when>
                    <c:otherwise>
                        <a href="readBoardList.do?nowPage=${i}">${i}</a>
                    </c:otherwise>
                </c:choose>
            
            </c:forEach>
            <c:if test="${pagingList.pb.nextPageGroup==true}">
                <a href="readBoardList.do?nowPage=${pagingList.pb.endPageOfPageGroup+1}">다음</a>
            </c:if>
         </div> <%-- col-sm-offset-2 col-sm-8 --%>
      </div> <%-- row main --%>
   </div> <%-- container-fluid --%>
</body>
</html>