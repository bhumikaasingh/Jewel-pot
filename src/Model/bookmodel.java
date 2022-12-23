package model;
public class bookmodel {
        private String BookingDate;
        private String ShipmentDate;
        private String Location ;
        private String ContactNo;
        public bookmodel(String BookingDate,String ShipmentDate,String Location,String ContactNo){
            this.BookingDate=BookingDate;
            this.ShipmentDate=ShipmentDate;
            this.Location=Location;
            this.ContactNo=ContactNo;
        }
        public void setBookingDate(String BookingDate){
            this.BookingDate=BookingDate;
        }
        public void setShipmentDate(String ShipmentDate){
            this.ShipmentDate=ShipmentDate;
        }
        public void setLocation(String Location){
            this.Location=Location;
        }
        public void setContactNo(String ContactNo){
            this.ContactNo=ContactNo;
        }
        public String getBookingDate(){
            return this.BookingDate;
        }
        public String getShipmentDate(){
            return this.ShipmentDate;
        }
        public String getLocation(){
            return this.Location;
        }
        public String getContactNo(){
            return this.ContactNo;
       
        }
    }
