package Controller;
import database.DbConnection;
import model.profilemod;
//import model.Student;



public class ProfileController{
    DbConnection dbconnection;
    
    public int updateprofilemod( profilemod Student){
            int id=Student.getid();
            String userinfo = Student.getusername();
            String emailinfo = Student.getemail();
            String contactinfo= Student.getcontact();

//       
            String updateQuery = String.format("UPDATE register SET id = %d ,  userinfo = '%s' , emailinfo = '%s', contactinfo = '%s' WHERE id=%d" ,id,userinfo,emailinfo,contactinfo);
            dbconnection = new DbConnection();
            int result = dbconnection.manipulate(updateQuery);
            return result;
    }
}
    

