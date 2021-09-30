import java.util.*;

public class BookingServiceImpl implements IBookingService{
 lStorageService stSer;
 IVehicleService veSer;
 List<Booking> bookList;
 
 BookingServiceImpl(IVehicleService veSer, lStorageService stSer){
    this.stSer = stSer;
    this.veSer = veSer;
 }
 
 //public Booking book(String bookingId){
   //  if(stSer.book(bookingId) == false)
   //   System.out.println("Booking has already been made");
 //}
 
 public List<Booking> rideHistory(String riderUserId){
       //bookList = new ArrayList<>(
       return stSer.rideHistory(riderUserId);
  //return bookList;
 }
 
 public boolean endTrip(Long timeStamp, String bookingId){
   if(stSer.endTrip(timeStamp, bookingId) == false)
     System.out.println("Booking has not been done");
   return true;
 }
}
