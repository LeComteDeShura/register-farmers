<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.FarmerLocalServiceUtil" %>
<%@ page import="com.register_farmers.model.Farmer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<portlet:defineObjects />



<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/jsp/farmer/add_entry.jsp" />
</portlet:renderURL>

<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/jsp/farmer/edit_entries.jsp" />
</portlet:renderURL>

<aui:button-row>
    <aui:button name="addEntry" type="submit" value="Add entry" href="<%= addEntryURL %>" />
    <aui:button name="editEntry" type="submit" value="Edit entry" href="<%= editEntryURL %>" />
</aui:button-row>


<portlet:actionURL name="searchFarmersAction" var="searchFarmersURL" />

<h4>search organizations</h4>

<aui:form name="searchForm" method="post" action="<%= searchFarmersURL %>">
    <aui:input label="name organization" name="name"  />
    <aui:input name="INN"  >
		<aui:validator  name="custom"  errorMessage="Please enter a value equal to 12 or 10." >
			function (val, fieldNode, ruleValue) {
				var result = false;
				if (val.length == 12 || val.length == 10) {
					result = true;
				}
				return result;
			}
		</aui:validator>
		<aui:validator name="number"></aui:validator>
	</aui:input >
    <aui:input label="registration district" name="districtReg" required="false" />

    <aui:select label="archive" name="isArchived">
		<aui:option value="">select</aui:option>
        <aui:option value="false">no</aui:option>
        <aui:option value="true">yes</aui:option>
    </aui:select>

    <aui:input name="startDate" id="Date" onClick="openDatePicker();"/>
	<aui:input name="endDate" id="Date"  onClick="openDatePicker();"/>

    <aui:button name="submitButton" type="submit" value="search" />
</aui:form>

<%

String name = renderRequest.getParameter("nameFarmer");

String inn = renderRequest.getParameter("INN");
String districtReg = renderRequest.getParameter("districtReg");

String isArchived = renderRequest.getParameter("isArchived");

String startDate = renderRequest.getParameter("startDate");
String endDate = renderRequest.getParameter("endDate");


boolean isSumbit = Boolean.parseBoolean(renderRequest.getParameter("isSumbit"));
List<Farmer> farmers = FarmerLocalServiceUtil.getFarmers(name, inn, districtReg, isArchived, startDate, endDate);
int totalFarmers = farmers.size();

%>


<liferay-ui:search-container delta="10" emptyResultsMessage="no data">
	<liferay-ui:search-form page="/jsp/farmer/add_entry.jsp" />
	<liferay-ui:search-container-results results="<%= farmers %>" total="<%= totalFarmers %>" />

	<liferay-ui:search-container-row className="com.register_farmers.model.Farmer" keyProperty="idFarmer" modelVar="farmer">
        <liferay-ui:search-container-column-text name="name" value="<%= farmer.getName() %>" />

		<liferay-ui:search-container-column-text name="INN" value="<%= farmer.getInn() %>" />
		<liferay-ui:search-container-column-text name="KPP" value="<%= farmer.getKpp() %>" />
		<liferay-ui:search-container-column-text name="OGRN" value="<%= farmer.getOgrn() %>" />
		<liferay-ui:search-container-column-text name="OPF" value="<%= farmer.getOpf() %>" />

		<liferay-ui:search-container-column-text name="date" property="date" />
		<liferay-ui:search-container-column-text name="district sown areas" value="<%= FarmerLocalServiceUtil.getDistrictNames(farmer.getIdFarmer()) %>" />

		<liferay-ui:search-container-column-text name="registration district" value="<%= FarmerLocalServiceUtil.getNameDistrictReg(farmer.getIdDistrictReg()) %>" />


	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>



<script>
    var datePicker;
    YUI().use('aui-base','aui-datepicker', function(Y) {
        datePicker = new Y.DatePicker({
            trigger: '#<portlet:namespace />Date',
            mask: '%d/%m/%Y',
            popover: {
                zIndex: 10,
            },
            calendar: {
                maximumDate: new Date()
            }
        });
    });
    function openDatePicker() {
        datePicker.getPopover().show();
    }
</script>
