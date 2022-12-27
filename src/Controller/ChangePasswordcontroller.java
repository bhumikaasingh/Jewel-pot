package controller;
import database.DbConnection;
import model.*;


public class ChangePasswordcontroller{
    DbConnection dbconnection;
    public int insertChangePasswordmodel(ChangePasswordmodel ChangePasswordmodel){
        String CurrentPassword = ChangePasswordmodel.getCurrentPassword();
        String NewPassword = ChangePasswordmodel.getNewPassword();
        String ConfirmPassword= ChangePasswordmodel.getConfirmPassword();
        String insertQuery=String.format("INSERT INTO ChangePassword VALUES('%s','%s','%s')",CurrentPassword,NewPassword,ConfirmPassword);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
