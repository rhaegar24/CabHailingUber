public class DriverServiceImpl implements IDriverService{
  lStorageService stSer;
    
  DriverServiceImpl(lStorageService stSer){
     this.stSer = stSer;
  }
    
  public boolean register(Driver driver){
      stSer.saveDriver(driver);
    return true;
  }
}
