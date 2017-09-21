package demo2;
import java.util.*;

import demo1.Student;
import demo1.Test;
public class Manager {
    public static void main(String[] agrs){
    	List<Student> StudentList = new LinkedList<Student>();
        StudentList.add(new Student("马力","2017","男",100));
        StudentList.add(Test.s1);
        //Manager managerImpl = new Manager();
        //managerImpl.select(managerImpl.StudentList);
    	select(StudentList);
    }

    
    
    public static void select(List<Student> StudentList ){
        System.out.println("***************");
        System.out.println("*欢迎来到学生管理系统 *");
        System.out.println("*1：增加学生                    *");
        System.out.println("*2：删除学生                    *");
        System.out.println("*3：修改成绩                    *");
        System.out.println("*4：查询成绩                    *");
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
            System.out.print("请输入学生的学号：");
            Scanner SId = new Scanner(System.in);
            String studentId = SId.nextLine();
            System.out.print("请输入学生的成绩：");
            Scanner Sgrade = new Scanner(System.in);
            int grade = Sgrade.nextInt();
            StudentList.add(new Student(name,studentId,sex,grade));
            System.out.println("添加成功！！！！！");
            select(StudentList);
            break;
        //删除学生成绩
        case 2:
            System.out.print("请告诉我需要删除学生的学号：");
            Scanner Sid = new Scanner(System.in);
            String SstudentId = Sid.nextLine();
            boolean isfindDelete = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(SstudentId.equals(StudentList.get(i).getStudentID())){
                    System.out.println("发现了该学生，正在删除...");
                    StudentList.remove(i);
                    System.out.println("删除成功!!!");
                    isfindDelete =true;
                }
            }
            if(!isfindDelete){
                System.out.println("抱歉，没有找到");
            }
            select(StudentList);
            break;
        //修改学生成绩
        case 3:
            System.out.print("请告诉我需要修改成绩学生的学号：");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < StudentList.size(); j++) {
                if(GstudentId.equals(StudentList.get(j).getStudentID())){
                    System.out.println("发现了该学生，正在修改...");
                    System.out.println("学生原成绩为"+StudentList.get(j).getGrade());
                    System.out.print("请输入修改后学生的成绩：");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    StudentList.get(j).setGrade(grade2);
                    System.out.println("修改成功!!!");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("抱歉，没有找到");
            }
            select(StudentList);
            break;
        //查看学生成绩
        case 4:
            System.out.print("请告诉我需要查询学生的学号：");
            Scanner CId = new Scanner(System.in);
            String CstudentId = CId.nextLine();
            boolean isfindData = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(CstudentId.equals(StudentList.get(i).getStudentID())){
                    System.out.println("名字:"+StudentList.get(i).getName());
                    System.out.println("性别:"+StudentList.get(i).getSex());
                    System.out.println("学号:"+StudentList.get(i).getStudentID());
                    System.out.println("成绩:"+StudentList.get(i).getGrade());
                    isfindData = true;
                
                }
            }
            if(!isfindData){
            System.out.println("抱歉，没有找到");
            }
            select(StudentList);
            break;
        default:
            System.out.println("您输入的数字有误，请重新输入：");
           
        }
        
    }
}
 
