package model;
public class Discountmodel {
        private String Username;
        private String DiscountCode;
        public Discountmodel(String Username,String DiscountCode){
            this.Username=Username;
            this.DiscountCode=DiscountCode;
        }
        public void setUsername(String Username){
            this.Username=Username;
        }
        public void setDiscountCode(String DiscountCode){
            this.DiscountCode=DiscountCode;
        }
        public String getUsername(){
            return this.Username;
        }
        public String getDiscountCode(){
            return this.DiscountCode;
        }
    }
