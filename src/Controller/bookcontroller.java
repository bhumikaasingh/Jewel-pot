package controller;
import database.DbConnection;
import model.*;


public class bookcontroller{
    DbConnection dbconnection;
    public int insertbookmodel(bookmodel bookmodel){
        String BookingDate = bookmodel.getBookingDate();
        String ShipmentDate = bookmodel.getShipmentDate();
        String Location= bookmodel.getLocation();
        String ContactNo = bookmodel.getContactNo();
        String insertQuery=String.format("INSERT INTO Book VALUES('%s','%s','%s','%s')",BookingDate,ShipmentDate,Location,ContactNo);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
