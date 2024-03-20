package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalaulateAgeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日");
        String birthday = sc.nextLine();

        LocalDate localDate =LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy年M月d日"));
        LocalDate now = LocalDate.now();
        long l = ChronoUnit.YEARS.between(localDate, now);
        System.out.println(l);
    }
}
