package controller;
import database.DbConnectionContact;
import model.*;


public class contactController{
    DbConnectionContact dbconnection;
    public int insertcontact(Contactinfo contact){
        String entername=contact.getentername();
        String entercontact=contact.getentercontact();
        String entermessage=contact.getentermessage();
        String insertQuery=String.format("INSERT INTO contact VALUES('%s','%s','%s')",entername,entercontact,entermessage);
        dbconnection=new DbConnectionContact();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
