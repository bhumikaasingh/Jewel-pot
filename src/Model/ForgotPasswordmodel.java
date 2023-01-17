package model;
public class ForgotPasswordmodel {
        private int Id;
        private String Email;
        private String Username;
        private String NewPassword;
        private String ConfirmPassword;

        public ForgotPasswordmodel(int Id,String Email,String Username,String NewPassword,String ConfirmPassword){
            this.Id=Id;
            this.Email=Email;
            this.Username=Username;
            this.NewPassword=NewPassword;
            this.ConfirmPassword=ConfirmPassword;
        }
        public void setId(int ID){
            this.Id=Id;
        }
        public void setEmail(String Email){
            this.Email=Email;
        }
        public void setUsername(String Username){
            this.Username=Username;
        }
        public void setNewPassword(String NewPassword){
            this.NewPassword=NewPassword;
        }
        public void setConfirmPassword(String ConfirmPassword){
            this.ConfirmPassword=ConfirmPassword;
        }
        public int getId(){
            return this.Id;
        }
        public String getEmail(){
            return this.Email;
        }
        public String getUsername(){
            return this.Username;
        }
        public String getNewPassword(){
            return this.NewPassword;
        }
        public String getConfirmPassword(){
            return this.ConfirmPassword;
        }
    }
