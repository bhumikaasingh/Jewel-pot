package model;
public class ChangePasswordmodel {
        private int Id;
        private String CurrentPassword;
        private String NewPassword;
        private String ConfirmPassword ;
        public ChangePasswordmodel(int Id,String CurrentPassword,String NewPassword,String ConfirmPassword){
            this.Id=Id;
            this.CurrentPassword=CurrentPassword;
            this.NewPassword=NewPassword;
            this.ConfirmPassword=ConfirmPassword;
        }
        public void setId(int ID){
            this.Id=Id;
        }
        public void setCurrentPassword(String CurrentPassword){
            this.CurrentPassword=CurrentPassword;
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
        public String getCurrentPassword(){
            return this.CurrentPassword;
        }
        public String getNewPassword(){
            return this.NewPassword;
        }
        public String getConfirmPassword(){
            return this.ConfirmPassword;
        }
    }
