package tryCatchTest;

import java.util.Scanner;

public class trycatchtest  {
    public static void main(String[] args)  {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        stu.setName(sc.nextLine());
        System.out.println("请输入学生年龄");
        while (true) {
            try {
                stu.setAge(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄输入有误");
            } catch (StudentAgeException e) {
                String message = e.getMessage();
                System.out.println(message);
            }

        }
        System.out.println(stu);
    }
}
