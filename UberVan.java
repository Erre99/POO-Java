import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    

    public UberVan(String license, Driver driver, Map<String, Map<String,Integer>> typeCarAcepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAcepted;
        this.seatsMaterial = seatsMaterial;
    }
    
    public UberVan(String license, Driver driver){
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passsenger = passenger;
        }else{
            System.out.println("Para UberVan deben ser 6 pasajeros");
        }
        
    }
}
