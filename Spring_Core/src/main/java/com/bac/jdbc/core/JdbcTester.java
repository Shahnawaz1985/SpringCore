package com.bac.jdbc.core;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.bac.jdbc.core.bean.City;
import com.bac.jdbc.core.bean.Country;
import com.bac.jdbc.core.bean.Language;
/**
 * 
 * @author Qais
 *
 */
public class JdbcTester {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("jdbc_context.xml");
		context.refresh();
		
		CountryInfoDao infoDao = (CountryInfoDao)context.getBean("countryInfoDao");
		
		List<Country> countryList = infoDao.findAllCountry();
		System.out.println("Total No.of countries : "+countryList.size());
		System.out.println(countryList);
		
		List<City> cityList = infoDao.findAllCity();
		System.out.println("Total No.of cities : "+cityList.size());
		System.out.println(cityList);
		
		List<Language> langList = infoDao.findAllLanguage();
		System.out.println("Total No.of languages : "+langList.size());
		System.out.println(langList);
		
		Country country_city_list = infoDao.findCitiesWithCountry("NLD");
		System.out.println("No. of cities for "+country_city_list.getName()+" is :"+country_city_list.getAssociatedCities().size());
		System.out.println(country_city_list);
		
		Country country_language_list = infoDao.findLanguageForCountryCode("NLD");
		System.out.println("No. of languages for "+country_city_list.getName()+" is :"+country_language_list.getLanguages().size());
		System.out.println(country_language_list);
		
		Country all_country_list = infoDao.findCountry_City_Language_Details("NLD");
		System.out.println("No. of languages for "+all_country_list.getName()+" is :"+all_country_list.getLanguages().size()+", and cities count : "+all_country_list.getAssociatedCities().size());
		System.out.println(all_country_list);
		context.close();
	}

}
