<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>

<portlet:defineObjects />

<h5>View 1</h5>

<portlet:actionURL name="editEntriesAction" var="editEntryActionURL" />


<liferay-ui:search-container delta="10" emptyResultsMessage="no data">
	<liferay-ui:search-container-results results="<%= DistrictLocalServiceUtil.getDistricts(searchContainer.getStart(), searchContainer.getEnd()) %>"
										 total="<%= DistrictLocalServiceUtil.getDistrictsCount() %>" />
	<liferay-ui:search-container-row className="com.register_farmers.model.District" keyProperty="idDistrict" modelVar="district">
        <liferay-ui:search-container-column-text name="name" value="<%= district.getName() %>" />
        <liferay-ui:search-container-column-text name="code" property="code" />
        <liferay-ui:search-container-column-text name="archive" property="isArchived" />
        <liferay-ui:search-container-column-text name="" align="right">
            <aui:form name="edit" id="edit" method="post" action="<%= editEntryActionURL %>">
                <aui:input name="idDistrict" value="<%= district.getIdDistrict() %>" type="hidden"/>
                <aui:button name="submitButton" type="submit" value="edit" />
            </aui:form>

        </liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:renderURL var="mainURL">
	<portlet:param name="mvcPath" value="/jsp/district/main.jsp" />
</portlet:renderURL>

<aui:button name="main" type="submit" value="Back" href="<%= mainURL %>" />








<!--  -->
