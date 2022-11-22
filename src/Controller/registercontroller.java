package controller;
import database.DbConnection;
import model.Student;


public class registercontroller{
    DbConnection dbconnection;
    public int insertStudent(Student student){
        String name=student.getusername();
        String email=student.getemail();
        String contact=student.getcontact();
        String password=student.getpassword();
        String confirmPassword=student.getconfirmPassword();
        String insertQuery=String.format("INSERT INTO register_user VALUES('%s','%s','%s','%s','%s')",name,email,contact,password,confirmPassword);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
