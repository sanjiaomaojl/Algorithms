package NetDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost", 8888);
        OutputStream os = sc.getOutputStream();
        os.write("吃了吗？".getBytes());
        InputStream is = sc.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        sc.close();
    }
}
