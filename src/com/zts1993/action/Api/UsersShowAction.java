package com.zts1993.Action.Api;

import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.Bean.AuthCodes;
import com.zts1993.Bean.UserTemp;
import com.zts1993.Dao.AuthCodesDAO;
import com.zts1993.Dao.UserTempDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by TianShuo on 14-6-26.
 */
public class UsersShowAction extends ActionSupport {
    private static Logger log = LogManager.getLogger("UsersShowAction");

    /**
     * input
     */
    private String access_token;

    /**
     * output
     */
    private String name;
    private String nick;
    private String head;

    private String error;
    private String error_code;
    private String error_description;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String execute() throws Exception {

        log.debug("access_token:" + access_token);


        AuthCodesDAO authCodesDAO = new AuthCodesDAO();
        AuthCodes authCodes = new AuthCodes();
        try {
            authCodes = (AuthCodes) authCodesDAO.findByProperty("code", access_token).get(0);
        } catch (Exception e) {
            error = "expired_token";
            error_code = "21327";
            error_description = "token过期或者异常";
            return "error";
        }

        try {
            String uuid = authCodes.getUuid();
            UserTempDAO userTempDAO = new UserTempDAO();
            UserTemp userTemp = (UserTemp) userTempDAO.findByProperty("uuid", uuid).get(0);
            log.debug("userTemp:" + userTemp.toString());
            name = userTemp.getName();
            nick = userTemp.getNick();
            head = userTemp.getHead();
            return "success";

        } catch (Exception e) {
            error = "invalid user";
            error_code = "21326";
            error_description = "用户信息异常";
            return "error";
        }


    }
}
