<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>
<%@ page import="com.register_farmers.service.FarmerLocalServiceUtil" %>
<%@ page import="com.register_farmers.model.Farmer" %>
<portlet:defineObjects />

<h5>View 1</h5>


<portlet:actionURL name="editEntriesAction" var="editEntryActionURL" />


<liferay-ui:search-container delta="10" emptyResultsMessage="no data">
	<liferay-ui:search-container-results results="<%= FarmerLocalServiceUtil.getFarmers(searchContainer.getStart(), searchContainer.getEnd()) %>"
										 total="<%= FarmerLocalServiceUtil.getFarmersCount() %>" />

	<liferay-ui:search-container-row className="com.register_farmers.model.Farmer" keyProperty="idFarmer" modelVar="farmer">



		<liferay-ui:search-container-column-text name="name organization" value="<%= farmer.getName() %>" />

		<liferay-ui:search-container-column-text name="INN" value="<%= farmer.getInn() %>" />
		<liferay-ui:search-container-column-text name="KPP" value="<%= farmer.getKpp() %>" />
		<liferay-ui:search-container-column-text name="OGRN" value="<%= farmer.getOgrn() %>" />
		<liferay-ui:search-container-column-text name="OPF" value="<%= farmer.getOpf() %>" />

		<liferay-ui:search-container-column-text name="registration date" property="date" />
		<%-- <liferay-ui:search-container-column-text name="" value="<%= FarmerLocalServiceUtil.getDistricts(farmer.getIdFarmer()) %>" /> --%>
		<liferay-ui:search-container-column-text name="registration district" value="<%= FarmerLocalServiceUtil.getNameDistrictReg(farmer.getIdDistrictReg()) %>" />
		<liferay-ui:search-container-column-text name="district sown areas" value="<%= FarmerLocalServiceUtil.getDistrictNames(farmer.getIdFarmer()) %>" />
        <liferay-ui:search-container-column-text name="" >
            <aui:form name="edit" id="edit" method="post" action="<%= editEntryActionURL %>">
                <aui:input name="idFarmer" value="<%= farmer.getIdFarmer() %>" type="hidden"/>
                <aui:button name="submitButton" type="submit" value="edit" />
            </aui:form>

        </liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:renderURL var="mainURL">
	<portlet:param name="mvcPath" value="/jsp/farmer/main.jsp" />
</portlet:renderURL>

<aui:button name="main" type="submit" value="Back" href="<%= mainURL %>" />








<!--  -->
