package com.register_farmers.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Farmer service. Represents a row in the &quot;farmer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.register_farmers.model.impl.FarmerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.register_farmers.model.impl.FarmerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @see com.register_farmers.model.impl.FarmerImpl
 * @see com.register_farmers.model.impl.FarmerModelImpl
 * @generated
 */
public interface FarmerModel extends BaseModel<Farmer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a farmer model instance should use the {@link Farmer} interface instead.
     */

    /**
     * Returns the primary key of this farmer.
     *
     * @return the primary key of this farmer
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this farmer.
     *
     * @param primaryKey the primary key of this farmer
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the id farmer of this farmer.
     *
     * @return the id farmer of this farmer
     */
    public long getIdFarmer();

    /**
     * Sets the id farmer of this farmer.
     *
     * @param idFarmer the id farmer of this farmer
     */
    public void setIdFarmer(long idFarmer);

    /**
     * Returns the name of this farmer.
     *
     * @return the name of this farmer
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this farmer.
     *
     * @param name the name of this farmer
     */
    public void setName(String name);

    /**
     * Returns the is archived of this farmer.
     *
     * @return the is archived of this farmer
     */
    public boolean getIsArchived();

    /**
     * Returns <code>true</code> if this farmer is is archived.
     *
     * @return <code>true</code> if this farmer is is archived; <code>false</code> otherwise
     */
    public boolean isIsArchived();

    /**
     * Sets whether this farmer is is archived.
     *
     * @param isArchived the is archived of this farmer
     */
    public void setIsArchived(boolean isArchived);

    /**
     * Returns the id district reg of this farmer.
     *
     * @return the id district reg of this farmer
     */
    public long getIdDistrictReg();

    /**
     * Sets the id district reg of this farmer.
     *
     * @param idDistrictReg the id district reg of this farmer
     */
    public void setIdDistrictReg(long idDistrictReg);

    /**
     * Returns the inn of this farmer.
     *
     * @return the inn of this farmer
     */
    @AutoEscape
    public String getInn();

    /**
     * Sets the inn of this farmer.
     *
     * @param inn the inn of this farmer
     */
    public void setInn(String inn);

    /**
     * Returns the ogrn of this farmer.
     *
     * @return the ogrn of this farmer
     */
    @AutoEscape
    public String getOgrn();

    /**
     * Sets the ogrn of this farmer.
     *
     * @param ogrn the ogrn of this farmer
     */
    public void setOgrn(String ogrn);

    /**
     * Returns the kpp of this farmer.
     *
     * @return the kpp of this farmer
     */
    @AutoEscape
    public String getKpp();

    /**
     * Sets the kpp of this farmer.
     *
     * @param kpp the kpp of this farmer
     */
    public void setKpp(String kpp);

    /**
     * Returns the opf of this farmer.
     *
     * @return the opf of this farmer
     */
    @AutoEscape
    public String getOpf();

    /**
     * Sets the opf of this farmer.
     *
     * @param opf the opf of this farmer
     */
    public void setOpf(String opf);

    /**
     * Returns the date of this farmer.
     *
     * @return the date of this farmer
     */
    public Date getDate();

    /**
     * Sets the date of this farmer.
     *
     * @param date the date of this farmer
     */
    public void setDate(Date date);

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
    public int compareTo(com.register_farmers.model.Farmer farmer);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.register_farmers.model.Farmer> toCacheModel();

    @Override
    public com.register_farmers.model.Farmer toEscapedModel();

    @Override
    public com.register_farmers.model.Farmer toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
