public class Booking{
  String bookingId;
  String userId;
  String carNumber;
  long startTime;
  long endTime;
  boolean status;
  
  String getUserId(){
    return userId;
  }
  
  String getBookingId(){
    return bookingId;
  }
  
  void setEndTime(long et){
    endTime = et;
  }
}
