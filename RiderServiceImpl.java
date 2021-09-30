public class RiderServiceImpl implements IRiderService{
    lStorageService stSer;
    
    RiderServiceImpl(lStorageService stSer){
        this.stSer = stSer;
    }
    
    public boolean register(Rider rider){
        stSer.saveRider(rider);
    return true;
    }

}
