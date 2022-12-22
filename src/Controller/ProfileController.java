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
}
   

