package gosUslugi;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private Set<Passport> passportSet = new HashSet<>();

    public PassportList(Set<Passport> passportSet) {
        this.passportSet = passportSet;
    }

    public void savePassport(Passport passport) {
        Passport passport1 = findPassport(passport.getPassportNumber());
        if(passport1 != null){
            passportSet.remove(passport1);
        }
        passportSet.add(passport);
    }

    public Passport findPassport(int passportNumber) {
        for (Passport passport : passportSet) {
            if (passport.getPassportNumber() == passportNumber) {
                System.out.println(passport);
                return passport;
            }
        }return null;
    }

    @Override
    public String toString() {
        return passportSet.toString();
    }
}
