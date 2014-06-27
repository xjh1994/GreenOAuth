package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.Bean.AuthCodes;
import com.zts1993.Dao.AuthCodesDAO;

/**
 * Created by TianShuo on 14-6-25.
 */
public class AuthorizeHandleAction extends ActionSupport {

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

        AuthCodesDAO authCodesDAO = new AuthCodesDAO();
        AuthCodes authCodes = (AuthCodes) authCodesDAO.findByProperty("clientId", client_id).get(0);

        String code = authCodes.getCode();

        redirect_uri_final = redirect_uri + "/code/" + code;

        return "callback";

    }


}
