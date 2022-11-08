package com.register_farmers.controller;

import java.io.IOException;
import java.util.List;
import com.register_farmers.model.District;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.util.ParamUtil;
import com.register_farmers.service.DistrictLocalServiceUtil;
import com.register_farmers.service.persistence.DistrictUtil;
import com.register_farmers.service.ClpSerializer;
import com.register_farmers.service.DistrictLocalService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletConfig;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.SessionErrors;

public class DistrictController extends MVCPortlet {

    public void addEntryAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        String nameDistrict = actionRequest.getParameter("name");
        String code_ = actionRequest.getParameter("code");
        String isArchived_ = actionRequest.getParameter("isArchived");

        boolean isArchived = Boolean.parseBoolean(isArchived_);
        int code;
        if (!code_.isEmpty()) {
            code = Integer.parseInt(code_);
        } else {
            code = -1;
        }

        try {
            if(DistrictLocalServiceUtil.isExist(nameDistrict)){
                PortletPreferences prefs = actionRequest.getPreferences();
                PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
                SessionMessages.add(actionRequest, ((LiferayPortletConfig)portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

                actionResponse.setRenderParameter("errMsg", "'" + nameDistrict + "' disctrict existed.");
                SessionErrors.add(actionRequest, "district.exist");
                actionResponse.setRenderParameter("mvcPath", "/jsp/district/add_entry.jsp");
            } else {
                DistrictLocalServiceUtil.addDistrict(nameDistrict, code, isArchived);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void editEntriesAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
        String idDistrict = actionRequest.getParameter("idDistrict");

        actionResponse.setRenderParameter("idDistrict", idDistrict);
        actionResponse.setRenderParameter("mvcPath", "/jsp/district/edit_entry.jsp");
    }


    public void editEntryAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        long id = Long.parseLong(actionRequest.getParameter("idDistrict"));
        String nameDistrict = actionRequest.getParameter("name");
        String code_ = actionRequest.getParameter("code");
        boolean isArchived = Boolean.parseBoolean(actionRequest.getParameter("isArchived"));

        int code;
        if (!code_.isEmpty()) {
            code = Integer.parseInt(code_);
        } else {
            code = -1;
        }
        try {
            District district = DistrictLocalServiceUtil.getDistrictByName(nameDistrict);
            if (id == district.getIdDistrict()) {
                district.setName(nameDistrict);
                district.setCode(code);
                district.setIsArchived(isArchived);

                DistrictLocalServiceUtil.updateDistrict(district);
                actionResponse.setRenderParameter("mvcPath", "/jsp/district/edit_entries.jsp");
            } else {
                PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
                SessionMessages.add(actionRequest, ((LiferayPortletConfig)portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

                actionResponse.setRenderParameter("errMsg", "'" + nameDistrict + "' disctrict existed.");
                actionResponse.setRenderParameter("idDistrict", String.valueOf(id));
                SessionErrors.add(actionRequest, "district.exist");
                actionResponse.setRenderParameter("mvcPath", "/jsp/district/edit_entry.jsp");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
