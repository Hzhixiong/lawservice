package com.lut.demo.bean;

import java.io.Serializable;

public class Lawyer implements Serializable {
    private Integer lawyerid;

    private String lawyername;

    private String sex;

    private Integer officeid;

    private String introduce;

    private String phone;

    private String certificationid;

    private String pictureurl;

    private Integer pwsid;

    private static final long serialVersionUID = 1L;

    public Integer getLawyerid() {
        return lawyerid;
    }

    public void setLawyerid(Integer lawyerid) {
        this.lawyerid = lawyerid;
    }

    public String getLawyername() {
        return lawyername;
    }

    public void setLawyername(String lawyername) {
        this.lawyername = lawyername == null ? null : lawyername.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getOfficeid() {
        return officeid;
    }

    public void setOfficeid(Integer officeid) {
        this.officeid = officeid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCertificationid() {
        return certificationid;
    }

    public void setCertificationid(String certificationid) {
        this.certificationid = certificationid == null ? null : certificationid.trim();
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public Integer getPwsid() {
        return pwsid;
    }

    public void setPwsid(Integer pwsid) {
        this.pwsid = pwsid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lawyerid=").append(lawyerid);
        sb.append(", lawyername=").append(lawyername);
        sb.append(", sex=").append(sex);
        sb.append(", officeid=").append(officeid);
        sb.append(", introduce=").append(introduce);
        sb.append(", phone=").append(phone);
        sb.append(", certificationid=").append(certificationid);
        sb.append(", pictureurl=").append(pictureurl);
        sb.append(", pwsid=").append(pwsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}