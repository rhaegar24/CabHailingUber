import java.util.*;
public class StorageServiceImplementation implements lStorageService{
    
    HashMap<String, Rider> riderMap;
    HashMap<String, Driver> driverMap;
    HashMap<String, Vehicle> vehicleMap;
    HashMap<String, Booking> bookingMap;
    List<Booking> bookList;

    StorageServiceImplementation(){
      riderMap   = new HashMap<>();
      driverMap  = new HashMap<>();
      vehicleMap = new HashMap<>();
      bookingMap = new HashMap<>();
      bookList   = new ArrayList<>();
    }
    
    public boolean saveRider(Rider rider){
        if(!riderMap.containsKey(rider.getName()))                                   //What to do if it contains?
          riderMap.put(rider.getName(), rider);
        else return false;
    return true;
    }
    
    public boolean saveDriver(Driver driver){
        if(!driverMap.containsKey(driver.getName()))
          driverMap.put(driver.getName(), driver);
        else return false;
    return true;
    }
    
    public boolean saveVehicle(Vehicle vehicle){
        if(!vehicleMap.containsKey(vehicle.getCarNumber()))
          vehicleMap.put(vehicle.getCarNumber(), vehicle);
        else return false;
    return true;
    }
    
    public boolean updateLocation(Vehicle vehicle){
        String carNum = vehicle.getCarNumber();
        if(vehicleMap.containsKey(carNum))
            vehicleMap.put(carNum, vehicle);
        else return false;
    return true;
    }
    
    public boolean book(Booking booking){
        if(!bookingMap.containsKey(booking.getBookingId()))
          bookingMap.put(booking.getBookingId(), booking);
        else return false;
    return true;
    }
    
    public Vehicle find(Double lat, Double lon){                                       //maxDistance?
        for(String carNum : vehicleMap.keySet()){                                      //O(n)
            Vehicle vTemp = vehicleMap.get(carNum); 
            if(vTemp.getLat() == lat && vTemp.getLon() == lon)
              return vTemp;
        }
    return null;
    }
    
    public List<Booking> rideHistory(String riderUserId){
        bookList = new ArrayList<>();
        for(String id : bookingMap.keySet()){                                           //O(n)
           Booking temp = bookingMap.get(id);                                           
           if(temp.getUserId().equals(riderUserId)){
             bookList.add(temp);
             return bookList;
           }
        }
    return bookList;
    }
    
    public Boolean endTrip(Long timeStamp, String bookingId){
        if(bookingMap.containsKey(bookingId)){
            Booking temp = bookingMap.get(bookingId);
            temp.setEndTime(timeStamp);
            bookingMap.put(bookingId, temp);
            return true;
        }
    return false;
    }
}
