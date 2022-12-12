package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestTransport {
    public static void main(String[] args) {
        PassengerCars bmw = new PassengerCars("BMW", "X6",3.5, PassengerCars.TypeOfBodyCar.HATCHBACK);
        Truck man = new Truck("MAN", "33430", 18, Truck.TypeOfBodyTruck.N2);
        Bus setra = new Bus("SETRA", "121", 16, Bus.TypeOfBodyBus.BIG);


        System.out.println(bmw);
        bmw.beginMoving();
        System.out.println(man);
        man.beginMoving();
        man.stopMoving();
        System.out.println(setra);
        setra.beginMoving();
        System.out.println();

        DriverCategoryD<Bus> sergio = new DriverCategoryD("Sergio");
        sergio.printInfo(sergio, setra);
        setra.printType();
        System.out.println();

        DriverCategoryB<PassengerCars> nik = new DriverCategoryB("Nik", true);
        nik.printInfo(nik, bmw);
        bmw.printType();
        bmw.passDiagnostics(nik);
        System.out.println();

        DriverCategoryC<Truck> peter = new DriverCategoryC("Peter", true);
        peter.printInfo(peter, man);
        man.passDiagnostics(peter);
        man.printType();

        Set<Sponsor> sponsors = new HashSet<>();
        Sponsor abc = new Sponsor("ABC", 4500);
        Sponsor dim = new Sponsor("DIM", 8000);
        sponsors.add(abc);
        sponsors.add(dim);
        sponsors.add(dim);
        System.out.println(sponsors);
        System.out.println();

        Set<Transport> transportList = new HashSet<>();
        transportList.add(bmw);
        transportList.add(setra);
        transportList.add(man);
        transportList.add(man);
        System.out.println(transportList);
        System.out.println();


        Mechanic andrey = new Mechanic("Andrey Petrov", "Repair", Mechanic.TypeAutoToServe.CAR_MECHANIC);
        Mechanic igor = new Mechanic("Igor Ivanov", "Mill", Mechanic.TypeAutoToServe.UNIQUE_MECHANIC);
        andrey.doTransportService();
        andrey.repairTransport();
        igor.doTransportService();


        Set<Mechanic> mechanics = new HashSet<>();
        mechanics.add(andrey);
        mechanics.add(igor);
        mechanics.add(igor);
        System.out.println(mechanics);
        System.out.println();

        ServiceStation<Transport> serviceStation = new ServiceStation<>();
        serviceStation.addTransport(bmw);
        //serviceStation.addTransport(setra);
        serviceStation.addTransport(man);
        serviceStation.serve();




        /*Car.Key remoteWithoutKey = new Car.Key(true, false);
        Car.Key remoteWithKey = new Car.Key(true, true);

        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia",5,null, "x456sa777", "automate", "sedan", new Car.Key(), 150);
        Car audi= new Car("Audi", "A8 50 l TDl quattro", 3.0, "black", 2020, "Germany",5, true, null, null, "hatchback", remoteWithoutKey, 200);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany",5, false, "456sa777", null, null, remoteWithKey, 220);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea",6, null, "d456sa777", "mechanical", "suv", remoteWithKey, 195);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea",6, true, "r456sa", null, null, remoteWithKey, 250);
        //Car carWithoutInfo = new Car("", null, 0, "", 0, "",0, null, null, "automate", "sedan", remoteWithKey, 240);

        lada.changeTires();
        System.out.println(lada);
        //lada.changeTires(lada.isSummerTires());
        Car.Insurance insuranceLada = lada.new Insurance(LocalDate.of(2023, 12,01), 0,"5d555s5");
        System.out.println(insuranceLada);

        System.out.println(audi);
        //audi.changeTires(audi.isSummerTires());
        Car.Insurance insuranceAudi = audi.new Insurance(LocalDate.of(2020, 10,05), 2000,"55ask5s5");
        System.out.println(insuranceAudi);

        System.out.println(bmw);
        //bmw.changeTires(bmw.isSummerTires());
        bmw.isSummerTires();

        System.out.println(kia);
        //kia.changeTires(kia.isSummerTires());

        System.out.println(hyundai);
        //hyundai.changeTires(hyundai.isSummerTires());

        //System.out.println(carWithoutInfo);
        //carWithoutInfo.changeTires(carWithoutInfo.isSummerTires());
        System.out.println();

        Train lastochka = new Train("Lastochka", "B-901," ,2011, "Russia", 301, 3500, "Belarus station", "Minsk-Passenger", 11);

        Train leningrad = new Train("Leningrad", "D-125," ,2019, "Russia", 270, 1700, "Leningrad terminal", "Leningrad-Passenger", 8);

        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        leningrad.refill();

        Bus cityBus = new Bus("MAN","Lion's City", 2012, "Germany", 150);
        Bus internationalBus = new Bus("HYUNDAI","Real", 2015, "Korea", 180);
        Bus intercity = new Bus("MERCEDES","Intouro", 2018, "Germany", 195);
        System.out.println(cityBus);
        cityBus.refill();
        System.out.println(internationalBus);
        cityBus.refill();
        System.out.println(intercity);
        cityBus.refill();*/
    }
}
