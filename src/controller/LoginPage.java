/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;

/**
 *
 * @author lucif
 */
public class LoginPage {
    public LoginPage(String pnum,String pas){
        DbConnection dbConnection = new DbConnection();
      String selectQuery=String.format("select phone_number,pass from users_data where phone_number='%s'",pnum);
      System.out.println(selectQuery);
      ResultSet result = dbConnection.retrieve(selectQuery);
      try{
          while(result.next()){
              String DbPnum= result.getString("phone_number");
              String Dbpass=result.getString("pass");
              User retriver_user=new User(null,null,0,DbPnum,null,Dbpass,null);
              
              
              
              
          return retriver_user;
          }
          
      }catch (SQLException e){
          e.printStackTrace();
      }
      
     return null;
    }
}
