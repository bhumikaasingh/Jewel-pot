package model;

public class usermodel {
        
        private String Username;
        private String Email;
        private String Contact;
        
        public usermodel() {
    
        }
        
        public usermodel( String username,String email,String contact){
            
            this.Username=username;
            this.Email=email;
            this.Contact=contact;
            
        
        }
       
        public void setusername(String username){
            this.Username=username;
        }
        public void setemail(String email){
            this.Email=email;            
        }
        public void setcontact(String contact){
            this.Contact=contact;
        }
        public String getusername(){
            return this.Username;
        }
        public String getemail(){
            return this.Email;
        }
        public String getcontact(){
            return this.Contact;
        }   
    }

