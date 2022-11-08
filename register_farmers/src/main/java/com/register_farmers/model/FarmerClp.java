package com.register_farmers.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.register_farmers.service.ClpSerializer;
import com.register_farmers.service.FarmerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class FarmerClp extends BaseModelImpl<Farmer> implements Farmer {
    private long _idFarmer;
    private String _name;
    private boolean _isArchived;
    private String _districtReg;
    private String _inn;
    private String _ogrn;
    private String _kpp;
    private String _opf;
    private Date _date;
    private BaseModel<?> _farmerRemoteModel;
    private Class<?> _clpSerializerClass = com.register_farmers.service.ClpSerializer.class;

    public FarmerClp() {
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
    public long getPrimaryKey() {
        return _idFarmer;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdFarmer(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idFarmer;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idFarmer", getIdFarmer());
        attributes.put("name", getName());
        attributes.put("isArchived", getIsArchived());
        attributes.put("districtReg", getDistrictReg());
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

        String districtReg = (String) attributes.get("districtReg");

        if (districtReg != null) {
            setDistrictReg(districtReg);
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

    @Override
    public long getIdFarmer() {
        return _idFarmer;
    }

    @Override
    public void setIdFarmer(long idFarmer) {
        _idFarmer = idFarmer;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setIdFarmer", long.class);

                method.invoke(_farmerRemoteModel, idFarmer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_farmerRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIsArchived() {
        return _isArchived;
    }

    @Override
    public boolean isIsArchived() {
        return _isArchived;
    }

    @Override
    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_farmerRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDistrictReg() {
        return _districtReg;
    }

    @Override
    public void setDistrictReg(String districtReg) {
        _districtReg = districtReg;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setDistrictReg", String.class);

                method.invoke(_farmerRemoteModel, districtReg);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInn() {
        return _inn;
    }

    @Override
    public void setInn(String inn) {
        _inn = inn;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setInn", String.class);

                method.invoke(_farmerRemoteModel, inn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOgrn() {
        return _ogrn;
    }

    @Override
    public void setOgrn(String ogrn) {
        _ogrn = ogrn;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setOgrn", String.class);

                method.invoke(_farmerRemoteModel, ogrn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKpp() {
        return _kpp;
    }

    @Override
    public void setKpp(String kpp) {
        _kpp = kpp;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setKpp", String.class);

                method.invoke(_farmerRemoteModel, kpp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOpf() {
        return _opf;
    }

    @Override
    public void setOpf(String opf) {
        _opf = opf;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setOpf", String.class);

                method.invoke(_farmerRemoteModel, opf);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate() {
        return _date;
    }

    @Override
    public void setDate(Date date) {
        _date = date;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setDate", Date.class);

                method.invoke(_farmerRemoteModel, date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFarmerRemoteModel() {
        return _farmerRemoteModel;
    }

    public void setFarmerRemoteModel(BaseModel<?> farmerRemoteModel) {
        _farmerRemoteModel = farmerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _farmerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_farmerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FarmerLocalServiceUtil.addFarmer(this);
        } else {
            FarmerLocalServiceUtil.updateFarmer(this);
        }
    }

    @Override
    public Farmer toEscapedModel() {
        return (Farmer) ProxyUtil.newProxyInstance(Farmer.class.getClassLoader(),
            new Class[] { Farmer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FarmerClp clone = new FarmerClp();

        clone.setIdFarmer(getIdFarmer());
        clone.setName(getName());
        clone.setIsArchived(getIsArchived());
        clone.setDistrictReg(getDistrictReg());
        clone.setInn(getInn());
        clone.setOgrn(getOgrn());
        clone.setKpp(getKpp());
        clone.setOpf(getOpf());
        clone.setDate(getDate());

        return clone;
    }

    @Override
    public int compareTo(Farmer farmer) {
        long primaryKey = farmer.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerClp)) {
            return false;
        }

        FarmerClp farmer = (FarmerClp) obj;

        long primaryKey = farmer.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{idFarmer=");
        sb.append(getIdFarmer());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append(", districtReg=");
        sb.append(getDistrictReg());
        sb.append(", inn=");
        sb.append(getInn());
        sb.append(", ogrn=");
        sb.append(getOgrn());
        sb.append(", kpp=");
        sb.append(getKpp());
        sb.append(", opf=");
        sb.append(getOpf());
        sb.append(", date=");
        sb.append(getDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.register_farmers.model.Farmer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idFarmer</column-name><column-value><![CDATA[");
        sb.append(getIdFarmer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>districtReg</column-name><column-value><![CDATA[");
        sb.append(getDistrictReg());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inn</column-name><column-value><![CDATA[");
        sb.append(getInn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ogrn</column-name><column-value><![CDATA[");
        sb.append(getOgrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kpp</column-name><column-value><![CDATA[");
        sb.append(getKpp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>opf</column-name><column-value><![CDATA[");
        sb.append(getOpf());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date</column-name><column-value><![CDATA[");
        sb.append(getDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
