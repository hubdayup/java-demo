package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String datecontent = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = dateFormat.parse(datecontent);
        Calendar c = Calendar.getInstance();
        c.setTime(date);//setTmie可以把日期对象转化为Calendar对象
        int dayofyear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayofyear);
    }
}
