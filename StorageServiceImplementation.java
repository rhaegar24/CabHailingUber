import java.util.*;
public class StorageServiceImplementation{
    
    HashMap<String, Rider> riderMap = new HashMap<>();
    HashMap<String, Driver> driverMap = new HashMap<>();
    HashMap<String, Vehicle> vehicleMap = new HashMap<>();
    HashMap<String, Booking> bookingMap = new HashMap<>();
    List<Booking> bookList = new ArrayList<>();
    
    boolean saveRider(Rider rider){
        if(!riderMap.containsKey(rider.getName()))
          riderMap.put(rider.getName(), rider);
        else return false;
    return true;
    }
    
    boolean saveDriver(Driver driver){
        if(!driverMap.containsKey(driver.getName()))
          driverMap.put(driver.getName(), driver);
        else return false;
    return true;
    }
    
    boolean saveVehicle(Vehicle vehicle){
        if(!vehicleMap.containsKey(vehicle.getCarNumber()))
          vehicleMap.put(vehicle.getCarNumber(), vehicle);
        else return false;
    return true;
    }
    
    boolean updateLocation(Vehicle vehicle){
        String carNum = vehicle.getCarNumber();
        if(vehicleMap.containsKey(carNum))
            vehicleMap.put(carNum, vehicle);
        else return false;
    return true;
    }
    
    boolean book(Booking booking){
        if(!bookingMap.containsKey(booking.getBookingId()))
          bookingMap.put(booking.getBookingId(), booking);
        else return false;
    return true;
    }
    
    Vehicle find(Double lat, Double lon, Double maxDistance){                          //maxDistance?
        for(String carNum : vehicleMap.keySet()){                                      //O(n)
            Vehicle vTemp = vehicleMap.get(carNum); 
            if(vTemp.getLat() == lat && vTemp.getLon() == lon)
              return vTemp;
        }
    return null;
    }
    
    List<Booking> rideHistory(String riderUserId){
        for(String id : bookingMap.keySet()){                                           //O(n)
           Booking temp = bookingMap.get(id);                                           
           if(temp.getUserId().equals(riderUserId)){
             bookList.add(temp);
             return bookList;
           }
        }
    return bookList;
    }
    
    Boolean endTrip(Long timeStamp, String bookingId){
        if(bookingMap.containsKey(bookingId)){
            Booking temp = bookingMap.get(bookingId);
            temp.setEndTime(timeStamp);
            bookingMap.put(bookingId, temp);
            return true;
        }
    return false;
    }                                                                               //All actions except the rideHistory() and find() are O(1)
}
