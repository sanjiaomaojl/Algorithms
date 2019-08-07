package NetDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket sc = ss.accept();
        InputStream is = sc.getInputStream();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\SanJiaoMao\\Desktop\\2.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while (( len = is.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        System.out.println("成功写入文件");

        OutputStream os = sc.getOutputStream();
        os.write("上传成功".getBytes());

        ss.close();
        sc.close();
        fos.close();
    }
}
