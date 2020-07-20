package com.lut.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Legalknowledge implements Serializable {
    private Integer lawid;

    private String title;

    private String content;

    private Date submitdate;

    private String pictureurl;

    private Integer clicks;

    private Integer lawyerid;

    private static final long serialVersionUID = 1L;

    public Integer getLawid() {
        return lawid;
    }

    public void setLawid(Integer lawid) {
        this.lawid = lawid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
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
        sb.append(", lawid=").append(lawid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", submitdate=").append(submitdate);
        sb.append(", pictureurl=").append(pictureurl);
        sb.append(", clicks=").append(clicks);
        sb.append(", lawyerid=").append(lawyerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}