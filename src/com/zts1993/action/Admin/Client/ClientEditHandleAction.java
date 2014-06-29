package com.zts1993.Action.Admin.Client;

import com.zts1993.Bean.Clients;
import com.zts1993.Dao.ClientsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by TianShuo on 14-6-29.
 */
public class ClientEditHandleAction {

    private static Logger log = LogManager.getLogger("ClientEditHandleAction");

    Clients clients;

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public String execute() throws Exception {


        log.debug(clients.toString());

        try {
            ClientsDAO clientsDAO=new ClientsDAO();
            clientsDAO.update(clients);
            return "success";

        }catch (Exception e){

            return "exception";

        }


    }


}
