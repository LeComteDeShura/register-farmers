package com.register_farmers.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DistrictSoap implements Serializable {
    private long _idDistrict;
    private String _name;
    private int _code;
    private boolean _isArchived;

    public DistrictSoap() {
    }

    public static DistrictSoap toSoapModel(District model) {
        DistrictSoap soapModel = new DistrictSoap();

        soapModel.setIdDistrict(model.getIdDistrict());
        soapModel.setName(model.getName());
        soapModel.setCode(model.getCode());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static DistrictSoap[] toSoapModels(District[] models) {
        DistrictSoap[] soapModels = new DistrictSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DistrictSoap[][] toSoapModels(District[][] models) {
        DistrictSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DistrictSoap[models.length][models[0].length];
        } else {
            soapModels = new DistrictSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DistrictSoap[] toSoapModels(List<District> models) {
        List<DistrictSoap> soapModels = new ArrayList<DistrictSoap>(models.size());

        for (District model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DistrictSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idDistrict;
    }

    public void setPrimaryKey(long pk) {
        setIdDistrict(pk);
    }

    public long getIdDistrict() {
        return _idDistrict;
    }

    public void setIdDistrict(long idDistrict) {
        _idDistrict = idDistrict;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getCode() {
        return _code;
    }

    public void setCode(int code) {
        _code = code;
    }

    public boolean getIsArchived() {
        return _isArchived;
    }

    public boolean isIsArchived() {
        return _isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;
    }
}
