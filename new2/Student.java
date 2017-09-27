package demo2;

public class Student {
	public String name;
	public String sex;
	public String place;
	public String banji;
	public Student() {
		super();
		
	}
	public Student(String name, String sex, String place, String banji) {
		super();
		this.name = name;
		this.sex = sex;
		this.place = place;
		this.banji = banji;
	}
	
	public Student(String id, String name, String sex, String place, String banji) {
		super();
		this.name = name;
		this.sex = sex;
		this.place = place;
		this.banji = banji;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banji == null) ? 0 : banji.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Student other = (Student) obj;
		if (banji == null) {
			if (other.banji != null)
				return false;
		} else if (!banji.equals(other.banji))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", place=" + place
				+ ", banji=" + banji + "]";
	}
	
}
