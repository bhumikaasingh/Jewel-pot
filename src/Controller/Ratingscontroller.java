package controller;
import database.DbConnection;
import model.*;


public class Ratingscontroller{
    DbConnection dbconnection;
    public int insertRatingsmodel(Ratingsmodel Ratingsmodel){
        String ReviewCmnt = Ratingsmodel.getReviewCmnt();
        String insertQuery=String.format("INSERT INTO Rate VALUES('%s')",ReviewCmnt);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
