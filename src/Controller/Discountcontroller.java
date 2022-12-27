package controller;
import database.DbConnection;
import model.*;


public class Discountcontroller{
    DbConnection dbconnection;
    public int insertDiscountmodel(Discountmodel Discountmodel){
        String Username = Discountmodel.getUsername();
        String DiscountCode = Discountmodel.getDiscountCode();
        String insertQuery=String.format("INSERT INTO DiscountApproval VALUES('%s','%s')",Username,DiscountCode);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
