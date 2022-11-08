package com.register_farmers.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.register_farmers.model.Farmer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public long idFarmer;
    public String name;
    public boolean isArchived;
    public String districtReg;
    public String inn;
    public String ogrn;
    public String kpp;
    public String opf;
    public long date;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{idFarmer=");
        sb.append(idFarmer);
        sb.append(", name=");
        sb.append(name);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append(", districtReg=");
        sb.append(districtReg);
        sb.append(", inn=");
        sb.append(inn);
        sb.append(", ogrn=");
        sb.append(ogrn);
        sb.append(", kpp=");
        sb.append(kpp);
        sb.append(", opf=");
        sb.append(opf);
        sb.append(", date=");
        sb.append(date);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setIdFarmer(idFarmer);

        if (name == null) {
            farmerImpl.setName(StringPool.BLANK);
        } else {
            farmerImpl.setName(name);
        }

        farmerImpl.setIsArchived(isArchived);

        if (districtReg == null) {
            farmerImpl.setDistrictReg(StringPool.BLANK);
        } else {
            farmerImpl.setDistrictReg(districtReg);
        }

        if (inn == null) {
            farmerImpl.setInn(StringPool.BLANK);
        } else {
            farmerImpl.setInn(inn);
        }

        if (ogrn == null) {
            farmerImpl.setOgrn(StringPool.BLANK);
        } else {
            farmerImpl.setOgrn(ogrn);
        }

        if (kpp == null) {
            farmerImpl.setKpp(StringPool.BLANK);
        } else {
            farmerImpl.setKpp(kpp);
        }

        if (opf == null) {
            farmerImpl.setOpf(StringPool.BLANK);
        } else {
            farmerImpl.setOpf(opf);
        }

        if (date == Long.MIN_VALUE) {
            farmerImpl.setDate(null);
        } else {
            farmerImpl.setDate(new Date(date));
        }

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idFarmer = objectInput.readLong();
        name = objectInput.readUTF();
        isArchived = objectInput.readBoolean();
        districtReg = objectInput.readUTF();
        inn = objectInput.readUTF();
        ogrn = objectInput.readUTF();
        kpp = objectInput.readUTF();
        opf = objectInput.readUTF();
        date = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idFarmer);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeBoolean(isArchived);

        if (districtReg == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(districtReg);
        }

        if (inn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inn);
        }

        if (ogrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ogrn);
        }

        if (kpp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kpp);
        }

        if (opf == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(opf);
        }

        objectOutput.writeLong(date);
    }
}
