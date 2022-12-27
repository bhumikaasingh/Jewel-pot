package Controller;
//import java.util.List;
//import model.profilemod;
import database.DbConnection;
//import javax.sql.rowset.JdbcRowSet;
//import javax.sql.rowset.RowSetProvider;
//import java.util.ArrayList;
//import model.Student;



public class ProfileController{
    DbConnection dbconnection;
    
    public int updateprofilemod(int id,String username,String email,String contact ){
            int Id = id;
            String Username = username;
            String Email = email;
            String Contact= contact;       
            String updateQuery = String.format("UPDATE register SET  username = '%s' , email = '%s', contact = '%s' WHERE id = %d " ,Username,Email,Contact,Id);
            dbconnection = new DbConnection();
            int result = dbconnection.manipulate(updateQuery);
            return result;  
    }
    public int insertImage(int id){
    String Query = String.format("INSERT INTO register VALUES where tr_image='%s' ",id);
    dbconnection = new DbConnection();
    int result = dbconnection.manipulate(Query);
    return result;
    }

    public int insertImage(int id, String updatedImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   

