package bupt;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MaHaoLi on 2018/5/31.
 */
public class TestRead {
    public static List getReadData(File csv) {
        //File csv = new File("C:\\Users\\Xinfeng\\Desktop\\马浩力\\alarm_process\\alarm_out_0529\\out0.csv");  // CSV文件路径
        BufferedReader br = null;
        List<List<String>> allString = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(csv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        //String everyLine ;
        int lineNum = 0;
        try {
            List<String> list = new ArrayList();
            //List<List<String>> allString = new ArrayList();
            while ((line = br.readLine()) != null)  //读取到的内容给line变量
            {
                lineNum += 1;
                if (lineNum != 1) {
                    //everyLine = line;
                    //System.out.println(everyLine);
                    String[] strArr = line.split(",");
                    list = Arrays.asList(strArr);
                    allString.add(list);
                    //System.out.println(list);
                }
            }
            //System.out.println("csv表格中所有行数：" + allString.size());
            //System.out.println(allString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allString;
    }
}
