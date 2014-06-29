package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.Bean.AuthCodes;
import com.zts1993.Bean.UserTemp;
import com.zts1993.Dao.AuthCodesDAO;
import com.zts1993.Dao.UserTempDAO;
import com.zts1993.Util.GreenOAUthHash;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by TianShuo on 14-6-25.
 */
public class AuthorizeHandleAction extends ActionSupport {
    private static Logger log = LogManager.getLogger("AuthorizeHandleAction");

    private String client_id;
    private String response_type;
    private String redirect_uri;
    private String redirect_uri_final;

    public String getRedirect_uri_final() {
        return redirect_uri_final;
    }

    public void setRedirect_uri_final(String redirect_uri_final) {
        this.redirect_uri_final = redirect_uri_final;
    }

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }


    public String execute() throws Exception {
        try {
            String uuid = ActionContext.getContext().getSession().get("uuid").toString();

            AuthCodesDAO authCodesDAO = new AuthCodesDAO();
            List<AuthCodes> authCodesList = authCodesDAO.findByUuidAndClientId(uuid, client_id);
            if (authCodesList.size() == 0) {

                //首次使用
                UserTempDAO userTempDAO = new UserTempDAO();
                List<UserTemp> userTempList = userTempDAO.findByUuid(uuid);
                UserTemp userTemp = userTempList.get(0);

                AuthCodes authCodes = new AuthCodes();
                authCodes.setUuid(uuid);
                authCodes.setClientId(client_id);

                String auth_code = GreenOAUthHash.GenHash(uuid + client_id);
                authCodes.setCode(auth_code);
                authCodes.setRedirectUri("http://127.0.0.1/Green2014/index.php?s=/Oauth/Sns/callback/type/greencms");
                authCodes.setExpires(30000);

                authCodesDAO.save(authCodes);

                redirect_uri_final = redirect_uri + "/code/" + auth_code;
                return "callback";

            } else if (authCodesList.size() == 1) {
                String code = authCodesList.get(0).getCode();
                redirect_uri_final = redirect_uri + "/code/" + code;
                return "callback";

            } else {
                log.debug("too many records in authCodesList");

                return "exception";

            }


        } catch (Exception e) {
            log.debug(e.getStackTrace());
            return "exception";
        }


    }


}
