package com.lut.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Apply implements Serializable {
    private Integer applyid;

    private Integer userid;

    private String introduce;

    private Date submitdate;

    private String statsus;

    private Integer lawyerid;

    private static final long serialVersionUID = 1L;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getStatsus() {
        return statsus;
    }

    public void setStatsus(String statsus) {
        this.statsus = statsus == null ? null : statsus.trim();
    }

    public Integer getLawyerid() {
        return lawyerid;
    }

    public void setLawyerid(Integer lawyerid) {
        this.lawyerid = lawyerid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyid=").append(applyid);
        sb.append(", userid=").append(userid);
        sb.append(", introduce=").append(introduce);
        sb.append(", submitdate=").append(submitdate);
        sb.append(", statsus=").append(statsus);
        sb.append(", lawyerid=").append(lawyerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}