package gosUslugi;
import java.time.LocalDate;
import java.util.*;

public class Passport {
    private int passportNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthdate;


    public int getPassportNumber() {
        return passportNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Passport(int passportNumber, String lastName, String firstName, String middleName, LocalDate birthdate) {
        this.passportNumber = passportNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return "Passport: " + passportNumber +
                ", " + lastName +
                ", " + firstName +
                ", " + middleName +
                ", " + birthdate;
    }
}
