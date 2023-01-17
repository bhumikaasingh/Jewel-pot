package controller;
import database.DbConnection;
import model.*;
import java.sql.ResultSet;


public class ForgotPasswordcontroller{
    DbConnection dbconnection;
    private int result;
    public int insertChangePasswordmodel(ForgotPasswordmodel ForgotPasswordmodel){
        String Email = ForgotPasswordmodel.getEmail();
        String Username = ForgotPasswordmodel.getUsername();
        String NewPassword = ForgotPasswordmodel.getNewPassword();
        String ConfirmPassword= ForgotPasswordmodel.getConfirmPassword();
        dbconnection=new DbConnection();
        return result; 
    }
    public ResultSet fetchdata(int id){
        String query=String.format("select * from register where id=%d",id);
        
        dbconnection=new DbConnection();
        ResultSet result=dbconnection.retrieve(query);
        return result;
    
    }
    
    
    public int updatepassword(ChangePasswordmodel ChangePasswordmodel){
        String NewPassword = ChangePasswordmodel.getNewPassword();
        int id=ChangePasswordmodel.getId(); 
        String insertQuery=String.format("update register set ppassword='%s' where id=%d",NewPassword,id);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result; 
    }    
}
