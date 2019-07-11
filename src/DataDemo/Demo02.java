package DataDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出生年月");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(string);
        long bir = parse.getTime();
        long now = new Date().getTime();
        long time = now - bir;
        System.out.println(time/1000/24/60/60/365);
    }
}
