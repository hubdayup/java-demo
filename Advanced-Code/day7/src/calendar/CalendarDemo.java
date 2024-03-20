package calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /**
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        char[] weeks = {' ','日','一','二','三','四','五','六',};

        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeks[week]); */
        Calendar c = Calendar.getInstance();
        c.set(2050,2,1);
        int dayofweek = c.get(Calendar.DAY_OF_WEEK);
        if(dayofweek == 5){
            System.out.println("是疯狂星期四");
        }else{
            System.out.println("不是疯狂星期四");
        }
    }
}
