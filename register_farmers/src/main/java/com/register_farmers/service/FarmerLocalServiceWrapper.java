package com.register_farmers.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLocalService
 * @generated
 */
public class FarmerLocalServiceWrapper implements FarmerLocalService,
    ServiceWrapper<FarmerLocalService> {
    private FarmerLocalService _farmerLocalService;

    public FarmerLocalServiceWrapper(FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }

    /**
    * Adds the farmer to the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.Farmer addFarmer(
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.addFarmer(farmer);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param idFarmer the primary key for the new farmer
    * @return the new farmer
    */
    @Override
    public com.register_farmers.model.Farmer createFarmer(long idFarmer) {
        return _farmerLocalService.createFarmer(idFarmer);
    }

    /**
    * Deletes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFarmer the primary key of the farmer
    * @return the farmer that was removed
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.Farmer deleteFarmer(long idFarmer)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.deleteFarmer(idFarmer);
    }

    /**
    * Deletes the farmer from the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.Farmer deleteFarmer(
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.deleteFarmer(farmer);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _farmerLocalService.dynamicQuery();
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
        return _farmerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _farmerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _farmerLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _farmerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _farmerLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.register_farmers.model.Farmer fetchFarmer(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.fetchFarmer(idFarmer);
    }

    /**
    * Returns the farmer with the primary key.
    *
    * @param idFarmer the primary key of the farmer
    * @return the farmer
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.Farmer getFarmer(long idFarmer)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmer(idFarmer);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of farmers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.Farmer> getFarmers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(start, end);
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFarmersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCount();
    }

    /**
    * Updates the farmer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register_farmers.model.Farmer updateFarmer(
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.updateFarmer(farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addDistrictFarmer(long idDistrict, long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.addDistrictFarmer(idDistrict, idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addDistrictFarmer(long idDistrict,
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.addDistrictFarmer(idDistrict, farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addDistrictFarmers(long idDistrict, long[] idFarmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.addDistrictFarmers(idDistrict, idFarmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addDistrictFarmers(long idDistrict,
        java.util.List<com.register_farmers.model.Farmer> Farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.addDistrictFarmers(idDistrict, Farmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void clearDistrictFarmers(long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.clearDistrictFarmers(idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteDistrictFarmer(long idDistrict, long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.deleteDistrictFarmer(idDistrict, idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteDistrictFarmer(long idDistrict,
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.deleteDistrictFarmer(idDistrict, farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteDistrictFarmers(long idDistrict, long[] idFarmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.deleteDistrictFarmers(idDistrict, idFarmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteDistrictFarmers(long idDistrict,
        java.util.List<com.register_farmers.model.Farmer> Farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.deleteDistrictFarmers(idDistrict, Farmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.Farmer> getDistrictFarmers(
        long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getDistrictFarmers(idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.Farmer> getDistrictFarmers(
        long idDistrict, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getDistrictFarmers(idDistrict, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register_farmers.model.Farmer> getDistrictFarmers(
        long idDistrict, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getDistrictFarmers(idDistrict, start, end,
            orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDistrictFarmersCount(long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getDistrictFarmersCount(idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasDistrictFarmer(long idDistrict, long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.hasDistrictFarmer(idDistrict, idFarmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasDistrictFarmers(long idDistrict)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.hasDistrictFarmers(idDistrict);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void setDistrictFarmers(long idDistrict, long[] idFarmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmerLocalService.setDistrictFarmers(idDistrict, idFarmers);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _farmerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _farmerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _farmerLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.register_farmers.model.Farmer addFarmer(java.lang.String name,
        java.lang.String districtReg, java.lang.String[] districts,
        java.lang.String INN, java.lang.String OGRN, java.lang.String KPP,
        java.lang.String OPF, java.util.Date date, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.addFarmer(name, districtReg, districts, INN,
            OGRN, KPP, OPF, date, isArchived);
    }

    @Override
    public java.util.List<com.register_farmers.model.Farmer> getFarmersByIsArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersByIsArchived(isArchived, start, end);
    }

    @Override
    public int getFarmersCountByIsArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCountByIsArchived(isArchived);
    }

    @Override
    public com.register_farmers.model.Farmer getFarmerByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmerByName(name);
    }

    @Override
    public com.register_farmers.model.Farmer getFarmerByInn(
        java.lang.String INN)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmerByInn(INN);
    }

    @Override
    public boolean isExistByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.isExistByName(name);
    }

    @Override
    public boolean isExistByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.isExistByInn(inn);
    }

    @Override
    public java.lang.String getDistricts(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getDistricts(idFarmer);
    }

    @Override
    public java.util.List<com.register_farmers.model.Farmer> getFarmers(
        java.lang.String name, java.lang.String INN,
        java.lang.String districtReg, java.lang.String isArchived,
        java.lang.String startDate, java.lang.String endDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(name, INN, districtReg,
            isArchived, startDate, endDate);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FarmerLocalService getWrappedFarmerLocalService() {
        return _farmerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFarmerLocalService(
        FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }

    @Override
    public FarmerLocalService getWrappedService() {
        return _farmerLocalService;
    }

    @Override
    public void setWrappedService(FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }
}
