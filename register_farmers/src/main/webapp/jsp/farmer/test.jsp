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
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.register_farmers.service.FarmerLocalServiceUtil" %>
<%@ page import="com.register_farmers.model.Farmer" %>

<portlet:defineObjects />


<%
    String errMsg = renderRequest.getParameter("errMsg");
    int totalDistricts = DistrictLocalServiceUtil.getDistrictsCountByIsArchived(false);
    List<District> districts = DistrictLocalServiceUtil.getDistrictsByIsArchived(false, 0, totalDistricts);
    renderRequest.setAttribute("districts", districts);
    renderRequest.setAttribute("totalDistricts", totalDistricts);
%>

<aui:row>
	<aui:col cssClass="width123"  width="<%= 20 %>">
    <aui:select id="selectDistricts" name="selectDistricts" cssClass="" multiple="true">
        <c:forEach var="district" items="${districts}" >
            <aui:option cssClass="add a${ district.getName() }" selected="false" value="${ district.getName() }" >${ district.getName() }</aui:option>
        </c:forEach>
    </aui:select>
    </aui:col>

    <aui:col width="<%= 20 %>" >

            <aui:button cssClass="cu" value="add" name="add" type="submit" onclick="addd();" />

            <aui:button value="delete" name="delete" type="submit" onclick="deletee();" />

    </aui:col>


    <aui:col cssClass="width123"  width="<%= 20 %>">
        <aui:select id="selectedDistricts" name="selectedDistricts" cssClass="" multiple="true">
            <c:forEach var="district" items="${districts}" >
                <aui:option cssClass="selectedDis delete d${ district.getName() }" selected="false" value="${ district.getName() }" >${ district.getName() }</aui:option>
            </c:forEach>
        </aui:select>
    </aui:col>
</aui:row>

<%-- <style type="text/css">
.cu{
    margin-top: 5%;
}
</style> --%>

<aui:script>

    AUI().use('aui-base',function(A){
    var selected=A.all(".selectedDis");
    selected.each(
    function(object) {
    object.hide();
    });
    });

    function addd() {
  var A = new AUI();
  var options = A.one('#<portlet:namespace />selectDistricts').get('childNodes');
  var lol = options.get('.add');

  console.log(lol);
  for (const l of lol) {
    console.log(l.get('text'));
    if (l.get('selected')) {
      l.hide();
      var name = l.get('text').replace(/\s+/g, '');
      console.log(".d"+name);
      var selected = A.one('.d'+name);
      selected.show();
    }
  }
}

function deletee() {
  var A = new AUI();
  var options = A.one('#<portlet:namespace />selectedDistricts').get('childNodes').get('.delete');

  console.log(options);
  for (const option of options) {
    console.log(option.get('text'));
    if (option.get('selected')) {
      option.hide();
      var name = option.get('text').replace(/\s+/g, '');
      console.log(".a"+name);
      var selected = A.one('.a'+name).show();
    }
  }
}
</aui:script>
