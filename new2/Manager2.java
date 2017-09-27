package demo2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import demo2.Student;


public class Manager2 {

	static HashMap<String, Student> si = new HashMap<String, Student>();
	static HashMap<String, Grade> sg = new HashMap<String, Grade>();
	public static void main(String[] args) {
		si.put("2017", new Student("张三","男","北京","三班"));
		si.put("2018", new Student("李四","女","上海","二班"));
		sg.put("2017",new Grade(100,100,100));
		sg.put("2018",new Grade(90,90,90));
		//System.out.println(si);
		Set<String> xuexin =  si.keySet();
		Set<String> xuecheng =   sg.keySet();
		select(xuexin,xuecheng);
	}
	
	 public static void select(Set<String> set,Set<String> set1){
	        System.out.println("***************");
	        System.out.println("*欢迎来到学生管理系统 *");
	        System.out.println("*1：增加学生                    *");
	        System.out.println("*2：删除学生                    *");
	        System.out.println("*3：修改成绩                    *");
	        System.out.println("*4：查询成绩                    *");
	        System.out.println("*5：成绩排名                    *");
	        
	        System.out.println("***************");
	        
	        System.out.println("您想选择的操作是：");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        switch(choice){
	        //增加学生
	        case 1:
	            System.out.print("请输入学生的姓名：");
	            Scanner Sname = new Scanner(System.in);
	            String name = Sname.nextLine();
	            System.out.print("请输入学生的性别：");
	            Scanner Ssex = new Scanner(System.in);
	            String sex = Ssex.nextLine();
	            System.out.print("请输入学生的出生地：");
	            Scanner Splace = new Scanner(System.in);
	            String place = Splace.nextLine();
	            System.out.print("请输入学生的班级：");
	            Scanner Sbanji = new Scanner(System.in);
	            String banji = Sbanji.nextLine();
	            System.out.print("请输入学生的学号：");
	            Scanner SId = new Scanner(System.in);
	            String studentId = SId.nextLine();
	            System.out.print("请输入学生的语文成绩：");
	            Scanner Scgrade = new Scanner(System.in);
	            int cgrade = Scgrade.nextInt();
	            System.out.print("请输入学生的英语成绩：");
	            Scanner Segrade = new Scanner(System.in);
	            int egrade = Segrade.nextInt();
	            System.out.print("请输入学生的数学成绩：");
	            Scanner Smgrade = new Scanner(System.in);
	            int mgrade = Smgrade.nextInt();
	            si.put(studentId,new Student(name,sex,place,banji));
	            sg.put(studentId, new Grade(cgrade,egrade,mgrade));
	            System.out.println("添加成功！！！！！");
	            select(set,set1);
	
	        case 2:
	            System.out.print("请告诉我需要删除学生的学号：");
	            Scanner Sid = new Scanner(System.in);
	            String SstudentId = Sid.nextLine();
	            boolean isfindDelete = false;
	           for (String string : si.keySet()) {
				if(SstudentId.equals(string)){
				System.out.println("发现了该学生，正在删除...");
                si.keySet().remove(string);
                System.out.println("删除成功!!!");
                isfindDelete =true;
			}
	        }
	            
	            if(!isfindDelete){
	                System.out.println("抱歉，没有找到");
	            }
	            select(set,set1);
	            break;
	            
	        case 3:
	            System.out.print("请告诉我需要修改成绩学生的学号：");
	            Scanner GId = new Scanner(System.in);
	            String GstudentId = GId.nextLine();
	            boolean isfindChange = false;
	            for (String string : sg.keySet()) {
					if(GstudentId.equals(string)){
					   System.out.println("发现了该学生，正在修改...");
					   Scanner gcj = new Scanner(System.in);
					   System.out.println("新的语文成绩");
					   int xccj = gcj.nextInt();
					   sg.get(string).setChinese(xccj);
					   Scanner gcj1 = new Scanner(System.in);
					   System.out.println("新的英语成绩");
					   int xecj = gcj1.nextInt();
					   sg.get(string).setEnglish(xecj);
					   Scanner gcj2 = new Scanner(System.in);
					   System.out.println("新的数学成绩");
					   int xmcj = gcj2.nextInt();
					   sg.get(string).setMath(xmcj);
					   System.out.println("修改成功");
					   isfindChange =true;
					}
				}
	            if(!isfindChange){
	                System.out.println("抱歉，没有找到");
	            }
	            select(set,set1);
	            break;
	        case 4:
	            System.out.print("请告诉我需要查询学生的学号：");
	            Scanner CId = new Scanner(System.in);
	            String CstudentId = CId.nextLine();
	            boolean isfindData = false;
	            for (String string : si.keySet()) {
					if(CstudentId.equals(string)){
						System.out.println(si.get(string));
						isfindData = true;
					}
				}
	            for (String string : sg.keySet()) {
					if(CstudentId.equals(string)){
						System.out.println(sg.get(string));
						isfindData = true;
					}
				}
	          
	            if(!isfindData){
	            System.out.println("抱歉，没有找到");
	            }
	            select(set,set1);
	            break;
	        case 5:
	        	TreeSet<Integer> ts = new TreeSet(new Comparator<Grade>() {

					@Override
					public int compare(Grade o1, Grade o2) {
						int sum=o1.getSum()-o2.getSum();
						return sum==0 ? 1 : sum;
					}
				});
	        	for (String String : sg.keySet()) {
					ts.add((Integer)sg.get(String).getSum());
				}
	        	for (Integer integer : ts) {
					
	        		System.out.println(ts);
				}
	        default:
	            System.out.println("您输入的数字有误，请重新输入：");
	           
}
}
}