class Car {
    private Integer id;
    private String licence;
    private Driver driver;
    protected Integer passsenger;

    //Constructor
    public Car (String license, Driver driver){
        this.licence = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: "+ licence + " Driver: " + driver.name + " Pasajeros: " + passsenger);
    }

    public Integer getPassenger(){
        return passsenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passsenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
}
