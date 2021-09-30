public class Vehicle extends Driver{
  String carNumber;
  String type;
  double lat;
  double lon;
  boolean isAvailable;
  String driverId;
  
  void setCarNumber(String carNumber){
       this.carNumber = carNumber;
  }
  String getCarNumber(){ 
     return carNumber;
   }
  void setType(String type){
       this.type = type;
  }
  void setLat(double lat){
       this.lat = lat;
  }
  
  double getLat(){
     return lat;
  }
  
  void setLon(double lon){
       this.lon = lon;
  }
  
  double getLon(){
     return lon;
  }
  
}
