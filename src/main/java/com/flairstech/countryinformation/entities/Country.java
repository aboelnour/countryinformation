package com.flairstech.countryinformation.entities;

/**
 *
 * @author Mohamed Aboelnour
 */
public class Country {

    // <editor-fold defaultstate="collapsed" desc="name">
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="continent">
    private String continent;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String Continent) {
        this.continent = Continent;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="population">
    private String population;

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="lifeExpectancy">
    private String lifeExpectancy;

    public String getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(String lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="countryLanguage">
    private String countryLanguage;

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
    // </editor-fold>
    
    public static Country of(String name, String continent, String population, String lifeExpectancy, String countryLanguage) {
        Country countryDTO = new Country();
        countryDTO.name = name;
        countryDTO.continent = continent;
        countryDTO.countryLanguage = countryLanguage;
        countryDTO.lifeExpectancy = lifeExpectancy;
        countryDTO.population = population;
        return countryDTO;
    }

}
