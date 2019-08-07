package NetDemo;

import java.io.*;
import java.net.Socket;

//文件上传
public class TcpClientDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.jpg");
        Socket sc = new Socket("localhost", 8888);
        OutputStream os = sc.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            //写数据到服务器
            os.write(bytes, 0, len);

        }
        sc.shutdownOutput();
        //读取服务器回写的数据
        InputStream is = sc.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
        sc.close();
    }
}
