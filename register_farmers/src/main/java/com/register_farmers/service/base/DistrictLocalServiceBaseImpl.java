package com.register_farmers.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.register_farmers.model.District;

import com.register_farmers.service.DistrictLocalService;
import com.register_farmers.service.persistence.DistrictPersistence;
import com.register_farmers.service.persistence.FarmerPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the district local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.register_farmers.service.impl.DistrictLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register_farmers.service.impl.DistrictLocalServiceImpl
 * @see com.register_farmers.service.DistrictLocalServiceUtil
 * @generated
 */
public abstract class DistrictLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements DistrictLocalService, IdentifiableBean {
    @BeanReference(type = com.register_farmers.service.DistrictLocalService.class)
    protected com.register_farmers.service.DistrictLocalService districtLocalService;
    @BeanReference(type = DistrictPersistence.class)
    protected DistrictPersistence districtPersistence;
    @BeanReference(type = com.register_farmers.service.FarmerLocalService.class)
    protected com.register_farmers.service.FarmerLocalService farmerLocalService;
    @BeanReference(type = FarmerPersistence.class)
    protected FarmerPersistence farmerPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private DistrictLocalServiceClpInvoker _clpInvoker = new DistrictLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.register_farmers.service.DistrictLocalServiceUtil} to access the district local service.
     */

    /**
     * Adds the district to the database. Also notifies the appropriate model listeners.
     *
     * @param district the district
     * @return the district that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public District addDistrict(District district) throws SystemException {
        district.setNew(true);

        return districtPersistence.update(district);
    }

    /**
     * Creates a new district with the primary key. Does not add the district to the database.
     *
     * @param idDistrict the primary key for the new district
     * @return the new district
     */
    @Override
    public District createDistrict(long idDistrict) {
        return districtPersistence.create(idDistrict);
    }

    /**
     * Deletes the district with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idDistrict the primary key of the district
     * @return the district that was removed
     * @throws PortalException if a district with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public District deleteDistrict(long idDistrict)
        throws PortalException, SystemException {
        return districtPersistence.remove(idDistrict);
    }

    /**
     * Deletes the district from the database. Also notifies the appropriate model listeners.
     *
     * @param district the district
     * @return the district that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public District deleteDistrict(District district) throws SystemException {
        return districtPersistence.remove(district);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(District.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return districtPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return districtPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return districtPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return districtPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return districtPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public District fetchDistrict(long idDistrict) throws SystemException {
        return districtPersistence.fetchByPrimaryKey(idDistrict);
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
    public District getDistrict(long idDistrict)
        throws PortalException, SystemException {
        return districtPersistence.findByPrimaryKey(idDistrict);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return districtPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<District> getDistricts(int start, int end)
        throws SystemException {
        return districtPersistence.findAll(start, end);
    }

    /**
     * Returns the number of districts.
     *
     * @return the number of districts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDistrictsCount() throws SystemException {
        return districtPersistence.countAll();
    }

    /**
     * Updates the district in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param district the district
     * @return the district that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public District updateDistrict(District district) throws SystemException {
        return districtPersistence.update(district);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmerDistrict(long idFarmer, long idDistrict)
        throws SystemException {
        farmerPersistence.addDistrict(idFarmer, idDistrict);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmerDistrict(long idFarmer, District district)
        throws SystemException {
        farmerPersistence.addDistrict(idFarmer, district);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmerDistricts(long idFarmer, long[] idDistricts)
        throws SystemException {
        farmerPersistence.addDistricts(idFarmer, idDistricts);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmerDistricts(long idFarmer, List<District> Districts)
        throws SystemException {
        farmerPersistence.addDistricts(idFarmer, Districts);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearFarmerDistricts(long idFarmer) throws SystemException {
        farmerPersistence.clearDistricts(idFarmer);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void deleteFarmerDistrict(long idFarmer, long idDistrict)
        throws SystemException {
        farmerPersistence.removeDistrict(idFarmer, idDistrict);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void deleteFarmerDistrict(long idFarmer, District district)
        throws SystemException {
        farmerPersistence.removeDistrict(idFarmer, district);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void deleteFarmerDistricts(long idFarmer, long[] idDistricts)
        throws SystemException {
        farmerPersistence.removeDistricts(idFarmer, idDistricts);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void deleteFarmerDistricts(long idFarmer, List<District> Districts)
        throws SystemException {
        farmerPersistence.removeDistricts(idFarmer, Districts);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<District> getFarmerDistricts(long idFarmer)
        throws SystemException {
        return farmerPersistence.getDistricts(idFarmer);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<District> getFarmerDistricts(long idFarmer, int start, int end)
        throws SystemException {
        return farmerPersistence.getDistricts(idFarmer, start, end);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<District> getFarmerDistricts(long idFarmer, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return farmerPersistence.getDistricts(idFarmer, start, end,
            orderByComparator);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getFarmerDistrictsCount(long idFarmer) throws SystemException {
        return farmerPersistence.getDistrictsSize(idFarmer);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean hasFarmerDistrict(long idFarmer, long idDistrict)
        throws SystemException {
        return farmerPersistence.containsDistrict(idFarmer, idDistrict);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean hasFarmerDistricts(long idFarmer) throws SystemException {
        return farmerPersistence.containsDistricts(idFarmer);
    }

    /**
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setFarmerDistricts(long idFarmer, long[] idDistricts)
        throws SystemException {
        farmerPersistence.setDistricts(idFarmer, idDistricts);
    }

    /**
     * Returns the district local service.
     *
     * @return the district local service
     */
    public com.register_farmers.service.DistrictLocalService getDistrictLocalService() {
        return districtLocalService;
    }

    /**
     * Sets the district local service.
     *
     * @param districtLocalService the district local service
     */
    public void setDistrictLocalService(
        com.register_farmers.service.DistrictLocalService districtLocalService) {
        this.districtLocalService = districtLocalService;
    }

    /**
     * Returns the district persistence.
     *
     * @return the district persistence
     */
    public DistrictPersistence getDistrictPersistence() {
        return districtPersistence;
    }

    /**
     * Sets the district persistence.
     *
     * @param districtPersistence the district persistence
     */
    public void setDistrictPersistence(DistrictPersistence districtPersistence) {
        this.districtPersistence = districtPersistence;
    }

    /**
     * Returns the farmer local service.
     *
     * @return the farmer local service
     */
    public com.register_farmers.service.FarmerLocalService getFarmerLocalService() {
        return farmerLocalService;
    }

    /**
     * Sets the farmer local service.
     *
     * @param farmerLocalService the farmer local service
     */
    public void setFarmerLocalService(
        com.register_farmers.service.FarmerLocalService farmerLocalService) {
        this.farmerLocalService = farmerLocalService;
    }

    /**
     * Returns the farmer persistence.
     *
     * @return the farmer persistence
     */
    public FarmerPersistence getFarmerPersistence() {
        return farmerPersistence;
    }

    /**
     * Sets the farmer persistence.
     *
     * @param farmerPersistence the farmer persistence
     */
    public void setFarmerPersistence(FarmerPersistence farmerPersistence) {
        this.farmerPersistence = farmerPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.register_farmers.model.District",
            districtLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.register_farmers.model.District");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return District.class;
    }

    protected String getModelClassName() {
        return District.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = districtPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
