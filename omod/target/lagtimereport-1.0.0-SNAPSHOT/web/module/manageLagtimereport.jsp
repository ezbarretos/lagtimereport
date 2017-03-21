<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localMenu.jsp"%>

<div class="widget">
	<h4>
		<b class="boxHeader"><spring:message code="lagtimereport.manage.title" /></b>
	</h4>
		<li>
		<a
		href="${pageContext.request.contextPath}/module/lagtimereport/addLagtimereport.form"><spring:message
				code="lagtimereport.add.menu" /></a>
	</li>
		
</div>
<%@ include file="/WEB-INF/template/footer.jsp"%>