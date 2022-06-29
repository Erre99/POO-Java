class main {
    public static void main(String[] args) {
        /*Car car = new Car("ADRW123", new Driver("Mario Perez"  , "EFWE345", "erer@gmail.com", "********"));
        car.passsenger = 4;
        car.printDataCar();

        Car car2 =  new Car("JES233", new Driver( "David Perez", "3FK4JDI5S", "ifrni@gmail.com", "****"));
        car2.passsenger = 3;
        car2.printDataCar();

        User user1 = new User("Ricardo Domingo", "OEFJ444", "ejejjduw@gmail.com", "********");
        System.out.println(user1.name);*/

        UberX x1 = new UberX("JWSS33", new Driver("Ramiro Lopez", "JEE332", "ramitiro@gmail.com", "password"), "Nissan", "Sonic");
        x1.setPassenger(4);
        x1.printDataCar();

        UberVan van1 = new UberVan("FRE332", new Driver("Pablito Perez", "ERS333", "qweq@gmail.com", "wwdwww"));
        van1.setPassenger(6);
        van1.printDataCar();

    }
}