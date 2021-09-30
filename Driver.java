public class Driver extends PersonalInfo{
   private String name;
   private String countryCode;
   private String phoneNumber;
   
   void setName(String name){
       this.name = name;
   }
   String getName(){ 
     return name;
   }
   void setcountryCode(String countryCode){
       this.countryCode = countryCode;
   }
   void setphoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
   }
}
