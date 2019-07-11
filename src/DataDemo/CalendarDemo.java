package DataDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.YEAR;
        int month = calendar.MONTH + 1;
        int date1 = calendar.DAY_OF_MONTH;
        int date2 = calendar.DATE;
        //设置年
        calendar.set(Calendar.YEAR,9999);
        calendar.set(2019,2,25);
        //把年增加两年,增加是正数，减少是负数 月份从0开始，0-11
        calendar.add(Calendar.YEAR,2);
        //把日历转换为日期
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
