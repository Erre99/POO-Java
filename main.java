class main {
    public static void main(String[] args) {
        Car car = new Car("ADRW123", new Account("Mario Perez"  , "EFWE345"));
        car.passsenger = 4;
        car.printDataCar();

        Car car2 =  new Car("JES233", new Account( "David Perez", "3FK4JDI5S"));
        car2.passsenger = 3;
        car2.printDataCar();
    }
}