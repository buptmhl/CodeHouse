package bupt.websocket.client;

import bupt.websocket.WebSocketServer;
import bupt.websocket.client.param.SampleConfigurator;
import bupt.websocket.client.param.SampleDecoder;
import bupt.websocket.client.param.SimpleEncoder;
import org.apache.log4j.Logger;

import javax.websocket.*;
import java.io.IOException;

@ClientEndpoint(
		configurator=SampleConfigurator.class,
		decoders={SampleDecoder.class},
		encoders={SimpleEncoder.class},
		subprotocols={})
public class WebSocketClient {

	private Logger logger = Logger.getLogger(WebSocketServer.class);
	private Session session;
	
	@OnOpen
	public void open(Session session){
		logger.info("Client WebSocket is opening...");
		this.session = session;
	}
	
	@OnMessage
	public void onMessage(String message){
		logger.info("Server send message: " + message);
	}
	
	@OnClose
	public void onClose(){
		logger.info("Websocket closed");
	}
	

    @OnError
    public void onError(Session session, Throwable t) {
        t.printStackTrace();
    }
    
	public void send(Object message){
		this.session.getAsyncRemote().sendObject(message);
	}
	
	public void close() throws IOException{
		if(this.session.isOpen()){
			this.session.close();
		}
	}
}
