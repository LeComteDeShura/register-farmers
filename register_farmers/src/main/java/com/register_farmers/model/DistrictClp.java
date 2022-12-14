package com.register_farmers.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.register_farmers.service.ClpSerializer;
import com.register_farmers.service.DistrictLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DistrictClp extends BaseModelImpl<District> implements District {
    private long _idDistrict;
    private String _name;
    private int _code;
    private boolean _isArchived;
    private BaseModel<?> _districtRemoteModel;
    private Class<?> _clpSerializerClass = com.register_farmers.service.ClpSerializer.class;

    public DistrictClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return District.class;
    }

    @Override
    public String getModelClassName() {
        return District.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _idDistrict;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdDistrict(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idDistrict;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idDistrict", getIdDistrict());
        attributes.put("name", getName());
        attributes.put("code", getCode());
        attributes.put("isArchived", getIsArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idDistrict = (Long) attributes.get("idDistrict");

        if (idDistrict != null) {
            setIdDistrict(idDistrict);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Integer code = (Integer) attributes.get("code");

        if (code != null) {
            setCode(code);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }
    }

    @Override
    public long getIdDistrict() {
        return _idDistrict;
    }

    @Override
    public void setIdDistrict(long idDistrict) {
        _idDistrict = idDistrict;

        if (_districtRemoteModel != null) {
            try {
                Class<?> clazz = _districtRemoteModel.getClass();

                Method method = clazz.getMethod("setIdDistrict", long.class);

                method.invoke(_districtRemoteModel, idDistrict);
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

        if (_districtRemoteModel != null) {
            try {
                Class<?> clazz = _districtRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_districtRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCode() {
        return _code;
    }

    @Override
    public void setCode(int code) {
        _code = code;

        if (_districtRemoteModel != null) {
            try {
                Class<?> clazz = _districtRemoteModel.getClass();

                Method method = clazz.getMethod("setCode", int.class);

                method.invoke(_districtRemoteModel, code);
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

        if (_districtRemoteModel != null) {
            try {
                Class<?> clazz = _districtRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_districtRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDistrictRemoteModel() {
        return _districtRemoteModel;
    }

    public void setDistrictRemoteModel(BaseModel<?> districtRemoteModel) {
        _districtRemoteModel = districtRemoteModel;
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

        Class<?> remoteModelClass = _districtRemoteModel.getClass();

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

        Object returnValue = method.invoke(_districtRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DistrictLocalServiceUtil.addDistrict(this);
        } else {
            DistrictLocalServiceUtil.updateDistrict(this);
        }
    }

    @Override
    public District toEscapedModel() {
        return (District) ProxyUtil.newProxyInstance(District.class.getClassLoader(),
            new Class[] { District.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DistrictClp clone = new DistrictClp();

        clone.setIdDistrict(getIdDistrict());
        clone.setName(getName());
        clone.setCode(getCode());
        clone.setIsArchived(getIsArchived());

        return clone;
    }

    @Override
    public int compareTo(District district) {
        long primaryKey = district.getPrimaryKey();

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

        if (!(obj instanceof DistrictClp)) {
            return false;
        }

        DistrictClp district = (DistrictClp) obj;

        long primaryKey = district.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{idDistrict=");
        sb.append(getIdDistrict());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", code=");
        sb.append(getCode());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.register_farmers.model.District");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idDistrict</column-name><column-value><![CDATA[");
        sb.append(getIdDistrict());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>code</column-name><column-value><![CDATA[");
        sb.append(getCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
