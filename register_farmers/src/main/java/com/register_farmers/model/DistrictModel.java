package com.register_farmers.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the District service. Represents a row in the &quot;district&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.register_farmers.model.impl.DistrictModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.register_farmers.model.impl.DistrictImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see District
 * @see com.register_farmers.model.impl.DistrictImpl
 * @see com.register_farmers.model.impl.DistrictModelImpl
 * @generated
 */
public interface DistrictModel extends BaseModel<District> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a district model instance should use the {@link District} interface instead.
     */

    /**
     * Returns the primary key of this district.
     *
     * @return the primary key of this district
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this district.
     *
     * @param primaryKey the primary key of this district
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the id district of this district.
     *
     * @return the id district of this district
     */
    public long getIdDistrict();

    /**
     * Sets the id district of this district.
     *
     * @param idDistrict the id district of this district
     */
    public void setIdDistrict(long idDistrict);

    /**
     * Returns the name of this district.
     *
     * @return the name of this district
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this district.
     *
     * @param name the name of this district
     */
    public void setName(String name);

    /**
     * Returns the code of this district.
     *
     * @return the code of this district
     */
    public int getCode();

    /**
     * Sets the code of this district.
     *
     * @param code the code of this district
     */
    public void setCode(int code);

    /**
     * Returns the is archived of this district.
     *
     * @return the is archived of this district
     */
    public boolean getIsArchived();

    /**
     * Returns <code>true</code> if this district is is archived.
     *
     * @return <code>true</code> if this district is is archived; <code>false</code> otherwise
     */
    public boolean isIsArchived();

    /**
     * Sets whether this district is is archived.
     *
     * @param isArchived the is archived of this district
     */
    public void setIsArchived(boolean isArchived);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.register_farmers.model.District district);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.register_farmers.model.District> toCacheModel();

    @Override
    public com.register_farmers.model.District toEscapedModel();

    @Override
    public com.register_farmers.model.District toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
