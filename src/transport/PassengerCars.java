package transport;

public class PassengerCars extends Transport implements Competitive {
    public enum TypeOfBodyCar {
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        SUV("SUV"),
        JEEP("Jeep"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        WAGON("Wagon"),
        MINIVAN("Minivan");
        private String type;

        public void setType(String type) {
            this.type = type;
        }

        TypeOfBodyCar(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Type of body: " + type;
        }
    }

    private TypeOfBodyCar typeOfBodyCar;

    public TypeOfBodyCar getTypeOfBodyCar() {
        return typeOfBodyCar;
    }

    @Override
    public void printType() {
        if (typeOfBodyCar == null) {
            System.out.println("Information is not enough ");
        } else {
            System.out.println(typeOfBodyCar);
        }
    }

    @Override
    public void passDiagnostics(Driver driver) {
        if (driver.getHasDriverLicence() == null || !driver.getHasDriverLicence()){
            throw new RuntimeException("Diagnostic is not passed.");
        }else {
            System.out.println("Diagnostic is passed.");
        }
    }

    public PassengerCars(String brand, String model, double engineVolume, TypeOfBodyCar typeOfBodyCar) {
        super(brand, model, engineVolume);
        this.typeOfBodyCar = typeOfBodyCar;
    }

    @Override
    public void beginMoving() {
        System.out.println("Passenger car starts to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Passenger car stopped.");
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Passenger Car class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of passenger car is ");
        return 2;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of passenger car is ");
        return 210;
    }

}
