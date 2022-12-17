package transport;

public class DriverCategoryD<T extends Bus> extends Driver {


    public DriverCategoryD(String fullName) {
        super(fullName);
    }

    public void printInfo(Driver driver, Bus bus){
       System.out.println("The diver " + driver.getFullName() + " drives the auto " +  bus.toString());
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
