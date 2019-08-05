package IODemo;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PaixuDeemo {
    public static void main(String[] args) throws IOException{
        Map<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        
        for (String key : map.keySet()) {
            String line1 = key + "." + map.get(key);
            bw.write(line1);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
