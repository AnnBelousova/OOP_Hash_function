package transport;

public class DriverCategoryB<T extends PassengerCars> extends Driver {


    public DriverCategoryB(String fullName, Boolean getHasDriverLicence) {
        super(fullName, getHasDriverLicence);
    }

    public void printInfo(Driver driver, PassengerCars passengerCars){
        System.out.println("The diver " + driver.getFullName() + " drives the auto " +  passengerCars.toString());
    }

    @Override
    public void beginMovements() {
        System.out.println("The diver starts to move");
    }

    @Override
    public void stop() {
        System.out.println("The diver stops");
    }

    @Override
    public void fillAuto() {
        System.out.println("The diver fills the auto");
    }
}
