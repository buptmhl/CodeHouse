package bupt.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MaHaoLi on 2018/6/7.
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();
        int i = 0;
        while (true) {
            int a = sc.nextInt();
            i+=1;
            System.out.println("第"+ i + "次输入");
            if (a!=0){
                list.add(a);
            }else {
                break;
            }

        }
        System.out.println(list);
        System.out.println("finish");
    }
}
