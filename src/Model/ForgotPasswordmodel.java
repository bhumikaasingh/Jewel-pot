package model;
public class ForgotPasswordmodel{
        private String Email;
        private String LastPassword;
        private String NewPassword ;
        private String ConfirmPassword;
        public ForgotPasswordmodel(String Email,String LastPassword,String NewPassword,String ConfirmPassword){
            this.Email=Email;
            this.LastPassword=LastPassword;
            this.NewPassword=NewPassword;
            this.ConfirmPassword=ConfirmPassword;
        }
        public void setEmail(String Email){
            this.Email=Email;
        }
        public void setLastPassword(String LastPassword){
            this.LastPassword=LastPassword;
        }
        public void setNewPassword(String NewPassword){
            this.NewPassword=NewPassword;
        }
        public void setConfirmPassword(String ConfirmPassword){
            this.ConfirmPassword=ConfirmPassword;
        }
        public String getEmail(){
            return this.Email;
        }
        public String getLastPassword(){
            return this.LastPassword;
        }
        public String getNewPassword(){
            return this.NewPassword;
        }
        public String getConfirmPassword(){
            return this.ConfirmPassword;
       
        }
    }
