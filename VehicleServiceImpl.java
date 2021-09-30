public class VehicleServiceImpl implements IVehicleService{
 lStorageService stSer;
    
 VehicleServiceImpl(lStorageService stSer){
    this.stSer = stSer;
 }
 
 public boolean register(Vehicle vehicle){
   stSer.saveVehicle(vehicle);
   return true;
 }
 
 public Vehicle find(double lat, double lon){
     Vehicle v = stSer.find(lat, lon);
     if(v == null)
         System.out.print("Vehicle not found");
   return v;
 }
 
 public boolean updateLocation(Vehicle vehicle){
     //if(stSer.updateLocation(vehicle) == false)
       // System.out.print("Vehicle not found");
   return stSer.updateLocation(vehicle)?true:false;
 }
 
}
