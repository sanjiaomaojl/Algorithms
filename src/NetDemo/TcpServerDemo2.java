package NetDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true){
            Socket sc = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = sc.getInputStream();
                        File file = new File("C:\\Users\\SanJiaoMao\\Desktop");
                        String filename = "zjl" + System.currentTimeMillis() + new Random().nextInt(8888) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while (( len = is.read(bytes)) != -1){
                            fos.write(bytes, 0, len);
                        }
                        System.out.println("成功写入文件");

                        OutputStream os = sc.getOutputStream();
                        os.write("上传成功".getBytes());

                        //ss.close();
                        sc.close();
                        fos.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
