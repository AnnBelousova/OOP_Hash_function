package transport;

public class DriverCategoryC<T extends Truck> extends Driver {


    public DriverCategoryC(String fullName, Boolean getHasDriverLicence) {
        super(fullName, getHasDriverLicence);
    }

    public void printInfo(Driver driver, Truck truck){
        System.out.println("The diver " + driver.getFullName() + " drives the auto " +  truck.toString());
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