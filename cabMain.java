import java.util.List;

public class cabMain{
    private static lStorageService storageService = new StorageServiceImplementation();
    private static IRiderService riderService = new RiderServiceImpl(storageService);
    private static IDriverService driverService = new DriverServiceImpl(storageService);
    private static IVehicleService vehicleService = new VehicleServiceImpl(storageService);
    private static IBookingService bookingService = new BookingServiceImpl(vehicleService, storageService);

    public static void main(String args[]){
        //testing the rider methods
        
        Rider rider = new Rider();
        rider.setName("harsh");
        rider.setCountryCode("+91");
        rider.setPhoneNumber("910");
        riderService.register(rider);
        
        Rider rider2 = new Rider();
        rider2.setName("harsh");
        rider2.setCountryCode("+91");
        rider2.setPhoneNumber("910");
        riderService.register(rider2);
        //System.out.println(storageService.saveRider(rider2));
         
        //testing the driver methods
        Driver driver = new Driver();
        driver.setName("harsh Driver");
        driver.setCountryCode("+91");
        driver.setPhoneNumber("9431");
        driverService.register(driver);
        
        Driver driver2 = new Driver();
        driver2.setName("harsh Driver");
        driver2.setCountryCode("+91");
        driver2.setPhoneNumber("9431");
        driverService.register(driver2);
        //System.out.println(storageService.saveDriver(rider2));

        //testing the vehicle methods
        
        Vehicle vehicle = new Vehicle();
        vehicle.setCarNumber("KA01HK");
        vehicle.setLat(1D);
        vehicle.setLon(1D);
        vehicleService.register(vehicle);

        vehicle.setLat(2D);
        vehicle.setLon(2D);
        
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setCarNumber("UP32");
        vehicle2.setLat(1D);
        vehicle2.setLon(1D);
        vehicleService.register(vehicle2);

        //System.out.print(vehicleService.updateLocation(vehicle));
        //System.out.print(vehicleService.find(1D, 1D).getCarNumber());
        
        //DOUBTS
        //bookingService.book("+91910", 1D, 2D);

        //List<Booking> bookingHistory = bookingService.rideHistory("+91910");
        //System.out.println("bookingHistory"+bookingHistory.get(0));


    }
}