package transport;

public class Bus extends Transport implements Competitive{
    public enum TypeOfBodyBus {
        VERY_SMALL(0,10),
        SMALL(10,25),
        MEDIUM(40, 50),
        BIG(60,80),
        HUGE(100,200);
        private Integer capacityMin;
        private Integer capacityMax;

        TypeOfBodyBus(int capacityMin, int capacityMax) {
            this.capacityMin = capacityMin;
            this.capacityMax = capacityMax;
        }


        @Override
            public String toString() {
                if (capacityMin == null){
                    return "Capacity: " +
                            "to upper bound: " + capacityMax + " people";
                } else if (capacityMax == null) {
                    return "Capacity: " +
                            "from lower bound: " + capacityMin + " people";
                }
                return "Capacity: " +
                        "lower bound: " + capacityMin+ " people" +
                        ", upper bound: " + capacityMax + " people";
            }

    }

    private TypeOfBodyBus typeOfBodyBus;

    public TypeOfBodyBus getTypeOfBodyBus() {
        return typeOfBodyBus;
    }

    @Override
    public void printType() {
        if(typeOfBodyBus == null){
            System.out.println("Information is not enough ");
        }else {
            System.out.println(getTypeOfBodyBus());
        }
    }

    public Bus(String brand, String model, double engineVolume, TypeOfBodyBus typeOfBodyBus) {
        super(brand, model, engineVolume);
        this.typeOfBodyBus = typeOfBodyBus;
    }

    @Override
    public void beginMoving() {
        System.out.println("Bus starts to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Bus stopped.");
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Bus class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of bus is ");
        return 11;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of bus is ");
        return 100;
    }

//    @Override
//    public void refill() {
//        System.out.println("Need to refill petrol/diesel");
//    }
//
//    public Bus(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, maxSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Bus: " + super.toString();
//    }
}
