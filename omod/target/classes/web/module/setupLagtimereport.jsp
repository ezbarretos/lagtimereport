<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localMenu.jsp"%>

<div class="widget">
	<h4>
		<b class="boxHeader"><spring:message
				code="lagtimereport.setup.title" /></b>
	</h4>

	<form method="post">
	${setupLagtimereport.lagTimeReportId}
	${setupLagtimereport.version}
	<input type="hidden" name="lagTimeReportId" id="lagTimeReportId" value="${setupLagtimereport.lagTimeReportId}"/>
	<input type="hidden" name="version" id="version" value="${setupLagtimereport.version}"/>
			<fieldset>
			<table>
				<tr>
					<td><openmrs:message code="general.name" /></td>
					<td>
					<input type="text" name="name" value="${setupLagtimereport.name }" size="35" />
					</td>
				</tr>
				<tr>
					<td valign="top"><openmrs:message code="general.description" /></td>
					<td>
					<textarea name="description" rows="5" cols="50">${setupLagtimereport.description }</textarea>
					</td>
				</tr>
			</table>
			<br /> <input type="submit"
				value="<openmrs:message code="lagtimereport.save"/>" name="save">
		</fieldset>
	</form>

</div>
<%@ include file="/WEB-INF/template/footer.jsp"%>