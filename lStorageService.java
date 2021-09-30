import java.util.*;

public interface lStorageService{
    boolean saveRider(Rider rider);
    boolean saveDriver(Driver driver);
    boolean saveVehicle(Vehicle vehicle);
    boolean updateLocation(Vehicle vehicle);
    boolean book(Booking booking);
    Vehicle find(Double lat, Double lon, Double maxDistance);
    List<Booking> rideHistory(String riderUserId);
    Boolean endTrip(Long timeStamp, String bookingId);

}
