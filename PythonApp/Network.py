import tensorflow as tf
import ReadFile

# ReadFile.read_parameters(dict)

class Network(object):
    def __init__(self):
        self.bias = ReadFile.read_parameters(dict)[0]
        self.weight = ReadFile.read_parameters(dict)[1]
        self.activation_Function = ReadFile.read_parameters(dict)[2]
        self.epoch = ReadFile.read_parameters(dict)[3]
        self.learningRate = ReadFile.read_parameters(dict)[4]
        self.neuronsNumber_InputLayer = ReadFile.read_parameters(dict)[5]
        self.neuronsNumber_OutputLayer = ReadFile.read_parameters(dict)[6]
        self.neuronsNumber_HiddenLayer = ReadFile.read_parameters(dict)[7]
        self.number_HiddenLayer = ReadFile.read_parameters(dict)[8]

    # def add_layer(self, input, in_size, out_size, activation_function=None):
    #     out_list = []
    #     # 权重和偏置量
    #     self.weights = tf.Variable(tf.random_normal([self.neuronsNumber_InputLayer, self.neuronsNumber_HiddenLayer]))
    #     self.bias = tf.Variable(tf.zeros([self.neuronsNumber_HiddenLayer]) + 0.1)
    #     # 输出
    #     out = tf.matmul(input, self.weights) + self.bias
    #     # 激活函数
    #     if self.activation_Function is None:
    #         outputs = out
    #     else:
    #         outputs = self.activation_function(out)
    #     out_list.append(outputs)
    #     out_list.append(self.weights)
    #     out_list.append(self.bias)
    #     return out_list

    def add_layer(self, input, in_size, out_size, activation_function):
        out_list = []
        # 权重和偏置量
        self.weights = tf.Variable(tf.random_normal([in_size, out_size]))
        self.biases = tf.Variable(tf.zeros([1, out_size]) + 0.1)
        # 输出
        out = tf.matmul(input, self.weights) + self.biases
        # 激活函数
        if activation_function == 'relu':
            outputs = tf.nn.relu(out)
        elif activation_function == 'softmax':
            outputs = tf.nn.softmax(out)
        out_list.append(outputs)
        out_list.append(self.weights)
        out_list.append(self.biases)
        return out_list