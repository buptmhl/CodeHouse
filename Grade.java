package demo2;

public class Grade {

	public int chinese;
	public int english;
	public int math;
	public int sum;
	public Grade() {
		super();
		
	}
	public Grade(int chinese, int english, int math) {
		super();
		this.chinese = chinese;
		this.english = english;
		this.math = math;
		this.sum = this.chinese+this.english+this.math;
	}
	
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		 this.chinese = chinese;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum(){
		return sum;
	}
	
	@Override
	public String toString() {
		return "Grade [chinese=" + chinese + ", english=" + english + ", math="
				+ math + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chinese;
		result = prime * result + english;
		result = prime * result + math;
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
		Grade other = (Grade) obj;
		if (chinese != other.chinese)
			return false;
		if (english != other.english)
			return false;
		if (math != other.math)
			return false;
		return true;
	}
	
}
