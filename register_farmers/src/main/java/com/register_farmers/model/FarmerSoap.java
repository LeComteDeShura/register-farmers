package com.register_farmers.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerSoap implements Serializable {
    private long _idFarmer;
    private String _name;
    private boolean _isArchived;
    private String _districtReg;
    private String _inn;
    private String _ogrn;
    private String _kpp;
    private String _opf;
    private Date _date;

    public FarmerSoap() {
    }

    public static FarmerSoap toSoapModel(Farmer model) {
        FarmerSoap soapModel = new FarmerSoap();

        soapModel.setIdFarmer(model.getIdFarmer());
        soapModel.setName(model.getName());
        soapModel.setIsArchived(model.getIsArchived());
        soapModel.setDistrictReg(model.getDistrictReg());
        soapModel.setInn(model.getInn());
        soapModel.setOgrn(model.getOgrn());
        soapModel.setKpp(model.getKpp());
        soapModel.setOpf(model.getOpf());
        soapModel.setDate(model.getDate());

        return soapModel;
    }

    public static FarmerSoap[] toSoapModels(Farmer[] models) {
        FarmerSoap[] soapModels = new FarmerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[][] toSoapModels(Farmer[][] models) {
        FarmerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FarmerSoap[models.length][models[0].length];
        } else {
            soapModels = new FarmerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[] toSoapModels(List<Farmer> models) {
        List<FarmerSoap> soapModels = new ArrayList<FarmerSoap>(models.size());

        for (Farmer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FarmerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idFarmer;
    }

    public void setPrimaryKey(long pk) {
        setIdFarmer(pk);
    }

    public long getIdFarmer() {
        return _idFarmer;
    }

    public void setIdFarmer(long idFarmer) {
        _idFarmer = idFarmer;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
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

    public String getDistrictReg() {
        return _districtReg;
    }

    public void setDistrictReg(String districtReg) {
        _districtReg = districtReg;
    }

    public String getInn() {
        return _inn;
    }

    public void setInn(String inn) {
        _inn = inn;
    }

    public String getOgrn() {
        return _ogrn;
    }

    public void setOgrn(String ogrn) {
        _ogrn = ogrn;
    }

    public String getKpp() {
        return _kpp;
    }

    public void setKpp(String kpp) {
        _kpp = kpp;
    }

    public String getOpf() {
        return _opf;
    }

    public void setOpf(String opf) {
        _opf = opf;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }
}
