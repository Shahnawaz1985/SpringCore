package com.bac.jdbc.core.bean;
/**
 * 
 * @author Qais
 *
 */
public class Language {
	private String countrycode;
	private String language;
	private String officialFlag;
	private Float percentage;
	
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOfficialFlag() {
		return officialFlag;
	}
	public void setOfficialFlag(String officialFlag) {
		this.officialFlag = officialFlag;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((officialFlag == null) ? 0 : officialFlag.hashCode());
		result = prime * result + ((percentage == null) ? 0 : percentage.hashCode());
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
		Language other = (Language) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (officialFlag == null) {
			if (other.officialFlag != null)
				return false;
		} else if (!officialFlag.equals(other.officialFlag))
			return false;
		if (percentage == null) {
			if (other.percentage != null)
				return false;
		} else if (!percentage.equals(other.percentage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Language [countrycode=" + countrycode + ", language=" + language + ", officialFlag=" + officialFlag
				+ ", percentage=" + percentage + "]";
	}	
}
