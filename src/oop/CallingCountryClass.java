package oop;

public class CallingCountryClass {
    public static void main(String[] args) {
        //creating country class object

        Country latvia = new Country();
        latvia.setName("Latvia");
        latvia.setPopulation(1800000);
        latvia.setCapital("Riga");
        latvia.setCurrency("Euro");
        latvia.setInEU(true);

        latvia.CountryInfo();
        latvia.isThisCountryInEU();

        System.out.println();

        Country china = new Country();
        china.setName("China");
        china.setPopulation(1454456803);
        china.setCapital("Beijing");
        china.setCurrency("CNY");
        china.setInEU(false);

        china.CountryInfo();
        china.isThisCountryInEU();

    }

}
