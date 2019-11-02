package com.flairstech.countryinformation.service;

import com.flairstech.countryinformation.entities.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mohamed Aboelnour
 */
@Component
public class CountryService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Country getCountryInfo(String code) throws Exception {
        try {
            String countrySQL = "Select name, continent, population, life_expectancy, lang.language "
                    + "From country cou "
                    + "Join country_language lang on lang.country_code = cou.code "
                    + "And lang.is_official = true "
                    + "Where cou.code = ? ";

            List<Country> countries = jdbcTemplate.query(countrySQL, new Object[]{code}, (rs, rowNum) -> 
                    Country.of(rs.getString("name"), rs.getString("continent"), rs.getString("population"),
                            rs.getString("life_expectancy"), rs.getString("language")));
            
            if (countries != null && !countries.isEmpty()) {
                return countries.get(0);
            } else {
                throw new Exception("INVALID_COUNTRY_CODE");
            }
        } catch (DataAccessException e) {
            throw new Exception("INTERNAL_ERROR");
        }
    }
}
