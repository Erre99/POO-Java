class uberx extends Car {
    String brand;
    String model;

    public uberx (String license, Account driver, String brand, String model){
        super(license, driver); // Es como si se llamara al método constructor de la clase car
        this.brand = brand;
        this.model = model;

        //usando "super." nos da acceso a los elementos de la clase padre
    }
}
