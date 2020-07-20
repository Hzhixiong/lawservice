package com.lut.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Complain implements Serializable {
    private Integer complainid;

    private Integer userid;

    private Integer applyid;

    private String introduce;

    private String statsus;

    private Date submitdate;

    private static final long serialVersionUID = 1L;

    public Integer getComplainid() {
        return complainid;
    }

    public void setComplainid(Integer complainid) {
        this.complainid = complainid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getStatsus() {
        return statsus;
    }

    public void setStatsus(String statsus) {
        this.statsus = statsus == null ? null : statsus.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", complainid=").append(complainid);
        sb.append(", userid=").append(userid);
        sb.append(", applyid=").append(applyid);
        sb.append(", introduce=").append(introduce);
        sb.append(", statsus=").append(statsus);
        sb.append(", submitdate=").append(submitdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}