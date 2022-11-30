package com.github.markPolia.log.domain;

import java.util.Objects;

public class User {
    private String act;
    private String pwd;
    private String userId;
    private String id;
    private String idType;
    private String userType;
    private String mail;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(act, user.act)
                && Objects.equals(pwd, user.pwd)
                && Objects.equals(userId, user.userId)
                && Objects.equals(id, user.id)
                && Objects.equals(idType, user.idType)
                && Objects.equals(userType, user.userType)
                && Objects.equals(mail, user.mail)
                && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(act, pwd, userId, id, idType, userType, mail, phone);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String id) {
        this.userId = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}