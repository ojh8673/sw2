<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype HTML>
<html>
    <head>
        <title>이미지 게시판</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    </head>
    <body>
        <div class="empty-row"></div>
        <div class="empty-row"></div>
        <div class="area-50 center">
            <div class="row line-black" align="center">
                <h1>이미지 목록</h1>
            </div>
            <div class="empty-row"></div>
            
            <c:forEach var="content" items="${list}">
            <div class="row line-black">
                <div class="row center line-red">
                    <h2>
                    	${content.title}
                    	<%--제목 옆에 다운로드 아이콘을 표시 --%>
                    	<a href="${pageContext.request.contextPath}/download/${content.savename}">
                    		<img src="${pageContext.request.contextPath}/img/download-icon.png" width="20" height="20">
                    	</a>	
                   	</h2>
                </div>
                <div class="row center line-blue">
<%--                     <img src="<c:url value="/file/${content.savename}"/>" width="100%"> --%>
				<img src="${pageContext.request.contextPath}/file/${content.savename}" width="100%">
                </div>
            </div>
            <div class="empty-row"></div>
            </c:forEach>
            
            <div class="empty-row"></div>
            
        </div>
    </body>
</html>