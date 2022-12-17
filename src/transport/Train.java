package transport;/*
package transport;


public class Train extends Transport{
    private double tripCost;
    private float time;
    private String departureStationName;
    private String arrivalStationName;
    private int numberOfWagons;

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost!=0?tripCost:25;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time!=0?time:time;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName!=null || !departureStationName.isEmpty() || !departureStationName.isBlank()?departureStationName:departureStationName;
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        this.arrivalStationName = arrivalStationName!=null || !arrivalStationName.isEmpty() || !arrivalStationName.isBlank()?arrivalStationName:arrivalStationName;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons!=0?numberOfWagons:3;
    }

    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, double tripCost, String departureStationName, String arrivalStationName, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        setNumberOfWagons(numberOfWagons);
        setDepartureStationName(departureStationName);
        setArrivalStationName(arrivalStationName);
        setTripCost(tripCost);
    }


    @Override
    public void refill() {
        System.out.println("Need to refill diesel");
    }

    @Override
    public String toString() {
        return "Train: " +
                "trip cost " + tripCost +
                ", time " + time +
                ", departure Station " + departureStationName +
                ", arrival Station " + arrivalStationName +
                ", number of wagons " + numberOfWagons;
    }
}
*/
