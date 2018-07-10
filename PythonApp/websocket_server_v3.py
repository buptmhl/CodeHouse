from bottle import request, Bottle, abort
from geventwebsocket import WebSocketError
from gevent.pywsgi import WSGIServer
from geventwebsocket.handler import WebSocketHandler
app = Bottle()


@app.get('/websocket')
def handle_websocket():
    wsock = request.environ.get('wsgi.websocket')
    if not wsock:
        abort(400, 'Expected WebSocket request.')
    while True:
        try:
            message = wsock.receive()
        except WebSocketError:
            break
        print("55555555555555555555")
        if message:
            with open("E:/xml2.xml", "w") as f:
                readstr = message.decode('utf-8')  # 直接转换成str格式
                f.write(readstr)


server = WSGIServer(("localhost", 5001), app, handler_class=WebSocketHandler)
server.serve_forever()
