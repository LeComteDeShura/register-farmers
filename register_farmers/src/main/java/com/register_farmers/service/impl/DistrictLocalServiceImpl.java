package com.register_farmers.service.impl;

import com.register_farmers.service.base.DistrictLocalServiceBaseImpl;
import com.register_farmers.service.DistrictLocalServiceUtil;
import com.register_farmers.model.District;
import com.register_farmers.service.persistence.DistrictUtil;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Date;

import java.text.SimpleDateFormat;
import com.liferay.portal.kernel.exception.SystemException;


import java.sql.SQLException;
/*
 * The implementation of the district local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.register_farmers.service.DistrictLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register_farmers.service.base.DistrictLocalServiceBaseImpl
 * @see com.register_farmers.service.DistrictLocalServiceUtil
 */
public class DistrictLocalServiceImpl extends DistrictLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.register_farmers.service.DistrictLocalServiceUtil} to access the district local service.
     */
     @Override
     public District addDistrict(String name, int code, boolean isArchived) throws SystemException
     {
         long id = counterLocalService.increment();
         District district = DistrictLocalServiceUtil.createDistrict(id);

         district.setName(name);
         district.setCode(code);
         district.setIsArchived(isArchived);

         DistrictLocalServiceUtil.addDistrict(district);

         return district;
     }

     public boolean isExist(String name) throws SystemException
     {
         List<District> districts = DistrictUtil.findByName(name);
         return districts.size() != 0;
     }

     public District getDistrictByName(String name) throws SystemException
     {
         return DistrictUtil.findByName(name).get(0);
     }


     public List<District> getDistrictsByIsArchived(boolean isArchived, int start, int end) throws SystemException
     {
         return DistrictUtil.findByIsArchived(isArchived, start, end);
     }

     public int getDistrictsCountByIsArchived(boolean isArchived) throws SystemException
     {
         return DistrictUtil.countByIsArchived(isArchived);
     }

}
