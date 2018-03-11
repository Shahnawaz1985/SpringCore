package com.bac.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bac.jdbc.core.bean.Country;
/**
 * 
 * @author Qais
 *
 */
public class CountryMapper implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setCode(rs.getString("code"));
		country.setName(rs.getString("name"));
		country.setRegion(rs.getString("region"));
		country.setIndependenceYear(rs.getInt("indepyear"));
		country.setContinentName(rs.getString("continent"));
		country.setPopulation(rs.getInt("population"));
		return country;
	}

}
