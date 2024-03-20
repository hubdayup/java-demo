package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：xxxx年xx月xx日");
        String birthday = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = simpleDateFormat.parse(birthday);
        Date today = new Date();
        long l = today.getTime() - birthdayDate.getTime();
        System.out.println(l/1000/60/60/24);

    }
}
