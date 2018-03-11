package com.bac.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.bac.jdbc.core.bean.City;
import com.bac.jdbc.core.bean.Country;
import com.bac.jdbc.core.bean.Language;

public class AllMapper implements ResultSetExtractor<Country> {

	@Override
	public Country extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<String, Country> countryMap = new HashMap<String, Country>();
		Country country = null;
		List<Language> languageList = new ArrayList<Language>();
		List<City> cityList = new ArrayList<City>();
		while(rs.next()) {
			String code = rs.getString("code");
			country = countryMap.get(code);
			if(country == null) {
				country = new Country();
				country.setCode(code);
				country.setName(rs.getString("name"));
				country.setRegion(rs.getString("region"));
				country.setIndependenceYear(rs.getInt("indepyear"));
				country.setContinentName(rs.getString("continent"));
				country.setPopulation(rs.getInt("population"));
				
				countryMap.put(code, country);
			}
			String country_code = rs.getString("countrycode");
			if(country_code!=null) {
				Language language = new Language();
				language.setCountrycode(country_code);
				language.setLanguage(rs.getString("language"));
				language.setOfficialFlag(rs.getString("isofficial"));
				language.setPercentage(rs.getFloat("percentage"));
				languageList.add(language);
			}	
			Integer city_id = rs.getInt("id");
			if(city_id>0) {
				City city = new City();
				city.setId(city_id);
				city.setCityName(rs.getString("city_name"));
				city.setDistrict(rs.getString("district"));
				city.setPopulation(rs.getInt("population"));
				cityList.add(city);
			}
	   }
		country.setAssociatedCities(cityList);
		country.setLanguages(languageList);
		return country;
	}

}
