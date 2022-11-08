package com.register_farmers.service.impl;

import com.register_farmers.service.base.FarmerLocalServiceBaseImpl;
import com.register_farmers.model.Farmer;
import com.register_farmers.model.District;
import com.register_farmers.model.impl.FarmerImpl;
import com.register_farmers.service.persistence.FarmerUtil;
import com.register_farmers.service.FarmerLocalServiceUtil;
import com.register_farmers.service.DistrictLocalServiceUtil;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.util.dao.orm.CustomSQLUtil;
import java.sql.SQLException;


/**
 * The implementation of the farmer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.register_farmers.service.FarmerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register_farmers.service.base.FarmerLocalServiceBaseImpl
 * @see com.register_farmers.service.FarmerLocalServiceUtil
 */
public class FarmerLocalServiceImpl extends FarmerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.register_farmers.service.FarmerLocalServiceUtil} to access the farmer local service.
     */

     @Override
     public Farmer addFarmer(String name,
                             String districtReg,
                             String districts[],
                             String INN,
                             String OGRN,
                             String KPP,
                             String OPF,
                             Date date,
                             boolean isArchived) throws SystemException
     {
         long idFarmer = counterLocalService.increment();
         Farmer farmer = FarmerLocalServiceUtil.createFarmer(idFarmer);

         farmer.setName(name);
         farmer.setDistrictReg(districtReg);
         farmer.setInn(INN);
         farmer.setOgrn(OGRN);
         farmer.setKpp(KPP);
         farmer.setOpf(OPF);
         farmer.setDate(date);
         farmer.setIsArchived(isArchived);

         if (districts != null && districts.length != 0) {
             long districtIds[] = new long[districts.length];
             for (int i = 0; i < districts.length ; i++) {
                 long id = DistrictLocalServiceUtil.getDistrictByName(districts[i]).getIdDistrict();
                 districtIds[i] = id;
                 System.out.println(idFarmer + " " + id);
             }
             DistrictLocalServiceUtil.addFarmerDistricts(idFarmer,  districtIds);
         }

         FarmerLocalServiceUtil.addFarmer(farmer);

         return farmer;
     }



     public List<Farmer> getFarmersByIsArchived(boolean isArchived, int start, int end) throws SystemException
     {
         List<Farmer> farmers = FarmerUtil.findByIsArchived(isArchived, start, end);
         System.out.println(farmers.get(0).getName());
         return FarmerUtil.findByIsArchived(isArchived, start, end);

     }

     public int getFarmersCountByIsArchived(boolean isArchived) throws SystemException
     {
         return FarmerUtil.countByIsArchived(isArchived);
     }

     public Farmer getFarmerByName(String name) throws SystemException
     {
         return FarmerUtil.findByName(name).get(0);
     }

     public Farmer getFarmerByInn(String INN) throws SystemException
     {
         return FarmerUtil.findByInn(INN).get(0);
     }

     public boolean isExistByName(String name) throws SystemException
     {
         List<Farmer> farmer = FarmerUtil.findByName(name);
         return farmer.size() != 0;
     }

     public boolean isExistByInn(String inn) throws SystemException
     {
         List<Farmer> farmer = FarmerUtil.findByInn(inn);
         return farmer.size() != 0;
     }

     @Override
     public String getDistricts(long idFarmer) throws SystemException
     {
         List<District> districts = DistrictLocalServiceUtil.getFarmerDistricts(idFarmer);
         ArrayList<String> districtNames = new ArrayList<String>();
         String result = "";

         for (District district : districts) {
             districtNames.add(district.getName());
             result += district.getName() + ",";
         }

         result = result.substring(0, result.length()-1);
         return result;

     }


    @Override
    public List<Farmer> getFarmers(String name,
                                   String INN,
                                   String districtReg,
                                   String isArchived,
                                   String startDate,
                                   String endDate) throws SystemException
    {
        Session session = farmerPersistence.openSession();
        String sql = "select * from farmer where ";
        try {
            if(!name.isEmpty())
                sql += "name = '" + name + "' and ";
            if(!INN.isEmpty())
                sql += "INN = '" + INN + "' and ";
            if(!districtReg.isEmpty())
                sql += "districtReg = '" + districtReg + "' and ";
            if(!isArchived.isEmpty())
                sql += "isArchived = " + isArchived + " and ";

            System.out.println(startDate + " " + endDate);
            if(!startDate.isEmpty() && !endDate.isEmpty())
                sql += "date_  between '" + startDate + "' and '" + endDate + "' and";

            sql = sql.replace("where and", "where");
            sql = sql.substring(0, sql.length()-4);

        } catch(Exception e) {
            sql = "select * from farmer";
        }

        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity("farmer", FarmerImpl.class);
        QueryPos pos = QueryPos.getInstance(sqlQuery);

        List<Farmer> farmers = (List<Farmer>)sqlQuery.list();
        farmerPersistence.closeSession(session);
        return farmers;
    }

}

























//
