package transport;

import java.util.Objects;

public abstract class  Driver {
    private String fullName;
    private Boolean hasDriverLicence;
    private int experience;

    public String getFullName() {
        return fullName;
    }

    public Boolean getHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(Boolean hasDriverLicence) {
        this.hasDriverLicence = !hasDriverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void beginMovements();
    public abstract void stop();
    public abstract void fillAuto();

    public Driver(String fullName, Boolean hasDriverLicence) {
        this.fullName = fullName;
        this.hasDriverLicence = hasDriverLicence;
    }

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(hasDriverLicence, driver.hasDriverLicence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicence, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", hasDriverLicence=" + hasDriverLicence +
                ", experience=" + experience +
                '}';
    }
}
