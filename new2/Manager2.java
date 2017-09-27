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
		si.put("2017", new Student("����","��","����","����"));
		si.put("2018", new Student("����","Ů","�Ϻ�","����"));
		sg.put("2017",new Grade(100,100,100));
		sg.put("2018",new Grade(90,90,90));
		//System.out.println(si);
		Set<String> xuexin =  si.keySet();
		Set<String> xuecheng =   sg.keySet();
		select(xuexin,xuecheng);
	}
	
	 public static void select(Set<String> set,Set<String> set1){
	        System.out.println("***************");
	        System.out.println("*��ӭ����ѧ������ϵͳ *");
	        System.out.println("*1������ѧ��                    *");
	        System.out.println("*2��ɾ��ѧ��                    *");
	        System.out.println("*3���޸ĳɼ�                    *");
	        System.out.println("*4����ѯ�ɼ�                    *");
	        System.out.println("*5���ɼ�����                    *");
	        
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
	            System.out.print("������ѧ���ĳ����أ�");
	            Scanner Splace = new Scanner(System.in);
	            String place = Splace.nextLine();
	            System.out.print("������ѧ���İ༶��");
	            Scanner Sbanji = new Scanner(System.in);
	            String banji = Sbanji.nextLine();
	            System.out.print("������ѧ����ѧ�ţ�");
	            Scanner SId = new Scanner(System.in);
	            String studentId = SId.nextLine();
	            System.out.print("������ѧ�������ĳɼ���");
	            Scanner Scgrade = new Scanner(System.in);
	            int cgrade = Scgrade.nextInt();
	            System.out.print("������ѧ����Ӣ��ɼ���");
	            Scanner Segrade = new Scanner(System.in);
	            int egrade = Segrade.nextInt();
	            System.out.print("������ѧ������ѧ�ɼ���");
	            Scanner Smgrade = new Scanner(System.in);
	            int mgrade = Smgrade.nextInt();
	            si.put(studentId,new Student(name,sex,place,banji));
	            sg.put(studentId, new Grade(cgrade,egrade,mgrade));
	            System.out.println("��ӳɹ�����������");
	            select(set,set1);
	
	        case 2:
	            System.out.print("���������Ҫɾ��ѧ����ѧ�ţ�");
	            Scanner Sid = new Scanner(System.in);
	            String SstudentId = Sid.nextLine();
	            boolean isfindDelete = false;
	           for (String string : si.keySet()) {
				if(SstudentId.equals(string)){
				System.out.println("�����˸�ѧ��������ɾ��...");
                si.keySet().remove(string);
                System.out.println("ɾ���ɹ�!!!");
                isfindDelete =true;
			}
	        }
	            
	            if(!isfindDelete){
	                System.out.println("��Ǹ��û���ҵ�");
	            }
	            select(set,set1);
	            break;
	            
	        case 3:
	            System.out.print("���������Ҫ�޸ĳɼ�ѧ����ѧ�ţ�");
	            Scanner GId = new Scanner(System.in);
	            String GstudentId = GId.nextLine();
	            boolean isfindChange = false;
	            for (String string : sg.keySet()) {
					if(GstudentId.equals(string)){
					   System.out.println("�����˸�ѧ���������޸�...");
					   Scanner gcj = new Scanner(System.in);
					   System.out.println("�µ����ĳɼ�");
					   int xccj = gcj.nextInt();
					   sg.get(string).setChinese(xccj);
					   Scanner gcj1 = new Scanner(System.in);
					   System.out.println("�µ�Ӣ��ɼ�");
					   int xecj = gcj1.nextInt();
					   sg.get(string).setEnglish(xecj);
					   Scanner gcj2 = new Scanner(System.in);
					   System.out.println("�µ���ѧ�ɼ�");
					   int xmcj = gcj2.nextInt();
					   sg.get(string).setMath(xmcj);
					   System.out.println("�޸ĳɹ�");
					   isfindChange =true;
					}
				}
	            if(!isfindChange){
	                System.out.println("��Ǹ��û���ҵ�");
	            }
	            select(set,set1);
	            break;
	        case 4:
	            System.out.print("���������Ҫ��ѯѧ����ѧ�ţ�");
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
	            System.out.println("��Ǹ��û���ҵ�");
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
	            System.out.println("������������������������룺");
	           
}
}
}