package bupt.websocket.client;


import bupt.websocket.utils.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;


public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, NoSuchAlgorithmException, InterruptedException {
        Logger logger = Logger.getLogger("main");

       /* WebSocketClient client = new WebSocketClient(new URI("ws://localhost:5001/bupt.websocket/"), new Draft_17()) {

            public void onOpen(ServerHandshake handshakedata) {

            }

            public void onMessage(java.lang.String message) {

            }

            public void onClose(int code, java.lang.String reason, boolean remote) {

            }

            public void onError(Exception ex) {

            }

        };
        client.connect();
        Thread.sleep(3000);

        File file = new File("E:\\API\\java\\data\\xml.xml");
        client.send(FileUtils.transportFileToByte(file));*/
        FileUtils test=new FileUtils();
        File file = new File("E:\\simulation\\java\\dianwang\\src\\main\\java\\zhaozipiao\\bupt.xmlProcessor\\model.xml");
        test.transportFileToByte(file);
    }
}
