package bupt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MaHaoLi on 2018/5/31.
 */
public class Split {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        String string = "6597,紧急,R_LOS,43-华北局,15-N2SLO1-5(SDH-5)-SPI:1,2010-04-15 13:59:23";
//        String[] strArr = string.split(",");
//        list = Arrays.asList(strArr);
//        System.out.println(list);
//        for (int i = 0;i < strArr.length;i++){
//            System.out.println(strArr[i]);
//        }
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
