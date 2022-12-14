package com.register_farmers.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.register_farmers.model.Farmer;

import java.util.List;

/**
 * The persistence utility for the farmer service. This utility wraps {@link FarmerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPersistence
 * @see FarmerPersistenceImpl
 * @generated
 */
public class FarmerUtil {
    private static FarmerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Farmer farmer) {
        getPersistence().clearCache(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Farmer update(Farmer farmer) throws SystemException {
        return getPersistence().update(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Farmer update(Farmer farmer, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(farmer, serviceContext);
    }

    /**
    * Returns all the farmers where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByIsArchived(
        boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIsArchived(isArchived);
    }

    /**
    * Returns a range of all the farmers where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByIsArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIsArchived(isArchived, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByIsArchived(
        boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByIsArchived(isArchived, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByIsArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence()
                   .findByIsArchived_First(isArchived, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByIsArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByIsArchived_First(isArchived, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByIsArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence()
                   .findByIsArchived_Last(isArchived, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByIsArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByIsArchived_Last(isArchived, orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where isArchived = &#63;.
    *
    * @param idFarmer the primary key of the current farmer
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register_farmers.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer[] findByIsArchived_PrevAndNext(
        long idFarmer, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence()
                   .findByIsArchived_PrevAndNext(idFarmer, isArchived,
            orderByComparator);
    }

    /**
    * Removes all the farmers where isArchived = &#63; from the database.
    *
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public static void removeByIsArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByIsArchived(isArchived);
    }

    /**
    * Returns the number of farmers where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByIsArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByIsArchived(isArchived);
    }

    /**
    * Returns all the farmers where inn = &#63;.
    *
    * @param inn the inn
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByInn(
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn);
    }

    /**
    * Returns a range of all the farmers where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByInn(
        java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByInn(
        java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInn(inn, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().findByInn_First(inn, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByInn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInn_First(inn, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().findByInn_Last(inn, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByInn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInn_Last(inn, orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where inn = &#63;.
    *
    * @param idFarmer the primary key of the current farmer
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register_farmers.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer[] findByInn_PrevAndNext(
        long idFarmer, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence()
                   .findByInn_PrevAndNext(idFarmer, inn, orderByComparator);
    }

    /**
    * Removes all the farmers where inn = &#63; from the database.
    *
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public static void removeByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByInn(inn);
    }

    /**
    * Returns the number of farmers where inn = &#63;.
    *
    * @param inn the inn
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByInn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInn(inn);
    }

    /**
    * Returns all the farmers where name = &#63;.
    *
    * @param name the name
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

    /**
    * Returns a range of all the farmers where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_First(name, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register_farmers.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_Last(name, orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where name = &#63;.
    *
    * @param idFarmer the primary key of the current farmer
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register_farmers.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer[] findByName_PrevAndNext(
        long idFarmer, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence()
                   .findByName_PrevAndNext(idFarmer, name, orderByComparator);
    }

    /**
    * Removes all the farmers where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Returns the number of farmers where name = &#63;.
    *
    * @param name the name
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public static void cacheResult(com.register_farmers.model.Farmer farmer) {
        getPersistence().cacheResult(farmer);
    }

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public static void cacheResult(
        java.util.List<com.register_farmers.model.Farmer> farmers) {
        getPersistence().cacheResult(farmers);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param idFarmer the primary key for the new farmer
    * @return the new farmer
    */
    public static com.register_farmers.model.Farmer create(long idFarmer) {
        return getPersistence().create(idFarmer);
    }

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFarmer the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.register_farmers.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer remove(long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().remove(idFarmer);
    }

    public static com.register_farmers.model.Farmer updateImpl(
        com.register_farmers.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(farmer);
    }

    /**
    * Returns the farmer with the primary key or throws a {@link com.register_farmers.NoSuchFarmerException} if it could not be found.
    *
    * @param idFarmer the primary key of the farmer
    * @return the farmer
    * @throws com.register_farmers.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer findByPrimaryKey(
        long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register_farmers.NoSuchFarmerException {
        return getPersistence().findByPrimaryKey(idFarmer);
    }

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idFarmer the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register_farmers.model.Farmer fetchByPrimaryKey(
        long idFarmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idFarmer);
    }

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.register_farmers.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getDistricts(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk);
    }

    /**
    * Returns a range of all the districts associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getDistricts(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk, start, end);
    }

    /**
    * Returns an ordered range of all the districts associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register_farmers.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register_farmers.model.District> getDistricts(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the number of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static int getDistrictsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistrictsSize(pk);
    }

    /**
    * Returns <code>true</code> if the district is associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @return <code>true</code> if the district is associated with the farmer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsDistrict(pk, districtPK);
    }

    /**
    * Returns <code>true</code> if the farmer has any districts associated with it.
    *
    * @param pk the primary key of the farmer to check for associations with districts
    * @return <code>true</code> if the farmer has any districts associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsDistricts(pk);
    }

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistrict(pk, districtPK);
    }

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrict(long pk,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistrict(pk, district);
    }

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public static void addDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistricts(pk, districtPKs);
    }

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public static void addDistricts(long pk,
        java.util.List<com.register_farmers.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistricts(pk, districts);
    }

    /**
    * Clears all associations between the farmer and its districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer to clear the associated districts from
    * @throws SystemException if a system exception occurred
    */
    public static void clearDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearDistricts(pk);
    }

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistrict(pk, districtPK);
    }

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistrict(long pk,
        com.register_farmers.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistrict(pk, district);
    }

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistricts(pk, districtPKs);
    }

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistricts(long pk,
        java.util.List<com.register_farmers.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistricts(pk, districts);
    }

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setDistricts(pk, districtPKs);
    }

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setDistricts(long pk,
        java.util.List<com.register_farmers.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setDistricts(pk, districts);
    }

    public static FarmerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FarmerPersistence) PortletBeanLocatorUtil.locate(com.register_farmers.service.ClpSerializer.getServletContextName(),
                    FarmerPersistence.class.getName());

            ReferenceRegistry.registerReference(FarmerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FarmerPersistence persistence) {
    }
}
