package oop;

public class Country {
    //fields
    private String name;
    private int population;
    private String capital;
    private String currency;
    private boolean inEU;

    //setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setInEU(boolean inEU) {
        this.inEU = inEU;
    }

    //getter methods
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public String getCapital() {
        return capital;
    }
    public String getCurrency() {
        return currency;
    }

    //method
    public void CountryInfo(){
        System.out.println("Country info: ");
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + capital);
        System.out.println("Currency: " + currency);
        System.out.println("Is in EU: " + inEU);
    }
    public void isThisCountryInEU(){

        if (inEU){
            System.out.println(name + " is in EU");
        }else{
            System.out.println(name + " is not in EU");
        }
    }


}
