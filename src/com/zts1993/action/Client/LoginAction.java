package com.zts1993.Action.Client;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.Bean.UserTemp;
import com.zts1993.Dao.UserTempDAO;
import com.zts1993.Service.KczlLoginService;
import com.zts1993.Util.GreenOAUthHash;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


/**
 * 登陆方法每个系统需要定制的部分
 * Created by TianShuo on 14-6-22.
 */
public class LoginAction extends ActionSupport {
    public String getRedirect_uri_login() {
        return redirect_uri_login;
    }

    public void setRedirect_uri_login(String redirect_uri_login) {
        this.redirect_uri_login = redirect_uri_login;
    }

    private static Logger log = LogManager.getLogger("LoginAction");

    private String userId;
    private String passwd;
    private String redirect_uri_login;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public String execute() throws Exception {
        String jsonString = "";

        JSONObject jsonObj;
        try {

            KczlLoginService kczlLoginService = new KczlLoginService(userId, passwd);
            String result = kczlLoginService.login();
            jsonString = kczlLoginService.getStrResult();

            log.debug(result);
            log.debug(jsonString);

            if (result.equals("exception")) {
                return "exception";
            }

            jsonObj = JSONObject.fromObject(jsonString);
            jsonObj.getString("email");

        } catch (Exception e) {
            log.debug(e.getStackTrace());
            this.addFieldError("userId", "用户名或者密码错误");
            return "input";
        }


        ActionContext.getContext().getSession().put("isLogin", "yes");

      try {

            //check login is ok
            jsonObj = JSONObject.fromObject(jsonString);
            String email = jsonObj.getString("email");

            UserTempDAO userTempDAO = new UserTempDAO();
            List<UserTemp> userTempList = userTempDAO.findByUuid(email);
            if (userTempList.size() == 0) {
                //首次使用
                UserTemp userTemp = new UserTemp();
                userTemp.setUuid(email);
                userTemp.setHead("no head img");
                userTemp.setName(jsonObj.getString("realname"));
                userTemp.setNick("呵呵");


                userTemp.setHash(GreenOAUthHash.GenHash(email));

//                userTemp.setHash("sdg1f5g");
              //  userTemp.setOther(jsonString);

                userTemp.setOther("jsonString");

                userTempDAO.save(userTemp);
                log.debug("save user:" + userTemp.toString());

                ActionContext.getContext().getSession().put("uuid", email);


            } else {
                UserTemp userTemp = userTempList.get(0);
                ActionContext.getContext().getSession().put("uuid", userTemp.getUuid());

            }


        } catch (Exception e) {
            log.debug(e.getStackTrace());
            this.addFieldError("userId", "系统故障");
            return "input";
        }


        if (!redirect_uri_login.equals("")) {
            return "authorize";
        } else {
            //非法调用
            return "success";

        }

    }


}
