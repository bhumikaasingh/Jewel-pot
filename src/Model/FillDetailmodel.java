package model;
public class FillDetailmodel {
        private String FirstName;
        private String MiddleName;
        private String LastName;
        private String Location;
        private String ContactNo;
        public FillDetailmodel(String FirstName,String MiddleName,String LastName,String Location,String ContactNo){
            this.FirstName=FirstName;
            this.MiddleName=MiddleName;
            this.LastName=LastName;
            this.Location=Location;
            this.ContactNo=ContactNo;
        }
        public void setFirstName(String FirstName){
            this.FirstName=FirstName;
        }
        public void setMiddleName(String MiddleName){
            this.MiddleName=MiddleName;
        }
        public void setLastName(String LastName){
            this.LastName=LastName;
        }
        public void setLocation(String Location){
            this.Location=Location;
        }
        public void setContactNo(String ContactNo){
            this.ContactNo=ContactNo;
        }
        public String getFirstName(){
            return this.FirstName;
        }
        public String getMiddleName(){
            return this.MiddleName;
        }
        public String getLastName(){
            return this.LastName;
        }
        public String getLocation(){
            return this.Location;
        }
        public String getContactNo(){
            return this.ContactNo;
       
        }
    }
