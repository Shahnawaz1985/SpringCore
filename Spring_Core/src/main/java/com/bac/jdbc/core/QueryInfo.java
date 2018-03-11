package com.bac.jdbc.core;
/**
 * 
 * @author Qais
 *
 */
public class QueryInfo {
	
	private String find_all_country_query;
	private String find_all_city;
	private String find_all_language;
	private String cities_for_country_code;
	private String lang_for_country_code;
	private String country_city_language_details;

	public String getFind_all_city() {
		return find_all_city;
	}

	public void setFind_all_city(String find_all_city) {
		this.find_all_city = find_all_city;
	}

	public String getFind_all_country_query() {
		return find_all_country_query;
	}

	public void setFind_all_country_query(String find_all_country_query) {
		this.find_all_country_query = find_all_country_query;		
	}

	public String getFind_all_language() {
		return find_all_language;
	}

	public void setFind_all_language(String find_all_language) {
		this.find_all_language = find_all_language;
	}

	public String getCities_for_country_code() {
		return cities_for_country_code;
	}

	public void setCities_for_country_code(String cities_for_country_code) {
		this.cities_for_country_code = cities_for_country_code;
	}

	public String getLang_for_country_code() {
		return lang_for_country_code;
	}

	public void setLang_for_country_code(String lang_for_country_code) {
		this.lang_for_country_code = lang_for_country_code;
	}

	public String getCountry_city_language_details() {
		return country_city_language_details;
	}

	public void setCountry_city_language_details(String country_city_language_details) {
		this.country_city_language_details = country_city_language_details;
	}
	
	

}
