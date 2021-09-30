public class Booking{
  String bookingId;
  String userId;
  String carNumber;
  long startTime;
  long endTime;
  boolean status;
  
  Booking(){}
  
  Booking(String bookingId, String userId, String carNumber,long startTime, long endTime, boolean status){
      this.bookingId = bookingId;
      this.userId = userId;
      this.carNumber = carNumber;
      this.startTime = startTime;
      this.endTime = endTime;
      this.status = status;
    }
  
  void setEndTime(long et){
    endTime = et;
  }
  
  String getUserId(){
    return userId;
  }
  
  String getBookingId(){
    return bookingId;
  }

}
