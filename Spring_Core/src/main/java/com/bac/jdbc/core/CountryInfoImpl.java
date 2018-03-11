package com.bac.jdbc.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bac.jdbc.core.bean.City;
import com.bac.jdbc.core.bean.Country;
import com.bac.jdbc.core.bean.Language;
import com.bac.jdbc.mapper.AllMapper;
import com.bac.jdbc.mapper.CityMapper;
import com.bac.jdbc.mapper.CountryCityMapper;
import com.bac.jdbc.mapper.CountryLanguageMapper;
import com.bac.jdbc.mapper.CountryMapper;
import com.bac.jdbc.mapper.LanguageMapper;
/**
 * 
 * @author Qais
 *
 */
public class CountryInfoImpl implements CountryInfoDao, InitializingBean {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private QueryInfo queryInfo;
	private NamedParameterJdbcTemplate nameParameterJdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.nameParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public QueryInfo getQueryInfo() {
		return queryInfo;
	}

	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

	@Override
	public List<Country> findAllCountry() {
		return jdbcTemplate.query(queryInfo.getFind_all_country_query(), new CountryMapper());
	}

	@Override
	public List<City> findAllCity() {
		return jdbcTemplate.query(queryInfo.getFind_all_city(), new CityMapper());
	}

	@Override
	public List<Language> findAllLanguage() {
		return jdbcTemplate.query(queryInfo.getFind_all_language(), new LanguageMapper());
	}

	@Override
	public Country findCitiesWithCountry(String countryCode) {
		Map<String, Object> columnMap = new HashMap<String, Object>();
		columnMap.put("code", countryCode);
		return nameParameterJdbcTemplate.query(queryInfo.getCities_for_country_code(), columnMap, new CountryCityMapper());
	}

	@Override
	public Country findLanguageForCountryCode(String countryCode) {
		Map<String, Object> columnMap = new HashMap<String, Object>();
		columnMap.put("code", countryCode);
		return nameParameterJdbcTemplate.query(queryInfo.getLang_for_country_code(), columnMap, new CountryLanguageMapper());
	}

	@Override
	public Country findCountry_City_Language_Details(String countryCode) {
		Map<String, Object> columnMap = new HashMap<String, Object>();
		columnMap.put("code", countryCode);
		return nameParameterJdbcTemplate.query(queryInfo.getCountry_city_language_details(), columnMap, new AllMapper());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if(dataSource == null) {
			throw new BeanCreationException("Datasource must be set.");
		}
		if(jdbcTemplate == null) {
			throw new BeanCreationException("JdbcTemplate must be set.");
		}
		if(nameParameterJdbcTemplate == null) {
			throw new BeanCreationException("NameParameterJdbcTemplate must be set.");
		}
		if(queryInfo.getFind_all_country_query() == null) {
			throw new BeanCreationException("Query must be set.");
		}
		if(queryInfo.getFind_all_city() == null) {
			throw new BeanCreationException("Query must be set.");
		}
		if(queryInfo.getFind_all_language() == null) {
			throw new BeanCreationException("Query must be set.");
		}
		if(queryInfo.getCities_for_country_code() == null) {
			throw new BeanCreationException("Query must be set.");
		}
		if(queryInfo.getLang_for_country_code() == null) {
			throw new BeanCreationException("Query must be set.");
		}
		if(queryInfo.getCountry_city_language_details() == null) {
			throw new BeanCreationException("Query must be set.");
		}
	}
}
