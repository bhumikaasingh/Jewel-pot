package Controller;
import database.DbConnection;
import model.profilemod;

public class ProfileController{
    DbConnection dbconnection;
    
    public int updateprofilemod( profilemod profile){
            String userinfo = profile.getusername();
            String emailinfo = profile.getemail();
            String contactinfo= profile.getcontact();

//       
            String updateQuery = String.format("UPDATE registrationpage SET userinfo = '%s' , emailinfo = '%s', contactinfo = '%s'" ,userinfo,emailinfo,contactinfo);
            dbconnection = new DbConnection();
            int result = dbconnection.manipulate(updateQuery);
            return result;
        }

    public void profilemod(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

