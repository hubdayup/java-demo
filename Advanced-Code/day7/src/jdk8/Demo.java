package jdk8;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(2008,8,8,8,8,8);
        System.out.println(of);
        int year = now.getYear();
        now.withHour(12);
        now.withDayOfMonth(12);
        System.out.println(year+"年");
        System.out.println(now.getHour()+"时");
        System.out.println(now.getMonth()+"月");
        System.out.println(now.getDayOfMonth()+"日");
    }
}
