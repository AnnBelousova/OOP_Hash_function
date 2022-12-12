package gosUslugi;

import java.time.LocalDate;
import java.util.*;

public class TestPassport {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport(4513, "last name 1", "first name 1", "middle name",
                LocalDate.of(2020, 10, 12)));

        PassportList passportList = new PassportList(passports);

       // passportList.findPassport(4513);
        passportList.savePassport(new Passport(4510, "last name 3", "first name 3", "middle name 3", LocalDate.of(1990, 01, 01)));
        System.out.println(passportList);
    }
}