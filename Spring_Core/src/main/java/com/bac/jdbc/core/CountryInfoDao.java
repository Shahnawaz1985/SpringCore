package com.bac.jdbc.core;

import java.util.List;

import com.bac.jdbc.core.bean.City;
import com.bac.jdbc.core.bean.Country;
import com.bac.jdbc.core.bean.Language;
/**
 * 
 * @author Qais
 *
 */
public interface CountryInfoDao {
	
	List<Country> findAllCountry();
	List<City> findAllCity();
	List<Language> findAllLanguage();
	Country findCitiesWithCountry(String countryCode);
	Country findLanguageForCountryCode(String countryCode);	
	Country findCountry_City_Language_Details(String countryCode);

}
