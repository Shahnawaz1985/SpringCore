package com.bac.sample.beans;

public class SimpleInjection {

	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;

	public SimpleInjection() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return programmer;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public Long getAgeInSeconds() {
		return ageInSeconds;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((ageInSeconds == null) ? 0 : ageInSeconds.hashCode());
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (programmer ? 1231 : 1237);
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
		SimpleInjection other = (SimpleInjection) obj;
		if (age != other.age)
			return false;
		if (ageInSeconds == null) {
			if (other.ageInSeconds != null)
				return false;
		} else if (!ageInSeconds.equals(other.ageInSeconds))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (programmer != other.programmer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleInjection [name=" + name + ", age=" + age + ", height=" + height + ", programmer=" + programmer
				+ ", ageInSeconds=" + ageInSeconds + "]";
	}
}
