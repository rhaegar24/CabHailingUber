public interface IVehicleService{
  boolean register(Vehicle vehicle);
  Vehicle find(double lat, double lon);
  boolean updateLocation(Vehicle vehicle);
}