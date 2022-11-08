<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>
<%@ page import="com.register_farmers.model.District" %>


<portlet:defineObjects />

<portlet:actionURL name="editEntryAction" var="editEntryActionURL" />


<%
    String errMsg = renderRequest.getParameter("errMsg");

    long idDistrict = Long.parseLong(renderRequest.getParameter("idDistrict"));
    District district = DistrictLocalServiceUtil.getDistrict(idDistrict);
    String name = district.getName();
    boolean isArchived = district.getIsArchived();
    int code = district.getCode();
%>

<liferay-ui:error key="district.exist" message="<%= errMsg %>" />


<aui:form name="form" id="form" method="post" action="<%= editEntryActionURL %>">
    <aui:input label="distrcit name " name="name" id="name" value="<%= name %>"  required="true" />
    <aui:input label="distrcit code" name="code" id="code" value="<%= code %>"  required="false" />
    <aui:input name="idDistrict" type="hidden" value="<%= idDistrict %>"  required="false" />

    <aui:select label="archive" name="isArchived">
        <aui:option value="false" selected="<%= !isArchived %>">no</aui:option>
        <aui:option value="true" selected="<%= isArchived %>">yes</aui:option>
    </aui:select>

	<aui:button name="submitButton" type="submit" value="Submit" />
</aui:form>

<portlet:renderURL var="backURL">
	<portlet:param name="mvcPath" value="/jsp/district/edit_entries.jsp" />
</portlet:renderURL>

<aui:button name="back" type="submit" value="Back" href="<%= backURL %>" />









<!--  -->
