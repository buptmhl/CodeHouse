package demo1;

/**
 * @author 40413
 *
 */
/**
 * @author 40413
 *
 */
public class Student {
	private String name;
	private String studentID;
	private String sex;
	private int grade;
	public Student() {
		super();
		
		
	}
	public Student(String name, String studentID, String sex, int grade) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.sex = sex;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", sex="
				+ sex + ", grade=" + grade + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
}
