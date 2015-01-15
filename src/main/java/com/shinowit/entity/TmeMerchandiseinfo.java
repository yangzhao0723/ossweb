package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeMerchandiseinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.MerchandiseID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.ID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.UnitID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private Byte unitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.ProStatusID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private Byte prostatusid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.MerchandiseCID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String merchandisecid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.MerchandiseName
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String merchandisename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.MerchandiseAB
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String merchandiseab;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.Price
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.SaleStatus
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private Boolean salestatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.Spec
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String spec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.Describe
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String describe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.PicPath
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String picpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.ClickCount
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private Integer clickcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseInfo.Remark
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.MerchandiseID
     *
     * @return the value of TMe_MerchandiseInfo.MerchandiseID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.MerchandiseID
     *
     * @param merchandiseid the value for TMe_MerchandiseInfo.MerchandiseID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setMerchandiseid(String merchandiseid) {
        this.merchandiseid = merchandiseid == null ? null : merchandiseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.ID
     *
     * @return the value of TMe_MerchandiseInfo.ID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.ID
     *
     * @param id the value for TMe_MerchandiseInfo.ID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.UnitID
     *
     * @return the value of TMe_MerchandiseInfo.UnitID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public Byte getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.UnitID
     *
     * @param unitid the value for TMe_MerchandiseInfo.UnitID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setUnitid(Byte unitid) {
        this.unitid = unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.ProStatusID
     *
     * @return the value of TMe_MerchandiseInfo.ProStatusID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public Byte getProstatusid() {
        return prostatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.ProStatusID
     *
     * @param prostatusid the value for TMe_MerchandiseInfo.ProStatusID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setProstatusid(Byte prostatusid) {
        this.prostatusid = prostatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.MerchandiseCID
     *
     * @return the value of TMe_MerchandiseInfo.MerchandiseCID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getMerchandisecid() {
        return merchandisecid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.MerchandiseCID
     *
     * @param merchandisecid the value for TMe_MerchandiseInfo.MerchandiseCID
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setMerchandisecid(String merchandisecid) {
        this.merchandisecid = merchandisecid == null ? null : merchandisecid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.MerchandiseName
     *
     * @return the value of TMe_MerchandiseInfo.MerchandiseName
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getMerchandisename() {
        return merchandisename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.MerchandiseName
     *
     * @param merchandisename the value for TMe_MerchandiseInfo.MerchandiseName
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setMerchandisename(String merchandisename) {
        this.merchandisename = merchandisename == null ? null : merchandisename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.MerchandiseAB
     *
     * @return the value of TMe_MerchandiseInfo.MerchandiseAB
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getMerchandiseab() {
        return merchandiseab;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.MerchandiseAB
     *
     * @param merchandiseab the value for TMe_MerchandiseInfo.MerchandiseAB
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setMerchandiseab(String merchandiseab) {
        this.merchandiseab = merchandiseab == null ? null : merchandiseab.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.Price
     *
     * @return the value of TMe_MerchandiseInfo.Price
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.Price
     *
     * @param price the value for TMe_MerchandiseInfo.Price
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.SaleStatus
     *
     * @return the value of TMe_MerchandiseInfo.SaleStatus
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public Boolean getSalestatus() {
        return salestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.SaleStatus
     *
     * @param salestatus the value for TMe_MerchandiseInfo.SaleStatus
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setSalestatus(Boolean salestatus) {
        this.salestatus = salestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.Spec
     *
     * @return the value of TMe_MerchandiseInfo.Spec
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getSpec() {
        return spec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.Spec
     *
     * @param spec the value for TMe_MerchandiseInfo.Spec
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.Describe
     *
     * @return the value of TMe_MerchandiseInfo.Describe
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.Describe
     *
     * @param describe the value for TMe_MerchandiseInfo.Describe
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.PicPath
     *
     * @return the value of TMe_MerchandiseInfo.PicPath
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.PicPath
     *
     * @param picpath the value for TMe_MerchandiseInfo.PicPath
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.ClickCount
     *
     * @return the value of TMe_MerchandiseInfo.ClickCount
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public Integer getClickcount() {
        return clickcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.ClickCount
     *
     * @param clickcount the value for TMe_MerchandiseInfo.ClickCount
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseInfo.Remark
     *
     * @return the value of TMe_MerchandiseInfo.Remark
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseInfo.Remark
     *
     * @param remark the value for TMe_MerchandiseInfo.Remark
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeMerchandiseinfo other = (TmeMerchandiseinfo) that;
        return (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUnitid() == null ? other.getUnitid() == null : this.getUnitid().equals(other.getUnitid()))
            && (this.getProstatusid() == null ? other.getProstatusid() == null : this.getProstatusid().equals(other.getProstatusid()))
            && (this.getMerchandisecid() == null ? other.getMerchandisecid() == null : this.getMerchandisecid().equals(other.getMerchandisecid()))
            && (this.getMerchandisename() == null ? other.getMerchandisename() == null : this.getMerchandisename().equals(other.getMerchandisename()))
            && (this.getMerchandiseab() == null ? other.getMerchandiseab() == null : this.getMerchandiseab().equals(other.getMerchandiseab()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSalestatus() == null ? other.getSalestatus() == null : this.getSalestatus().equals(other.getSalestatus()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getPicpath() == null ? other.getPicpath() == null : this.getPicpath().equals(other.getPicpath()))
            && (this.getClickcount() == null ? other.getClickcount() == null : this.getClickcount().equals(other.getClickcount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUnitid() == null) ? 0 : getUnitid().hashCode());
        result = prime * result + ((getProstatusid() == null) ? 0 : getProstatusid().hashCode());
        result = prime * result + ((getMerchandisecid() == null) ? 0 : getMerchandisecid().hashCode());
        result = prime * result + ((getMerchandisename() == null) ? 0 : getMerchandisename().hashCode());
        result = prime * result + ((getMerchandiseab() == null) ? 0 : getMerchandiseab().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSalestatus() == null) ? 0 : getSalestatus().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getPicpath() == null) ? 0 : getPicpath().hashCode());
        result = prime * result + ((getClickcount() == null) ? 0 : getClickcount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}