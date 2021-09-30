public abstract class PersonalInfo {
    long id;
    String name;
    String phoneNumber;
    String countryCode;
    
    abstract void setName(String name);
    abstract void setphoneNumber(String phoneNumber);
    abstract void setcountryCode(String countryCode);
}
