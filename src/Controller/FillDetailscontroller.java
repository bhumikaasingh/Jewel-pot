package controller;
import database.DbConnection;
import model.*;


public class FillDetailscontroller{
    DbConnection dbconnection;
    public int insertFillDetailmodel(FillDetailmodel FillDetailmodel){
        String FirstName = FillDetailmodel.getFirstName();
        String MiddleName = FillDetailmodel.getMiddleName();
        String LastName = FillDetailmodel.getLastName();
        String Location = FillDetailmodel.getLocation();
        String ContactNo = FillDetailmodel.getContactNo();
        String insertQuery=String.format("INSERT INTO FillDetail VALUES('%s','%s','%s','%s','%s')",FirstName,MiddleName,LastName,Location,ContactNo);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
