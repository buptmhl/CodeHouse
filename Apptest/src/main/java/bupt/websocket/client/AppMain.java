package bupt.websocket.client;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.log4j.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

public class AppMain {

//	public static void main(String[] args)
//			throws DeploymentException, IOException, URISyntaxException, InterruptedException {
//		// Auto-generated method stub
//		WebSocketContainer conmtainer = ContainerProvider.getWebSocketContainer();
//		WebSocketClient client = new WebSocketClient();
//		conmtainer.connectToServer(client,
//				new URI("ws://127.0.0.1:5000"));
//
//		int turn = 0;
//		while(turn++ < 10){
//			client.send("send text: " + (char)(65 + turn));
//			Thread.sleep(1000);
//		}
//		client.close();
//	}


    public static void main(String[] args) throws URISyntaxException, IOException, NoSuchAlgorithmException, InterruptedException {
                Logger logger = Logger.getLogger("main");

                WebSocketClient client = new WebSocketClient(new URI("ws://localhost:5001/bupt.websocket/"), new Draft_17()) {
                    @Override
                    public void onOpen(ServerHandshake serverHandshake) {
                        System.out.println(getURI());
                    }

                    public void onMessage(java.lang.String message) {

                    }

            public void onClose(int code, java.lang.String reason, boolean remote) {

            }

//            @Override
            public void onMessage(String s) {
                System.out.println("received message: " + s);
            }

//            @Override
            public void onClose(int i, String s, boolean b) {
                System.out.println("close: " + s);
            }


            @Override
            public void onError(Exception e) {
                System.out.println("exception: " + e);
            }
        };
        client.connect();

        Thread.sleep(3000);
//        client.send("hello world!");

        File file = new File("E:\\API\\java\\data\\xml.xml");
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // 开始传输文件
        System.out.println("======== 开始传输文件 ========");
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1) {
            bos.write(b, 0, n);
        }
        fis.close();
        bos.close();

        byte[] buffer = bos.toByteArray();
        try {
            client.send(buffer);
        } catch (Exception e) {
                  }
    }
}




