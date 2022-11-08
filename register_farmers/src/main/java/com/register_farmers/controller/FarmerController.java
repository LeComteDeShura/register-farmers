package com.register_farmers.controller;

import java.io.IOException;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.register_farmers.model.Farmer;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.util.ParamUtil;
import com.register_farmers.service.FarmerLocalServiceUtil;
import com.register_farmers.service.persistence.FarmerUtil;
import com.register_farmers.service.ClpSerializer;
import com.register_farmers.service.FarmerLocalService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletConfig;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.SessionErrors;

public class FarmerController extends MVCPortlet {

    public void addEntryAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        try {
            String nameFarmer = actionRequest.getParameter("name");
            String INN = actionRequest.getParameter("INN");
            String OGRN = actionRequest.getParameter("OGRN");
            String KPP = actionRequest.getParameter("KPP");
            String OPF = actionRequest.getParameter("OPF");
            String districtReg = actionRequest.getParameter("districtReg");
            boolean isArchived = Boolean.parseBoolean(actionRequest.getParameter("isArchived"));
            String date_ = actionRequest.getParameter("date");
            String districts[] =  actionRequest.getParameter("selectedDistricts").split(",");

            if (date_ == "")
                date_ = "01/01/1970";
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date_);


            if(FarmerLocalServiceUtil.isExistByName(nameFarmer)){

                PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
                SessionMessages.add(actionRequest, ((LiferayPortletConfig)portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

                SessionErrors.add(actionRequest, "farmer.exist.name");
                actionResponse.setRenderParameter( "errName", "'" + nameFarmer + "' farmer existed.");
                actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/add_entry.jsp");
                if (FarmerLocalServiceUtil.isExistByInn(INN)) {
                    SessionErrors.add(actionRequest, "farmer.exist.INN");
                    actionResponse.setRenderParameter( "errINN", "'" + INN + "' farmer existed.");
                    actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/add_entry.jsp");
                }
            } else {
                FarmerLocalServiceUtil.addFarmer(nameFarmer, districtReg, districts, INN,
                                                 OGRN, KPP, OPF, date, isArchived);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void searchFarmersAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        try {
            String nameFarmer = actionRequest.getParameter("name");
            String INN = actionRequest.getParameter("INN");
            String districtReg = actionRequest.getParameter("districtReg");
            String isArchived = actionRequest.getParameter("isArchived");
            String startDate_ = actionRequest.getParameter("startDate");
            String endDate_ = actionRequest.getParameter("endDate");

            actionResponse.setRenderParameter( "nameFarmer", nameFarmer);
            actionResponse.setRenderParameter( "INN", INN);
            actionResponse.setRenderParameter( "districtReg", districtReg);
            actionResponse.setRenderParameter( "isArchived", isArchived);
            actionResponse.setRenderParameter( "startDate", startDate_);
            actionResponse.setRenderParameter( "endDate", endDate_);
            actionResponse.setRenderParameter( "isSumbit", "true");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void editEntriesAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
        String idFarmer = actionRequest.getParameter("idFarmer");

        actionResponse.setRenderParameter("idFarmer", idFarmer);
        actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/edit_entry.jsp");

    }

    public void editEntryAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        try {

            long id = Long.parseLong(actionRequest.getParameter("idFarmer"));
            // District district = FarmerLocalServiceUtil.getDistrict(id);


            String nameFarmer = actionRequest.getParameter("name");
            String INN = actionRequest.getParameter("INN");
            String OGRN = actionRequest.getParameter("OGRN");
            String KPP = actionRequest.getParameter("KPP");
            String OPF = actionRequest.getParameter("OPF");
            String districtReg = actionRequest.getParameter("districtReg");
            boolean isArchived = Boolean.parseBoolean(actionRequest.getParameter("isArchived"));
            String date_ = actionRequest.getParameter("date");
            String districts[] =  actionRequest.getParameter("selectedDistricts").split(",");

            if (date_ == "")
                date_ = "01/01/1970";
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date_);

            Farmer farmer_ = FarmerLocalServiceUtil.getFarmerByName(nameFarmer);

            if (id != farmer_.getIdFarmer()) {
                PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
                SessionMessages.add(actionRequest, ((LiferayPortletConfig)portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

                actionResponse.setRenderParameter("idFarmer", String.valueOf(id));
                actionResponse.setRenderParameter("errName", "'" + nameFarmer + "' disctrict existed.");

                SessionErrors.add(actionRequest, "district.exist.name");
                actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/edit_entry.jsp");

                farmer_ = FarmerLocalServiceUtil.getFarmerByInn(INN);
                if (id != farmer_.getIdFarmer()) {
                    actionResponse.setRenderParameter("errINN", "'" + INN + "' disctrict existed.");

                    SessionErrors.add(actionRequest, "district.exist.INN");
                    actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/edit_entry.jsp");
                }
                return;
            }

            FarmerLocalServiceUtil.deleteFarmer(id);

            FarmerLocalServiceUtil.addFarmer(nameFarmer, districtReg, districts, INN,
                                             OGRN, KPP, OPF, date, isArchived);
            actionResponse.setRenderParameter("mvcPath", "/jsp/farmer/edit_entries.jsp");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
