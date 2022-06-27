class Car {
    Integer id;
    String licence;
    Account driver;
    Integer passsenger;

    //Constructor
    public Car (String license, Account driver){
        this.licence = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: "+ licence + " Driver: " + driver.name);
    }
}
