package com.register_farmers.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for District. This utility wraps
 * {@link com.register_farmers.service.impl.DistrictLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DistrictLocalService
 * @see com.register_farmers.service.base.DistrictLocalServiceBaseImpl
 * @see com.register_farmers.service.impl.DistrictLocalServiceImpl
 * @generated
 */
public class DistrictLocalServiceUtil {
    private static DistrictLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.register_farmers.service.impl.DistrictLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the district to the database. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.District addDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDistrict(district);
    }

    /**
    * Creates a new district with the primary key. Does not add the district to the database.
    *
    * @param idDistrict the primary key for the new district
    * @return the new district
    */
    public static com.register_farmers.model.District createDistrict(
        long idDistrict) {
        return getService().createDistrict(idDistrict);
    }

    /**
    * Deletes the district with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idDistrict the primary key of the district
    * @return the district that was removed
    * @throws PortalException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.District deleteDistrict(
        long idDistrict)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDistrict(idDistrict);
    }

    /**
    * Deletes the district from the database. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.District deleteDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDistrict(district);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.register_farmers.model.District fetchDistrict(
        long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchDistrict(idDistrict);
    }

    /**
    * Returns the district with the primary key.
    *
    * @param idDistrict the primary key of the district
    * @return the district
    * @throws PortalException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.District getDistrict(
        long idDistrict)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrict(idDistrict);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the districts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getDistricts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistricts(start, end);
    }

    /**
    * Returns the number of districts.
    *
    * @return the number of districts
    * @throws SystemException if a system exception occurred
    */
    public static int getDistrictsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictsCount();
    }

    /**
    * Updates the district in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.District updateDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDistrict(district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmerDistrict(long idFarmer,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addFarmerDistrict(idFarmer, district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmerDistricts(long idFarmer,
        java.util.List<com.register_farmers.model.District> Districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addFarmerDistricts(idFarmer, Districts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void clearFarmerDistricts(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().clearFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteFarmerDistrict(long idFarmer,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteFarmerDistrict(idFarmer, district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteFarmerDistricts(long idFarmer,
        java.util.List<com.register_farmers.model.District> Districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteFarmerDistricts(idFarmer, Districts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmerDistricts(idFarmer, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmerDistricts(idFarmer, start, end, orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static int getFarmerDistrictsCount(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmerDistrictsCount(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasFarmerDistricts(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void setFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().setFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.register_farmers.model.District addDistrict(
        java.lang.String name, int code, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDistrict(name, code, isArchived);
    }

    public static boolean isExist(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isExist(name);
    }

    public static com.register_farmers.model.District getDistrictByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictByName(name);
    }

    public static java.util.List<com.register_farmers.model.District> getDistrictsByIsArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictsByIsArchived(isArchived, start, end);
    }

    public static int getDistrictsCountByIsArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictsCountByIsArchived(isArchived);
    }

    public static void clearService() {
        _service = null;
    }

    public static DistrictLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DistrictLocalService.class.getName());

            if (invokableLocalService instanceof DistrictLocalService) {
                _service = (DistrictLocalService) invokableLocalService;
            } else {
                _service = new DistrictLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(DistrictLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DistrictLocalService service) {
    }
}
