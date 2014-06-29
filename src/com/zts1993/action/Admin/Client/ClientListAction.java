package com.zts1993.Action.Admin.Client;

import com.zts1993.Bean.Clients;
import com.zts1993.Dao.ClientsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by TianShuo on 14-6-29.
 */
public class ClientListAction {
    private static Logger log = LogManager.getLogger("ClientList");

    List<Clients> clientsList;

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public String execute() throws Exception {


        ClientsDAO clientsDAO=new ClientsDAO();
        clientsList=clientsDAO.findAll();

//
//        ListIterator<Clients> listIterator=clientsList.listIterator();
//
//        while (listIterator.hasNext()){
//            log.debug(listIterator.next().toString());
//        }



        return "success";


    }




}
