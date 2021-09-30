import java.util.*;
public interface IBookingService{
    //Booking book(String userId);
    List<Booking> rideHistory(String riderUserId);
    boolean endTrip(Long timeStamp, String bookingId);
}
