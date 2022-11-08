<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>

<portlet:defineObjects />

<h5>View 1</h5>


<portlet:actionURL name="addEntryAction" var="addDistrictURL" />


<%
    String errMsg = renderRequest.getParameter("errMsg");
%>

<liferay-ui:error key="district.exist" message="<%= errMsg %>" />


<aui:form name="form" id="form" method="post" action="<%= addDistrictURL %>">
    <aui:input label="district name" name="name" id="name"  required="true" />
    <aui:input label="district code" name="code" id="code" required="false" />

    <aui:select label="archive" name="isArchived">
        <aui:option value="false">no</aui:option>
        <aui:option value="true">yes</aui:option>
    </aui:select>

	<aui:button name="submitButton" type="submit" value="Submit" />
</aui:form>


<portlet:renderURL var="mainURL">
	<portlet:param name="mvcPath" value="/jsp/district/main.jsp" />
</portlet:renderURL>

<aui:button name="main" type="submit" value="Back" href="<%= mainURL %>" />







<!--  -->
