package bupt;

import bupt.Model.ModelType;
import bupt.xmlProcessor.DatasetProcessor;
import bupt.xmlProcessor.ModuleProcessor;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by MaHaoLi on 2018/5/31.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
        File csv =
                new File("C:\\Users\\Xinfeng\\Desktop\\mahaoli\\result.csv");
        HashMap hm = new HashMap();
        List<List<String>> allList = TestRead.getReadData(csv);
        List list;
        //System.out.println(list);
            if (!allList.isEmpty()){
                list = Utils.getDataList(allList);
                System.out.println(list);
                DatasetProcessor dp = new DatasetProcessor();
                dp.generateXmlFile(list);
                //TODO:传送数据，调用接口方法
            }
        Utils.setANNValues();
        hm = Utils.modelSelection(ModelType.ANN);
        System.out.println(Utils.modelSelection(ModelType.ANN));
        //TODO：传送模型数据，调用接口方法
        ModuleProcessor mp = new ModuleProcessor();
        mp.generateXmlFile(hm);
    }


}
