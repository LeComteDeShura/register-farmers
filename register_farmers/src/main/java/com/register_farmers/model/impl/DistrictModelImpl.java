package com.register_farmers.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.register_farmers.model.District;
import com.register_farmers.model.DistrictModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the District service. Represents a row in the &quot;district&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.register_farmers.model.DistrictModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DistrictImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DistrictImpl
 * @see com.register_farmers.model.District
 * @see com.register_farmers.model.DistrictModel
 * @generated
 */
public class DistrictModelImpl extends BaseModelImpl<District>
    implements DistrictModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a district model instance should use the {@link com.register_farmers.model.District} interface instead.
     */
    public static final String TABLE_NAME = "district";
    public static final Object[][] TABLE_COLUMNS = {
            { "idDistrict", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "code_", Types.INTEGER },
            { "isArchived", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table district (idDistrict LONG not null primary key,name VARCHAR(75) null,code_ INTEGER,isArchived BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table district";
    public static final String ORDER_BY_JPQL = " ORDER BY district.idDistrict ASC";
    public static final String ORDER_BY_SQL = " ORDER BY district.idDistrict ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.register_farmers.model.District"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.register_farmers.model.District"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.register_farmers.model.District"),
            true);
    public static long ISARCHIVED_COLUMN_BITMASK = 1L;
    public static long NAME_COLUMN_BITMASK = 2L;
    public static long IDDISTRICT_COLUMN_BITMASK = 4L;
    public static final String MAPPING_TABLE_AAA_FARMERS_DISTRICTS_NAME = "aaa_Farmers_Districts";
    public static final Object[][] MAPPING_TABLE_AAA_FARMERS_DISTRICTS_COLUMNS = {
            { "idDistrict", Types.BIGINT },
            { "idFarmer", Types.BIGINT }
        };
    public static final String MAPPING_TABLE_AAA_FARMERS_DISTRICTS_SQL_CREATE = "create table aaa_Farmers_Districts (idDistrict LONG not null,idFarmer LONG not null,primary key (idDistrict, idFarmer))";
    public static final boolean FINDER_CACHE_ENABLED_AAA_FARMERS_DISTRICTS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.aaa_Farmers_Districts"), true);
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.register_farmers.model.District"));
    private static ClassLoader _classLoader = District.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            District.class
        };
    private long _idDistrict;
    private String _name;
    private String _originalName;
    private int _code;
    private boolean _isArchived;
    private boolean _originalIsArchived;
    private boolean _setOriginalIsArchived;
    private long _columnBitmask;
    private District _escapedModel;

    public DistrictModelImpl() {
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
    public Class<?> getModelClass() {
        return District.class;
    }

    @Override
    public String getModelClassName() {
        return District.class.getName();
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
    }

    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _columnBitmask |= NAME_COLUMN_BITMASK;

        if (_originalName == null) {
            _originalName = _name;
        }

        _name = name;
    }

    public String getOriginalName() {
        return GetterUtil.getString(_originalName);
    }

    @Override
    public int getCode() {
        return _code;
    }

    @Override
    public void setCode(int code) {
        _code = code;
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
        _columnBitmask |= ISARCHIVED_COLUMN_BITMASK;

        if (!_setOriginalIsArchived) {
            _setOriginalIsArchived = true;

            _originalIsArchived = _isArchived;
        }

        _isArchived = isArchived;
    }

    public boolean getOriginalIsArchived() {
        return _originalIsArchived;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            District.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public District toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (District) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DistrictImpl districtImpl = new DistrictImpl();

        districtImpl.setIdDistrict(getIdDistrict());
        districtImpl.setName(getName());
        districtImpl.setCode(getCode());
        districtImpl.setIsArchived(getIsArchived());

        districtImpl.resetOriginalValues();

        return districtImpl;
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

        if (!(obj instanceof District)) {
            return false;
        }

        District district = (District) obj;

        long primaryKey = district.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        DistrictModelImpl districtModelImpl = this;

        districtModelImpl._originalName = districtModelImpl._name;

        districtModelImpl._originalIsArchived = districtModelImpl._isArchived;

        districtModelImpl._setOriginalIsArchived = false;

        districtModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<District> toCacheModel() {
        DistrictCacheModel districtCacheModel = new DistrictCacheModel();

        districtCacheModel.idDistrict = getIdDistrict();

        districtCacheModel.name = getName();

        String name = districtCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            districtCacheModel.name = null;
        }

        districtCacheModel.code = getCode();

        districtCacheModel.isArchived = getIsArchived();

        return districtCacheModel;
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
