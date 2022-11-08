package com.register_farmers.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DistrictLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DistrictLocalService
 * @generated
 */
public class DistrictLocalServiceWrapper implements DistrictLocalService,
    ServiceWrapper<DistrictLocalService> {
    private DistrictLocalService _districtLocalService;

    public DistrictLocalServiceWrapper(
        DistrictLocalService districtLocalService) {
        _districtLocalService = districtLocalService;
    }

    /**
    * Adds the district to the database. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.District addDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.addDistrict(district);
    }

    /**
    * Creates a new district with the primary key. Does not add the district to the database.
    *
    * @param idDistrict the primary key for the new district
    * @return the new district
    */
    @Override
    public com.register_farmers.model.District createDistrict(long idDistrict) {
        return _districtLocalService.createDistrict(idDistrict);
    }

    /**
    * Deletes the district with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idDistrict the primary key of the district
    * @return the district that was removed
    * @throws PortalException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.District deleteDistrict(long idDistrict)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.deleteDistrict(idDistrict);
    }

    /**
    * Deletes the district from the database. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.District deleteDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.deleteDistrict(district);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _districtLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.register_farmers.model.District fetchDistrict(long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.fetchDistrict(idDistrict);
    }

    /**
    * Returns the district with the primary key.
    *
    * @param idDistrict the primary key of the district
    * @return the district
    * @throws PortalException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.District getDistrict(long idDistrict)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistrict(idDistrict);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.register_farmers.model.District> getDistricts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistricts(start, end);
    }

    /**
    * Returns the number of districts.
    *
    * @return the number of districts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDistrictsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistrictsCount();
    }

    /**
    * Updates the district in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param district the district
    * @return the district that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.District updateDistrict(
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.updateDistrict(district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.addFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerDistrict(long idFarmer,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.addFarmerDistrict(idFarmer, district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.addFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerDistricts(long idFarmer,
        java.util.List<com.register_farmers.model.District> Districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.addFarmerDistricts(idFarmer, Districts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void clearFarmerDistricts(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.clearFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.deleteFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerDistrict(long idFarmer,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.deleteFarmerDistrict(idFarmer, district);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.deleteFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerDistricts(long idFarmer,
        java.util.List<com.register_farmers.model.District> Districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.deleteFarmerDistricts(idFarmer, Districts);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getFarmerDistricts(idFarmer, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.District> getFarmerDistricts(
        long idFarmer, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getFarmerDistricts(idFarmer, start, end,
            orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFarmerDistrictsCount(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getFarmerDistrictsCount(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFarmerDistrict(long idFarmer, long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.hasFarmerDistrict(idFarmer, idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFarmerDistricts(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.hasFarmerDistricts(idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void setFarmerDistricts(long idFarmer, long[] idDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        _districtLocalService.setFarmerDistricts(idFarmer, idDistricts);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _districtLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _districtLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _districtLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.register_farmers.model.District addDistrict(
        java.lang.String name, int code, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.addDistrict(name, code, isArchived);
    }

    @Override
    public boolean isExist(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.isExist(name);
    }

    @Override
    public com.register_farmers.model.District getDistrictByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistrictByName(name);
    }

    @Override
    public java.util.List<com.register_farmers.model.District> getDistrictsByIsArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistrictsByIsArchived(isArchived,
            start, end);
    }

    @Override
    public int getDistrictsCountByIsArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _districtLocalService.getDistrictsCountByIsArchived(isArchived);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DistrictLocalService getWrappedDistrictLocalService() {
        return _districtLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDistrictLocalService(
        DistrictLocalService districtLocalService) {
        _districtLocalService = districtLocalService;
    }

    @Override
    public DistrictLocalService getWrappedService() {
        return _districtLocalService;
    }

    @Override
    public void setWrappedService(DistrictLocalService districtLocalService) {
        _districtLocalService = districtLocalService;
    }
}
