package controller;
import database.DbConnection;
import model.*;
import java.sql.ResultSet;


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
