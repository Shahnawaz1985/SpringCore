package com.bac.jdbc.core.bean;

import java.util.List;
/**
 * 
 * @author Qais
 *
 */
public class Country {
	
	private String name;
	private String continentName;
	private String region;
	private Integer independenceYear;
	private Integer population;
	private String code;
	
	private List<City> associatedCities;
	private List<Language> languages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getIndependenceYear() {
		return independenceYear;
	}
	public void setIndependenceYear(Integer independenceYear) {
		this.independenceYear = independenceYear;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public List<City> getAssociatedCities() {
		return associatedCities;
	}
	public void setAssociatedCities(List<City> associatedCities) {
		this.associatedCities = associatedCities;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continentName == null) ? 0 : continentName.hashCode());
		result = prime * result + ((independenceYear == null) ? 0 : independenceYear.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (continentName == null) {
			if (other.continentName != null)
				return false;
		} else if (!continentName.equals(other.continentName))
			return false;
		if (independenceYear == null) {
			if (other.independenceYear != null)
				return false;
		} else if (!independenceYear.equals(other.independenceYear))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", continentName=" + continentName + ", region=" + region
				+ ", independenceYear=" + independenceYear + ", population=" + population + ", code=" + code
				+ ", associatedCities=" + associatedCities + ", languages=" + languages + "]";
	}

}
