public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle moto = new Motorcycle("Yamaha", 2021, false);
        Truck truck = new Truck("Audi", 2020, 15.5, 3);

        Driver driver1 = new Driver("Aslan", "AB123");
        Driver driver2 = new Driver("Glent", "CD456");

        car.setDriver(driver1);
        moto.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = {car, moto, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }
            v.stopEngine();
            System.out.println(" ");
        }
    }
}