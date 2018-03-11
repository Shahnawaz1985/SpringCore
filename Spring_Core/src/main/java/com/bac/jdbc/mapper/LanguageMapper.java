package com.bac.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bac.jdbc.core.bean.Language;

public class LanguageMapper implements RowMapper<Language> {

	@Override
	public Language mapRow(ResultSet rs, int rowNum) throws SQLException {
		Language language = new Language();
		language.setCountrycode(rs.getString("countrycode"));
		language.setLanguage(rs.getString("language"));
		language.setOfficialFlag(rs.getString("isofficial"));
		language.setPercentage(rs.getFloat("percentage"));
		return language;
	}
}
