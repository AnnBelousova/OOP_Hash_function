package transport;/*
package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private final double engineVolume;
    private final int numberOfSeats;
    private final String typeOfBodyCar;
    private String registrationNumber;
    private Boolean isSummerTires;
    private final String transmission;
    private Key key;
    private Insurance insurance;


    public static class Key {
        private final Boolean remoteStartingEngine;
        private final Boolean accessWithoutKey;

        public Boolean getRemoteStartingEngine() {
            return remoteStartingEngine;
        }

        public Boolean getAccessWithoutKey() {
            return accessWithoutKey;
        }

        public Key() {
            this(false, false);
        }

        public Key(Boolean remoteStartingEngine, Boolean accessWithoutKey) {
            this.remoteStartingEngine = remoteStartingEngine == null ? false : remoteStartingEngine;
            this.accessWithoutKey = accessWithoutKey == null ? false : accessWithoutKey;
        }

        @Override
        public String toString() {
            return "Key" +
                    "remoteStartingEngine=" + remoteStartingEngine +
                    ", accessWithoutKey=" + accessWithoutKey;
        }
    }

    public class Insurance {
        private final LocalDate duration;
        private final double price;
        private final String number;

        public Insurance(LocalDate duration, double price, String number) {
            this.duration = checkDuration(duration);
            this.price = price <= 0 ? 1500 : price;
            if (Pattern.matches("[a-zA-Z-zA-Z0-9]{9}", number)) {
                this.number = number;
            } else {
                this.number = "this number is invalid";
            }
        }


        @Override
        public String toString() {
            return "Insurance: " +
                    "duration " + duration +
                    ", price " + price +
                    ", number: " + number;
        }

        public LocalDate getDuration() {
            return duration;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        private LocalDate checkDuration(LocalDate duration) {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("You have to extend the insurance.");
                return duration;
            } else {
                return duration;
            }
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }


    */
/*    public void changeTires(Boolean summerTires) {
            if ((LocalDate.now().getMonthValue() < 5 || LocalDate.now().getMonthValue() > 10) && !summerTires) {
                System.out.println("Tires is Ok for current season!");
            } else if ((LocalDate.now().getMonthValue() < 5 || LocalDate.now().getMonthValue() > 10) && summerTires) {
                System.out.println("You have to change tires to winter tires!");
            } else if ((LocalDate.now().getMonthValue() >= 5 || LocalDate.now().getMonthValue() <= 10) && summerTires) {
                System.out.println("Tires is Ok for current season!");
            } else if ((LocalDate.now().getMonthValue() >= 5 || LocalDate.now().getMonthValue() <= 10) && !summerTires) {
                System.out.println("You have to change tires to winter tires!");
            }
        }*//*

    public void changeTires() {
        isSummerTires = !isSummerTires;
    }


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int numberOfSeats, Boolean summerTires, String registrationNumber, String transmission, String typeOfBodyCar, Key key, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.typeOfBodyCar = typeOfBodyCar == null || typeOfBodyCar.isEmpty() || typeOfBodyCar.isBlank() ? "sedan" : typeOfBodyCar;

        this.isSummerTires = summerTires == null ? true : false;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        this.transmission = transmission == null || transmission.isEmpty() || transmission.isBlank() ? "mechanical" : transmission;

        this.numberOfSeats = numberOfSeats == 0 ? 4 : numberOfSeats;

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "000000000";
        } else {
            Pattern pattern = Pattern.compile("([a-z][0-9]{3}[a-z]{2}[0-9]{3})");
            Matcher matcher = pattern.matcher(registrationNumber);
            if (matcher.matches()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "000000000";
            }
        }
    }

    @Override
    public void refill() {
        System.out.println("Need to refill petrol/diesel or charge");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " +
                "production year is " + getProductionYear() +
                ", was built in " + getProductionCountry() +
                ", color is " + getColor() +
                ", engine Volume is " + engineVolume +
                ", number of seats is " + numberOfSeats +
                ", tires is " + (isSummerTires ? "summer" : "winter") +
                ", registration number " + registrationNumber +
                ", transmission is " +
                ", type of body car is " + typeOfBodyCar +
                ", key are: " + (key.remoteStartingEngine ? " 1. remote starting engine, " : "1. not remote starting engine, ") +
                (key.accessWithoutKey ? "2.access with key" : "2.access without key") +
                ", max speed " + getMaxSpeed();
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Boolean getSummerTires() {
        return isSummerTires;
    }

    public String getTransmission() {
        return transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfBodyCar() {
        return typeOfBodyCar;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "000000000";
        } else {
            Pattern pattern = Pattern.compile("([a-z][0-9]{3}[a-z]{2}[0-9]{3})");
            Matcher matcher = pattern.matcher(registrationNumber);
            if (matcher.matches()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "000000000";
            }
        }
    }

    public boolean isSummerTires() {
        return isSummerTires;
    }

    public void setSummerTires(Boolean summerTires) {
        isSummerTires = summerTires == null ? isSummerTires : !isSummerTires;
    }
}
*/
