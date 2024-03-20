import Person.Student;
import Person.Teacher;

public class Test {
    public static void main(String[] args) {

       Teacher t = new Teacher("张三",30);
       t.teach();
        Student stu = new Student("李四",20,100);
        stu.study();
    }
}