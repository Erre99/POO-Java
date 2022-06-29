class UberX extends Car {
    String brand;
    String model;

    public UberX (String license, Driver driver, String brand, String model){
        super(license, driver); // Es como si se llamara al método constructor de la clase car
        this.brand = brand;
        this.model = model;

        //usando "super." nos da acceso a los elementos de la clase padre
    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Brand: " + brand + " Model: "+ model);
    }
}
