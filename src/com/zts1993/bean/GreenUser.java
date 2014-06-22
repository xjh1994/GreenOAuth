package com.zts1993.Bean;

import java.sql.Timestamp;

/**
 * Created by TianShuo on 14-5-23.
 */
public class GreenUser {
    private long userId;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private Timestamp userRegistered;
    private String userActivationKey;
    private Integer userStatus;

    public GreenUser(String userLogin, String userPass) {
        this.userLogin = userLogin;
        this.userPass = userPass;
    }

    public GreenUser() {
    }

    private String userIntro;
    private short userLevel;
    private String userSession;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Timestamp getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(Timestamp userRegistered) {
        this.userRegistered = userRegistered;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public short getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(short userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserSession() {
        return userSession;
    }

    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreenUser that = (GreenUser) o;

        if (userId != that.userId) return false;
        if (userLevel != that.userLevel) return false;
        if (userActivationKey != null ? !userActivationKey.equals(that.userActivationKey) : that.userActivationKey != null)
            return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userIntro != null ? !userIntro.equals(that.userIntro) : that.userIntro != null) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        if (userNicename != null ? !userNicename.equals(that.userNicename) : that.userNicename != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (userRegistered != null ? !userRegistered.equals(that.userRegistered) : that.userRegistered != null)
            return false;
        if (userSession != null ? !userSession.equals(that.userSession) : that.userSession != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        if (userUrl != null ? !userUrl.equals(that.userUrl) : that.userUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userNicename != null ? userNicename.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userUrl != null ? userUrl.hashCode() : 0);
        result = 31 * result + (userRegistered != null ? userRegistered.hashCode() : 0);
        result = 31 * result + (userActivationKey != null ? userActivationKey.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (userIntro != null ? userIntro.hashCode() : 0);
        result = 31 * result + (int) userLevel;
        result = 31 * result + (userSession != null ? userSession.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GreenUser{" +
                "userId=" + userId +
                ", userLogin='" + userLogin + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userNicename='" + userNicename + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userUrl='" + userUrl + '\'' +
                ", userRegistered=" + userRegistered +
                ", userActivationKey='" + userActivationKey + '\'' +
                ", userStatus=" + userStatus +
                ", userIntro='" + userIntro + '\'' +
                ", userLevel=" + userLevel +
                ", userSession='" + userSession + '\'' +
                '}';
    }
}
