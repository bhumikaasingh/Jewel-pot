
package model;

public class profilemod {
        private int id;
        private String Username;
        private String Email;
        private String Contact;
        
        public profilemod() {
    
        }
        
        public profilemod(int id, String username,String email,String contact){
            this.id=id;
            this.Username=username;
            this.Email=email;
            this.Contact=contact;
            
        }
        public void setid(int id){
            this.id=id;
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
         public int getid(){
            return this.id;
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



