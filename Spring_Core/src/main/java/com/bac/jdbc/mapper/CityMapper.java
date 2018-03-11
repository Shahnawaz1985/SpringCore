package com.bac.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bac.jdbc.core.bean.City;

public class CityMapper implements RowMapper<City> {

	@Override
	public City mapRow(ResultSet rs, int rowNum) throws SQLException {
		City city = new City();
		city.setId(rs.getInt("id"));
		city.setCityName(rs.getString("name"));
		city.setDistrict(rs.getString("district"));
		city.setPopulation(rs.getInt("population"));
		return city;
	}

}
