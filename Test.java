package demo2;
import java.util.ArrayList;
import demo1.Student;



public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>() ;
		list.add(new Student("mahaoli", "2017", "ÄĞ", 100));
		list.add(new Student("mahaoli", "2017", "ÄĞ", 100));
		list.add(new Student("mahaoli2", "2017", "ÄĞ", 100));
		list.add(new Student("mahaoli3", "2017", "ÄĞ", 100));
		list.add(new Student("mahaoli4", "2017", "ÄĞ", 100));
		list.add(new Student("mahaoli5", "2017", "ÄĞ", 100));
		list.remove(new Student("mahali","2017","ÄĞ",100));
		System.out.println(list);
	}

}
