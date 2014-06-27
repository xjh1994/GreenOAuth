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

        AuthCodes authCodes = (AuthCodes) authCodesDAO.findByProperty("code", access_token).get(0);
//to get uid

        log.debug("authCodes:" + authCodes.toString());


        String uuid = authCodes.getUuid();
        UserTempDAO userTempDAO = new UserTempDAO();
        UserTemp userTemp = (UserTemp) userTempDAO.findByProperty("uuid", uuid).get(0);
        log.debug("userTemp:" + userTemp.toString());

        name = userTemp.getName();
        nick = userTemp.getNick();
        head = userTemp.getHead();
        return "success";


    }
}
