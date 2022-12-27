package controller;
import database.DbConnection;
import model.*;


public class ForgotPasswordcontroller{
    DbConnection dbconnection;
    public int insertForgotPasswordmodel(ForgotPasswordmodel ForgotPasswordmodel){
        String Email = ForgotPasswordmodel.getEmail();
        String LastPassword = ForgotPasswordmodel.getLastPassword();
        String NewPassword= ForgotPasswordmodel.getNewPassword();
        String ConfirmPassword = ForgotPasswordmodel.getConfirmPassword();
        String insertQuery=String.format("INSERT INTO ForgotPassword VALUES('%s','%s','%s','%s')",Email,LastPassword,NewPassword,ConfirmPassword);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
