package com.register_farmers.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.register_farmers.service.ClpSerializer;
import com.register_farmers.service.DistrictLocalServiceUtil;
import com.register_farmers.service.FarmerLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            DistrictLocalServiceUtil.clearService();

            FarmerLocalServiceUtil.clearService();
        }
    }
}
