<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>

<portlet:defineObjects />

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/jsp/district/add_entry.jsp" />
</portlet:renderURL>

<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/jsp/district/edit_entries.jsp" />
</portlet:renderURL>

<aui:button-row>
    <aui:button name="addEntry" type="submit" value="Add entry" href="<%= addEntryURL %>" />
    <aui:button name="editEntry" type="submit" value="Edit entry" href="<%= editEntryURL %>" />
</aui:button-row>



<liferay-ui:search-container delta="10" emptyResultsMessage="no data">
	<liferay-ui:search-container-results results="<%= DistrictLocalServiceUtil.getDistrictsByIsArchived(false, searchContainer.getStart(), searchContainer.getEnd()) %>" total="<%= DistrictLocalServiceUtil.getDistrictsCountByIsArchived(false) %>" />

	<liferay-ui:search-container-row className="com.register_farmers.model.District" keyProperty="idDistrict" modelVar="district">
	        <liferay-ui:search-container-column-text name="district name" cssClass="<%= district.getName() %>" value="<%= district.getName() %>" />
	        <liferay-ui:search-container-column-text name="district code" property="code" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
