import ReadFile
import numpy as np
import tensorflow as tf
import Network
import xmlProcessor

def build_model():
    listdata = ReadFile.read_data()
    parameter = ReadFile.read_parameters()
    #嵌套列表转化为矩阵
    matrix = np.mat(listdata)
    #制作数据集
    x_data = matrix[:, 0:4]
    y_data = matrix[:, 4]
    #定义节点接收数据
    xs = tf.placeholder(tf.float32, [None, parameter['neuronsNumberInputLayer']])
    ys = tf.placeholder(tf.float32, [None, parameter['neuronsNumberOutputLayer']])
    #定义神经层
    network = Network()
    length = len(network.number_HiddenLayer)

    #隐藏层1
    for i in range(length):
        if i == 0:
            l1_para = \
                network.add_layer(xs, network.neuronsNumber_InputLayer, network.neuronsNumber_HiddenLayer[0],
                                  network.activation_Function)
            layer_n = l1_para[0]
        else:
            ln_para = network.add_layer(layer_n,network.neuronsNumber_HiddenLayer[i - 1],network.neuronsNumber_HiddenLayer[i],network.activation_Function)
            layer_n = ln_para[0]


    #输出层
    end_para = network.add_layer(layer_n, network.neuronsNumber_HiddenLayer[length-1],network.neuronsNumber_OutputLayer, network.activation_Function)
    result = end_para[0]
    #s损失函数
    loss = tf.reduce_mean(tf.reduce_sum(tf.square(ys - result), reduction_indices=[1]))
    #损失函数最小化
    train_step = tf.train.GradientDescentOptimizer(network.learningRate).minimize(loss)
    #初始化变量
    init = tf.global_variables_initializer()
    sess = tf.Session()
    sess.run(init)
    #设置迭代次数，训练模型
    for i in range(network.epoch):
        sess.run(train_step, feed_dict = {xs: x_data, ys: y_data})
        if i % 50 ==0:
            print(sess.run(loss, feed_dict = {xs: x_data, ys: y_data}))

if __name__ == '__main__':
    dict = xmlProcessor.analyzeXml_dict("E:/data231r344.xml")
    list = xmlProcessor.analyzeXml_list("E:/xml2.xml")
    print(list)
