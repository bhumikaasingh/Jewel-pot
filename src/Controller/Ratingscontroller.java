package controller;
import database.DbConnection;
import model.*;


public class Ratingscontroller{
    DbConnection dbconnection;
    public int insertRatingsmodel(Ratingsmodel Ratingsmodel){
        String ReviewComment = Ratingsmodel.getReviewComment();
        String insertQuery=String.format("INSERT INTO Rate VALUES('%s')",ReviewComment);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
