<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.register_farmers.service.DistrictLocalServiceUtil" %>
<%@ page import="com.register_farmers.model.District" %>
<%@ page import="java.util.List" %>

<portlet:defineObjects />

<h5>View 1</h5>


<portlet:actionURL name="addEntryAction" var="addFarmerURL" />



<%
    String errName = renderRequest.getParameter("errName");
    String errINN = renderRequest.getParameter("errINN");

    int totalDistricts = DistrictLocalServiceUtil.getDistrictsCountByIsArchived(false);
    List<District> districts = DistrictLocalServiceUtil.getDistrictsByIsArchived(false, 0, totalDistricts);
    renderRequest.setAttribute("districts", districts);
    renderRequest.setAttribute("totalDistricts", totalDistricts);
%>

<liferay-ui:error key="farmer.exist.name" message="<%= errName %>" />
<liferay-ui:error key="farmer.exist.INN" message="<%= errINN %>" />

<aui:form name="myForm" id="myForm" method="post" action="<%= addFarmerURL %>">
    <aui:input label="name organization" name="name" required="true" />

    <aui:select name="OPF" >
        <aui:option value="">select</aui:option>
        <aui:option value="entity">entity</aui:option>
        <aui:option value="individual">individual</aui:option>
        <aui:option value="individual_e">individual entrepreneur</aui:option>
    </aui:select>

    <aui:input name="INN"  required="true" >
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

    <aui:input name="KPP" >
        <aui:validator  name="custom"  errorMessage="Please enter a value equal to 9." >
            function (val, fieldNode, ruleValue) {
                var result = false;
                if (val.length == 9) {
                    result = true;
                }
                return result;
            }
        </aui:validator>
        <aui:validator name="number"></aui:validator>
    </aui:input >
    <aui:input name="OGRN" >
        <aui:validator  name="custom"  errorMessage="Please enter a value equal to 13." >
            function (val, fieldNode, ruleValue) {
                var result = false;
                if (val.length == 13) {
                    result = true;
                }
                return result;
            }
        </aui:validator>
        <aui:validator name="number"></aui:validator>
    </aui:input >

    <aui:input label="registration district" name="districtReg" required="false" />

    <aui:row>
        <aui:col width="<%= 33 %>">
        <aui:select id="select" name="select district" multiple="true">
            <c:forEach var="district" items="${districts}" >
                <aui:option cssClass="add a${ district.getName() }" selected="false"
                            value="${ district.getName() }" >
                        ${ district.getName() }
                </aui:option>
            </c:forEach>
        </aui:select>
        </aui:col>

        <aui:col width="<%= 33 %>" >
                <aui:input  type="hidden" label="" id="selectedDistricts" name="selectedDistricts" required="false" />
                <aui:button value="add district" name="add" type="button" onclick="addDistrict();" />
                <aui:button value="del district" name="delete" type="button" onclick="deleteDistrict();" />
        </aui:col>

        <aui:col width="<%= 33 %>">
            <aui:select label="selected district" id="selected" name="selected"  multiple="true">
                <c:forEach var="district" items="${districts}" >
                    <aui:option cssClass="selectedDis delete d${ district.getName() }" selected="false"
                                value="${ district.getName() }" >
                            ${ district.getName() }
                    </aui:option>
                </c:forEach>
            </aui:select>
        </aui:col>
    </aui:row>


    <aui:select label="archive" name="isArchived">
        <aui:option value="false">no</aui:option>
        <aui:option value="true">yes</aui:option>
    </aui:select>

    <aui:input label="registration date" name="date" id="date" onClick="openDatePicker();"/>

    <aui:button name="submitButton" type="submit" value="Submit"  />
</aui:form>


<portlet:renderURL var="mainURL">
	<portlet:param name="mvcPath" value="/jsp/farmer/main.jsp" />
</portlet:renderURL>

<aui:button name="main" type="submit" value="Back" href="<%= mainURL %>" />


<aui:script>
    var selectedDistricts = [];

    AUI().use('aui-base',function(A){
        var selected=A.all(".selectedDis");
        selected.each(
            function(object) {
            object.hide();
        });
    });

    function addDistrict() {
      var A = new AUI();
      var o = A.one('#<portlet:namespace />select').get('childNodes');
      var options = o.get('.add');


      for (const option of options) {

        if (option.get('selected')) {
          option.hide();
          option.removeAttribute("selected");
          var name = option.get('text').replace(/\s+/g, '');
          var selected = A.one('.d' + name);
          selected.set("selected", "selected");
          var temp = A.one('#<portlet:namespace />selectedDistricts');
          selectedDistricts.push(name);
          temp.set('value', selectedDistricts);
          selected.show();
        }
      }
    }


    function deleteDistrict() {
      var A = new AUI();
      var o = A.one('#<portlet:namespace />selected').get('childNodes');
      var options = o.get('.delete');

      for (const  option of options) {
        if (option.get('selected')) {
          option.hide();
          var name = option.get('text').replace(/\s+/g, '');
          var selected = A.one('.a' + name);
          var temp = A.one('#<portlet:namespace />selectedDistricts');
          selectedDistricts = selectedDistricts.filter(e => e !== name);
          temp.set('value', selectedDistricts);
          selected.show();
        }
      }
    }

    var datePicker;
    YUI().use('aui-base','aui-datepicker', function(Y) {
        datePicker = new Y.DatePicker({
            trigger: '#<portlet:namespace />date',
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




</aui:script>
