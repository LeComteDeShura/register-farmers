package com.register_farmers.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Farmer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @generated
 */
public class FarmerWrapper implements Farmer, ModelWrapper<Farmer> {
    private Farmer _farmer;

    public FarmerWrapper(Farmer farmer) {
        _farmer = farmer;
    }

    @Override
    public Class<?> getModelClass() {
        return Farmer.class;
    }

    @Override
    public String getModelClassName() {
        return Farmer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idFarmer", getIdFarmer());
        attributes.put("name", getName());
        attributes.put("isArchived", getIsArchived());
        attributes.put("idDistrictReg", getIdDistrictReg());
        attributes.put("inn", getInn());
        attributes.put("ogrn", getOgrn());
        attributes.put("kpp", getKpp());
        attributes.put("opf", getOpf());
        attributes.put("date", getDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idFarmer = (Long) attributes.get("idFarmer");

        if (idFarmer != null) {
            setIdFarmer(idFarmer);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }

        Long idDistrictReg = (Long) attributes.get("idDistrictReg");

        if (idDistrictReg != null) {
            setIdDistrictReg(idDistrictReg);
        }

        String inn = (String) attributes.get("inn");

        if (inn != null) {
            setInn(inn);
        }

        String ogrn = (String) attributes.get("ogrn");

        if (ogrn != null) {
            setOgrn(ogrn);
        }

        String kpp = (String) attributes.get("kpp");

        if (kpp != null) {
            setKpp(kpp);
        }

        String opf = (String) attributes.get("opf");

        if (opf != null) {
            setOpf(opf);
        }

        Date date = (Date) attributes.get("date");

        if (date != null) {
            setDate(date);
        }
    }

    /**
    * Returns the primary key of this farmer.
    *
    * @return the primary key of this farmer
    */
    @Override
    public long getPrimaryKey() {
        return _farmer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this farmer.
    *
    * @param primaryKey the primary key of this farmer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _farmer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id farmer of this farmer.
    *
    * @return the id farmer of this farmer
    */
    @Override
    public long getIdFarmer() {
        return _farmer.getIdFarmer();
    }

    /**
    * Sets the id farmer of this farmer.
    *
    * @param idFarmer the id farmer of this farmer
    */
    @Override
    public void setIdFarmer(long idFarmer) {
        _farmer.setIdFarmer(idFarmer);
    }

    /**
    * Returns the name of this farmer.
    *
    * @return the name of this farmer
    */
    @Override
    public java.lang.String getName() {
        return _farmer.getName();
    }

    /**
    * Sets the name of this farmer.
    *
    * @param name the name of this farmer
    */
    @Override
    public void setName(java.lang.String name) {
        _farmer.setName(name);
    }

    /**
    * Returns the is archived of this farmer.
    *
    * @return the is archived of this farmer
    */
    @Override
    public boolean getIsArchived() {
        return _farmer.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this farmer is is archived.
    *
    * @return <code>true</code> if this farmer is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _farmer.isIsArchived();
    }

    /**
    * Sets whether this farmer is is archived.
    *
    * @param isArchived the is archived of this farmer
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _farmer.setIsArchived(isArchived);
    }

    /**
    * Returns the id district reg of this farmer.
    *
    * @return the id district reg of this farmer
    */
    @Override
    public long getIdDistrictReg() {
        return _farmer.getIdDistrictReg();
    }

    /**
    * Sets the id district reg of this farmer.
    *
    * @param idDistrictReg the id district reg of this farmer
    */
    @Override
    public void setIdDistrictReg(long idDistrictReg) {
        _farmer.setIdDistrictReg(idDistrictReg);
    }

    /**
    * Returns the inn of this farmer.
    *
    * @return the inn of this farmer
    */
    @Override
    public java.lang.String getInn() {
        return _farmer.getInn();
    }

    /**
    * Sets the inn of this farmer.
    *
    * @param inn the inn of this farmer
    */
    @Override
    public void setInn(java.lang.String inn) {
        _farmer.setInn(inn);
    }

    /**
    * Returns the ogrn of this farmer.
    *
    * @return the ogrn of this farmer
    */
    @Override
    public java.lang.String getOgrn() {
        return _farmer.getOgrn();
    }

    /**
    * Sets the ogrn of this farmer.
    *
    * @param ogrn the ogrn of this farmer
    */
    @Override
    public void setOgrn(java.lang.String ogrn) {
        _farmer.setOgrn(ogrn);
    }

    /**
    * Returns the kpp of this farmer.
    *
    * @return the kpp of this farmer
    */
    @Override
    public java.lang.String getKpp() {
        return _farmer.getKpp();
    }

    /**
    * Sets the kpp of this farmer.
    *
    * @param kpp the kpp of this farmer
    */
    @Override
    public void setKpp(java.lang.String kpp) {
        _farmer.setKpp(kpp);
    }

    /**
    * Returns the opf of this farmer.
    *
    * @return the opf of this farmer
    */
    @Override
    public java.lang.String getOpf() {
        return _farmer.getOpf();
    }

    /**
    * Sets the opf of this farmer.
    *
    * @param opf the opf of this farmer
    */
    @Override
    public void setOpf(java.lang.String opf) {
        _farmer.setOpf(opf);
    }

    /**
    * Returns the date of this farmer.
    *
    * @return the date of this farmer
    */
    @Override
    public java.util.Date getDate() {
        return _farmer.getDate();
    }

    /**
    * Sets the date of this farmer.
    *
    * @param date the date of this farmer
    */
    @Override
    public void setDate(java.util.Date date) {
        _farmer.setDate(date);
    }

    @Override
    public boolean isNew() {
        return _farmer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _farmer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _farmer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _farmer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _farmer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _farmer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _farmer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _farmer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _farmer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _farmer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _farmer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FarmerWrapper((Farmer) _farmer.clone());
    }

    @Override
    public int compareTo(com.register_farmers.model.Farmer farmer) {
        return _farmer.compareTo(farmer);
    }

    @Override
    public int hashCode() {
        return _farmer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.register_farmers.model.Farmer> toCacheModel() {
        return _farmer.toCacheModel();
    }

    @Override
    public com.register_farmers.model.Farmer toEscapedModel() {
        return new FarmerWrapper(_farmer.toEscapedModel());
    }

    @Override
    public com.register_farmers.model.Farmer toUnescapedModel() {
        return new FarmerWrapper(_farmer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _farmer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _farmer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerWrapper)) {
            return false;
        }

        FarmerWrapper farmerWrapper = (FarmerWrapper) obj;

        if (Validator.equals(_farmer, farmerWrapper._farmer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Farmer getWrappedFarmer() {
        return _farmer;
    }

    @Override
    public Farmer getWrappedModel() {
        return _farmer;
    }

    @Override
    public void resetOriginalValues() {
        _farmer.resetOriginalValues();
    }
}
