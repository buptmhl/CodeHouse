package demo2;
import java.util.*;

import demo1.Student;
import demo1.Test;
public class Manager {
    public static void main(String[] agrs){
    	List<Student> StudentList = new LinkedList<Student>();
        StudentList.add(new Student("����","2017","��",100));
        StudentList.add(Test.s1);
        //Manager managerImpl = new Manager();
        //managerImpl.select(managerImpl.StudentList);
    	select(StudentList);
    }

    
    
    public static void select(List<Student> StudentList ){
        System.out.println("***************");
        System.out.println("*��ӭ����ѧ������ϵͳ *");
        System.out.println("*1������ѧ��                    *");
        System.out.println("*2��ɾ��ѧ��                    *");
        System.out.println("*3���޸ĳɼ�                    *");
        System.out.println("*4����ѯ�ɼ�                    *");
        System.out.println("***************");
        
        System.out.println("����ѡ��Ĳ����ǣ�");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();        
        switch(choice){
        //����ѧ��
        case 1:
            System.out.print("������ѧ����������");
            Scanner Sname = new Scanner(System.in);
            String name = Sname.nextLine();
            System.out.print("������ѧ�����Ա�");
            Scanner Ssex = new Scanner(System.in);
            String sex = Ssex.nextLine();
            System.out.print("������ѧ����ѧ�ţ�");
            Scanner SId = new Scanner(System.in);
            String studentId = SId.nextLine();
            System.out.print("������ѧ���ĳɼ���");
            Scanner Sgrade = new Scanner(System.in);
            int grade = Sgrade.nextInt();
            StudentList.add(new Student(name,studentId,sex,grade));
            System.out.println("��ӳɹ�����������");
            select(StudentList);
            break;
        //ɾ��ѧ���ɼ�
        case 2:
            System.out.print("���������Ҫɾ��ѧ����ѧ�ţ�");
            Scanner Sid = new Scanner(System.in);
            String SstudentId = Sid.nextLine();
            boolean isfindDelete = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(SstudentId.equals(StudentList.get(i).getStudentID())){
                    System.out.println("�����˸�ѧ��������ɾ��...");
                    StudentList.remove(i);
                    System.out.println("ɾ���ɹ�!!!");
                    isfindDelete =true;
                }
            }
            if(!isfindDelete){
                System.out.println("��Ǹ��û���ҵ�");
            }
            select(StudentList);
            break;
        //�޸�ѧ���ɼ�
        case 3:
            System.out.print("���������Ҫ�޸ĳɼ�ѧ����ѧ�ţ�");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < StudentList.size(); j++) {
                if(GstudentId.equals(StudentList.get(j).getStudentID())){
                    System.out.println("�����˸�ѧ���������޸�...");
                    System.out.println("ѧ��ԭ�ɼ�Ϊ"+StudentList.get(j).getGrade());
                    System.out.print("�������޸ĺ�ѧ���ĳɼ���");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    StudentList.get(j).setGrade(grade2);
                    System.out.println("�޸ĳɹ�!!!");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("��Ǹ��û���ҵ�");
            }
            select(StudentList);
            break;
        //�鿴ѧ���ɼ�
        case 4:
            System.out.print("���������Ҫ��ѯѧ����ѧ�ţ�");
            Scanner CId = new Scanner(System.in);
            String CstudentId = CId.nextLine();
            boolean isfindData = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(CstudentId.equals(StudentList.get(i).getStudentID())){
                    System.out.println("����:"+StudentList.get(i).getName());
                    System.out.println("�Ա�:"+StudentList.get(i).getSex());
                    System.out.println("ѧ��:"+StudentList.get(i).getStudentID());
                    System.out.println("�ɼ�:"+StudentList.get(i).getGrade());
                    isfindData = true;
                
                }
            }
            if(!isfindData){
            System.out.println("��Ǹ��û���ҵ�");
            }
            select(StudentList);
            break;
        default:
            System.out.println("������������������������룺");
           
        }
        
    }
}
 
