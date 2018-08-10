from NeurosNetwork import NeurosNetwork
import tensorflow as tf
from xmlProcessor import analyzeXml_list
from ReadFile import read_data
import numpy as np
from xmlProcessor import generate_xml_dict


# 生成数据集
def generate_data_set(list):
    matrix = np.mat(list)
    x_data = matrix[:, 0:4]
    y_data = matrix[:, 4]
    return x_data, y_data


if __name__ == '__main__':

    datalist = analyzeXml_list('/home/mahaoli/CodeHouse/Apptest/data.xml')
    print(datalist[0])
    data = read_data(datalist)
    print(data[0])
    x, y = generate_data_set(data)
    network = NeurosNetwork(4, 1, 2, 0.01, 1001, tf.nn.relu, [4, 5])
    network.traingResult(x, y)
    para_dict = network.getWeights()
    path = '/home/mahaoli/CodeHouse/Apptest/test.xml'
    generate_xml_dict(para_dict, path)