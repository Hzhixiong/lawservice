package com.lut.demo.bean;

import java.io.Serializable;

public class Pws implements Serializable {
    private Integer pwsid;

    private String account;

    private String pw;

    private Integer authority;

    private static final long serialVersionUID = 1L;

    public Integer getPwsid() {
        return pwsid;
    }

    public void setPwsid(Integer pwsid) {
        this.pwsid = pwsid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pwsid=").append(pwsid);
        sb.append(", account=").append(account);
        sb.append(", pw=").append(pw);
        sb.append(", authority=").append(authority);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}