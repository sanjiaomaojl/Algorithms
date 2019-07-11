package Basic;

import java.util.Scanner;

public class RegisterException{

    static String[] userNames = {"张京龙", "钱宝宝"};

    public static void main(String[] args) /*throws CustomException*/ {
        System.out.println("请输入你要注册的用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        try {
            checkName(username);
        } catch (CustomException e) {
            e.printStackTrace();
            return;
        }
    }

    private static void checkName(String username) throws CustomException {
        for (String name : userNames) {
            if (username.equals(name))
                throw new CustomException("亲，用户已存在") ;
        }

        System.out.println("注册成功");
    }


}
