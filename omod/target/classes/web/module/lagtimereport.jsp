<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localMenu.jsp" %>

<openmrs:htmlInclude file="/moduleResources/lagtimereport/js/jquery-3.1.1.min.js" />
<openmrs:htmlInclude file="/moduleResources/lagtimereport/css/bootstrap.min.css" />
<openmrs:htmlInclude file="/moduleResources/lagtimereport/css/jquery.dataTables.min.css" />
<openmrs:htmlInclude file="/moduleResources/lagtimereport/js/jquery.dataTables.min.js" />
<openmrs:htmlInclude file="/moduleResources/lagtimereport/js/dataTable.js"/>

<div class="widget">
<h4><b class="boxHeader"><spring:message code="lagtimereport.title" /></b></h4>
	<li>
		<a
		href="${pageContext.request.contextPath}/module/lagtimereport/setupLagtimereport.form"><spring:message
				code="lagtimereport.setup.menu" /></a>
	</li>
<br/>
<table id="reportTable" class="display">
<thead>
  <tr>
   <th></th>
   <th>Name</th>
   <th>Description</th>
   <th>Version</th>
   <th>Created on</th>
   <th>Edit</th>
  </tr>
  </thead>
  <c:forEach var="report" items="${reports}">
      <tr>
      	<td><input type="checkbox" name="checkbox" id="checkbox"></td>
        <td id="name">${report.name}</td>
        <td id="description">${report.description}</td>
        <td id="name">${report.version}</td>
        <td id="description">${report.dateCreated}</td>
        <td><a href="setupLagtimereport.form?lagtimereportId=${report.lagTimeReportId}" id="lagtimeId">Edit</a></td>
      </tr>		
  </c:forEach>
</table>
</div>
<%@ include file="/WEB-INF/template/footer.jsp"%>
