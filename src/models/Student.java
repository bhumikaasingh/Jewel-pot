package models;
class Student{
    private int std_id;
    private String std_name;
    private int std_age;
    private String std_address;
    private int std_contact;
    
    public Student(int std_id, String std_name,int std_age, String std_address,int contact){
        this.std_id =std_id;
        this.std_name =std_name;
        this.std_age =std_age;
        this.std_address =std_address;
        this.std_contact =std_contact;
        
    }
    
    public void setStudentId(int newStudentId){
        this.std_id=newStudentId;
    }
    
    public int getStudentId(){
        return this.std_id;
    }
}

