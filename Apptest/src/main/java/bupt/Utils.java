package bupt;

import bupt.Model.ANN;
import bupt.Model.ModelType;
import bupt.Model.SVM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MaHaoLi on 2018/5/31.
 */
public class Utils {
    public static ANN ann = new ANN();
    public static SVM svm = new SVM();
    public static List getDataList(List<List<String>> list) {
        List dataList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            //data = new bupt.Data(list.get(i).get(1), list.get(i).get(2), list.get(i).get(3), list.get(i).get(4),list.get(i).get(5));
            //dataList.add(data);
            HashMap dataMap = new HashMap();
            dataMap.put("level", list.get(i).get(0));
            dataMap.put("name", list.get(i).get(1));
            dataMap.put("node", list.get(i).get(2));
            dataMap.put("board", list.get(i).get(3));
            dataMap.put("location", list.get(i).get(4));
            dataList.add(dataMap);
        }
        return dataList;
    }

    public static HashMap modelSelection(ModelType modeltype){
        HashMap modelStructure = new HashMap();
        //String strModelType = modeltype.toString();
        switch (modeltype){
            case ANN:
                modelStructure.put("activationFunction",ann.getActivationFunction());
                modelStructure.put("bias",ann.getBias());
                modelStructure.put("weight",ann.getWeight());
                modelStructure.put("epoch",ann.getEpoch());
                modelStructure.put("learningRate",ann.getLearningRate());
                modelStructure.put("neuronsNumberHiddenLayer",ann.getNeuronsNumberinHiddenLayer());
                modelStructure.put("neuronsNumberInputLayer",ann.getNeuronsNumberInInputLayer());
                modelStructure.put("neuronsNumberOutputLayer",ann.getNeuronsNumberOutInputLayer());
                modelStructure.put("numberHiddenLayer",ann.getNumberofHiddenLayer());
                break;
            case SVM:

                break;
        }
        return modelStructure;
    }

    public static void setANNValues(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入权重:");
        String weight = sc1.nextLine();
        ann.setWeight(weight);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入偏置:");
        String bias = sc2.nextLine();
        ann.setBias(bias);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入激活函数:");
        String activationFunction = sc3.nextLine();
        ann.setActivationFunction(activationFunction);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("请输入输入层神经元个数:");
        int neuronsNumberInInputLayer = sc4.nextInt();
        ann.setNeuronsNumberInInputLayer(neuronsNumberInInputLayer);
        Scanner sc5 = new Scanner(System.in);
        System.out.println("请输入输出层神经元个数:");
        int neuronsNumberOutInputLayer = sc5.nextInt();
        ann.setNeuronsNumberOutInputLayer(neuronsNumberOutInputLayer);
        Scanner sc6 = new Scanner(System.in);
        System.out.println("请输入隐藏层数:");
        int numberofHiddenLayer = sc6.nextInt();
        ann.setNumberofHiddenLayer(numberofHiddenLayer);

        Scanner sc7 = new Scanner(System.in);
        ArrayList n_neuron_hidden = new ArrayList();
        for (int i = 1;i <= numberofHiddenLayer;i++ ){
            System.out.println("请输入第" + i + "层隐藏层输入");
            int a = sc7.nextInt();
            n_neuron_hidden.add(a);
        }
        ann.setNeuronsNumberinHiddenLayer(n_neuron_hidden);

        Scanner sc8 = new Scanner(System.in);
        System.out.println("请输入迭代数:");
        int epoch = sc8.nextInt();
        ann.setEpoch(epoch);
        Scanner sc9 = new Scanner(System.in);
        System.out.println("请输入学习速率:");
        Double learningRate = sc9.nextDouble();
        ann.setLearningRate(learningRate);

    }
}
