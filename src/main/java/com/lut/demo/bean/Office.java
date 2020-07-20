package com.lut.demo.bean;

import java.io.Serializable;

public class Office implements Serializable {
    private Integer officeid;

    private String officename;

    private String adress;

    private String introduce;

    private String phone;

    private String pictureurl;

    private Integer pwsid;

    private static final long serialVersionUID = 1L;

    public Integer getOfficeid() {
        return officeid;
    }

    public void setOfficeid(Integer officeid) {
        this.officeid = officeid;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename == null ? null : officename.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
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
        sb.append(", officeid=").append(officeid);
        sb.append(", officename=").append(officename);
        sb.append(", adress=").append(adress);
        sb.append(", introduce=").append(introduce);
        sb.append(", phone=").append(phone);
        sb.append(", pictureurl=").append(pictureurl);
        sb.append(", pwsid=").append(pwsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}