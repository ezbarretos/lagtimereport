<spring:htmlEscape defaultHtmlEscape="true" />
<ul id="menu">
	<li class="first"><a
		href="${pageContext.request.contextPath}/admin"><spring:message
				code="admin.title.short" /></a></li>

	<li
		<c:if test='<%= request.getRequestURI().contains("/manage") %>'>class="active"</c:if>>
		<a
		href="${pageContext.request.contextPath}/module/lagtimereport/manageLagtimereport.list"><spring:message
				code="lagtimereport.manage.menu" /></a>
	</li>
	
	<li>
		<a
		href="${pageContext.request.contextPath}/module/lagtimereport/setupLagtimereport.form"><spring:message
				code="lagtimereport.setup.menu" /></a>
	</li>
	
	<li>
		<a
		href="${pageContext.request.contextPath}/module/lagtimereport/lagtimereport.list"><spring:message
				code="lagtimereport.title" /></a>
	</li>
	
	<!-- Add further links here -->
</ul>
<!--  <h2>
	<spring:message code="gaac.title" />
</h2>-->
