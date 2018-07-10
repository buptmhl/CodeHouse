package bupt.websocket.utils;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class FileUtils {

     static WebSocketClient client;
     /*定义构造函数，实现websocket连接
     * */

     public FileUtils() throws URISyntaxException, InterruptedException {
             client = new WebSocketClient(new URI("ws://localhost:5001/websocket"), new Draft_17()){

             public void onOpen(ServerHandshake handshakedata) {
                 //client.send("Hello WebSockets!");
             }

             public void onMessage(java.lang.String message){
                 try {
                     //ByteArrayInputStream byt = new ByteArrayInputStream(bytes);
                     File directory = new File("D:\\FTCache");
                     if (!directory.exists()) {
                         directory.mkdir();
                     }
                     File file_r = new File(directory.getAbsolutePath() + File.separatorChar + "data.xml");
                     FileOutputStream fos = new FileOutputStream(file_r);

                     // 开始接收文件
                     fos.write(message.getBytes(), 0, message.length());
                     fos.flush();
                     System.out.println("======== 文件接收成功 []  ========");
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }

             public void onClose(int code, java.lang.String reason, boolean remote) {

             }

             public void onError(Exception ex) {

             }

         };
         client.connect();
         Thread.sleep(3000);
     }
    /**
     * 将File转换为Byte
     * @param file
     * @return
     */
    public static boolean transportFileToByte(File file) throws IOException, URISyntaxException, InterruptedException {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // 开始传输文件
        System.out.println("======== 开始传输文件 ========");
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1) {
            bos.write(b, 0, n);
        }
        System.out.println();

        client.send(b);
        System.out.println("======== 文件传输成功 ========");
        return true;
    }


        /**
         * 将Byte 转换为File
         * @param bytes
         * @return
         */
   /* public static void transportByteToFile(WebSocketClient client) throws IOException {
        try {
            ByteArrayInputStream byt = new ByteArrayInputStream(bytes);
            File directory = new File("D:\\FTCache");
            if (!directory.exists()) {
                directory.mkdir();
            }
            File file_r = new File(directory.getAbsolutePath() + File.separatorChar + "data.xml");
            FileOutputStream fos = new FileOutputStream(file_r);

            // 开始接收文件
            byte[] bytes_r = new byte[1024];
            int length = 0;
            while ((length = byt.read(bytes_r, 0, bytes_r.length)) != -1) {
                fos.write(bytes_r, 0, length);
                fos.flush();
            }
            System.out.println("======== 文件接收成功 []  ========");
        } catch (Exception e) {
            e.printStackTrace();
        }
     }*/
}



