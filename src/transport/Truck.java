package transport;

public class Truck extends Transport implements Competitive {
    public enum TypeOfBodyTruck {
        N1(null, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);
        private final Double grossWeightMin;
        private final Double grossWeightMax;

        TypeOfBodyTruck(Double grossWeightMin, Double grossWeightMax) {
            this.grossWeightMin = grossWeightMin;
            this.grossWeightMax = grossWeightMax;
        }

        public Double getGrossWeightMin() {
            return grossWeightMin;
        }


        public Double getGrossWeightMax() {
            return grossWeightMax;
        }

        @Override
        public String toString() {
            if (grossWeightMin == null) {
                return "Capacity: " +
                        "to upper bound: " + grossWeightMax + " tons";
            } else if (grossWeightMax == null) {
                return "Capacity: " +
                        "from lower bound: " + grossWeightMin + " tons";
            }
            return "Capacity: " +
                    "lower bound: " + grossWeightMin + " tons" +
                    ", upper bound: " + grossWeightMax;
        }
    }

    private TypeOfBodyTruck typeOfBodyTruck;

    public TypeOfBodyTruck getTypeOfBodyTruck() {
        return typeOfBodyTruck;
    }

    @Override
    public void beginMoving() {
        System.out.println("Track starts to move");
    }

    @Override
    public void printType() {
        if(typeOfBodyTruck == null){
            System.out.println("Information is not enough ");
        }else {
            System.out.println(typeOfBodyTruck);
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

    @Override
    public void stopMoving() {
        System.out.println("Track stopped.");
    }

    public Truck(String brand, String model, double engineVolume, TypeOfBodyTruck typeOfBodyTruck) {
        super(brand, model, engineVolume);
        this.typeOfBodyTruck = typeOfBodyTruck;
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Truck class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of truck is ");
        return 6;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of truck is ");
        return 120;
    }

}
