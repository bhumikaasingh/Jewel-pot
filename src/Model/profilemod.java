
package model;

public class profilemod {
        private String username;
        private String email;
        private String contact;
        

        public profilemod(String username,String email,String contact){
            this.username=username;
            this.email=email;
            this.contact=contact;
            
        }
        public void setusername(String username){
            this.username=username;
        }
        public void setemail(String email){
            this.email=email;            
        }
        public void setcontact(String contact){
            this.contact=contact;
        }
        
        public String getusername(){
            return this.username;
        }
        public String getemail(){
            return this.email;
        }
        public String getcontact(){
            return this.contact;
        }   
    }



