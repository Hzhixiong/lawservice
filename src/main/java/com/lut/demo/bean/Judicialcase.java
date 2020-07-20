package com.lut.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Judicialcase implements Serializable {
    private Integer caseid;

    private String title;

    private String introduce;

    private String result;

    private String analyzes;

    private Date submitdate;

    private Integer clicks;

    private Integer lawyerid;

    private static final long serialVersionUID = 1L;

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getAnalyzes() {
        return analyzes;
    }

    public void setAnalyzes(String analyzes) {
        this.analyzes = analyzes == null ? null : analyzes.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
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
        sb.append(", caseid=").append(caseid);
        sb.append(", title=").append(title);
        sb.append(", introduce=").append(introduce);
        sb.append(", result=").append(result);
        sb.append(", analyzes=").append(analyzes);
        sb.append(", submitdate=").append(submitdate);
        sb.append(", clicks=").append(clicks);
        sb.append(", lawyerid=").append(lawyerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}