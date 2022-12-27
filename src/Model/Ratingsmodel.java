package model;
public class Ratingsmodel {
        private String ReviewCmnt;
        public Ratingsmodel(String ReviewCmnt){
            this.ReviewCmnt=ReviewCmnt;
        }
        public void setReviewCmnt(String ReviewCmnt){
            this.ReviewCmnt=ReviewCmnt;
        }
        public String getReviewCmnt(){
            return this.ReviewCmnt;
        }
    }
