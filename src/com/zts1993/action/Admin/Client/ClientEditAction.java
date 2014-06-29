package com.zts1993.Action.Admin.Client;

import com.zts1993.Bean.Clients;
import com.zts1993.Dao.ClientsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by TianShuo on 14-6-29.
 */
public class ClientEditAction {

    private static Logger log = LogManager.getLogger("ClientEditAction");

    String clientId;


    Clients clients;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public String execute() throws Exception {


        try {
            ClientsDAO clientsDAO = new ClientsDAO();
            clients = (Clients) clientsDAO.findByClientId(clientId).get(0);


            return "success";

        } catch (Exception e) {

            return "exception";

        }


    }


}
