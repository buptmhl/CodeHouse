import json
import websocket
import socket


def on_message(ws, message):
    # print(message)
    msg_id, label, content = message.split('\n', 2)
    if is_json(content):
        content = json.loads(content)
    else:
        content = content
    if label == "/config/train":
        global data_dict
        data_id = content["datasetId"]
        datas = content["datas"]
        data_dict[data_id] = datas
        print(data_dict)
    elif label == "/config/model":
        global model_para
        model_para = content
        print(model_para)
    elif label == "/config/train/id":
        print("train_id")
    elif label == "/config/test":
        print("test_dataSet")
    elif label == "/control/start":
        dict = {"loss":0.5,"remainingTime":200,"precision":0.8}
        json_str = json.dumps(dict)
        string = msg_id + '\n' + '/notify/process' + '\n' + json_str
        ws.send(string)
        print("transported loss end")
        end = 'train_end'
        end_str = json.dumps(end)
        end = str(msg_id)+'\n'+'/notify/train_end'+'\n'+end_str
        ws.send(end)
    elif label == "/apply":
        print("model input:")
        print(content)
        prediction = str(100)
        json_pred = json.dumps(prediction)
        pred = str(msg_id) + '\n' + '/notify/apply' + '\n' + json_pred
        ws.send(pred)
    elif label == "/get/uri":
        print("cal_tensorboard")
        tensor_link = 'www.cctv.com'
        json_tblink = json.dumps(tensor_link)
        tb_link = str(msg_id) + '\n' + '/notify/apply' + '\n' + json_tblink
        ws.send(tb_link)
    else:
        print("others")




def on_error(ws, error):
    print(error)


def on_close(ws):
    print("closed")


def on_open(ws):
    # ws.send("hello,Im python")
    # ws.send()
    print("OK")

def is_json(myjson):
    try:
        json_boject = json.loads(myjson)
    except ValueError:
        return False
    return True


if __name__ == '__main__':
    data_dict = {}
    model_para = {}
    websocket.enableTrace(True)
    host = "ws://10.108.69.165:8181/onos/soon/soon"
    ws = websocket.WebSocketApp(host, on_open=on_open,on_message=on_message, on_error=on_error, on_close=on_close)
    # process = "/notify/process\n{'loss':0.5}"
    # ws.send(process)

    # server = socket.socket()
    # server.bind(("localhost", 8000))
    # server.listen(5)
    # flag = True
    # while flag:
    #     conn, addr = server.accept()
    #     print("conn", conn, "\naddr", addr)
    #     flag = False
    ws.run_forever()