package bupt.Model;

import java.util.ArrayList;

/**
 * Created by MaHaoLi on 2018/6/6.
 */
public class ANN {
    private int neuronsNumberInInputLayer;
    private int neuronsNumberOutInputLayer;
    private int numberofHiddenLayer;
    private ArrayList neuronsNumberinHiddenLayer;
    private double learningRate;
    private int epoch;
    private String weight;
    private String bias;
    private String activationFunction;

    public int getNeuronsNumberInInputLayer() {
        return neuronsNumberInInputLayer;
    }

    public void setNeuronsNumberInInputLayer(int neuronsNumberInInputLayer) {
        this.neuronsNumberInInputLayer = neuronsNumberInInputLayer;
    }

    public int getNeuronsNumberOutInputLayer() {
        return neuronsNumberOutInputLayer;
    }

    public void setNeuronsNumberOutInputLayer(int neuronsNumberOutInputLayer) {
        this.neuronsNumberOutInputLayer = neuronsNumberOutInputLayer;
    }

    public int getNumberofHiddenLayer() {
        return numberofHiddenLayer;
    }

    public void setNumberofHiddenLayer(int numberofHiddenLayer) {
        this.numberofHiddenLayer = numberofHiddenLayer;
    }

    public ArrayList getNeuronsNumberinHiddenLayer() {
        return neuronsNumberinHiddenLayer;
    }

    public void setNeuronsNumberinHiddenLayer(ArrayList neuronsNumberinHiddenLayer) {
        this.neuronsNumberinHiddenLayer = neuronsNumberinHiddenLayer;
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBias() {
        return bias;
    }

    public void setBias(String bias) {
        this.bias = bias;
    }

    public String getActivationFunction() {
        return activationFunction;
    }

    public void setActivationFunction(String activationFunction) {
        this.activationFunction = activationFunction;
    }
}
