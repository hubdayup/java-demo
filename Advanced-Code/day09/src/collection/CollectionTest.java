package collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        /**
        Collection<Student> c = new ArrayList<>();
        c.add(new Student("张三",22));
        c.add(new Student("李三",24));
        c.add(new Student("王三",25));

        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.getName()+"----"+stu.getAge());
        }*/
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ageResult = o1.getAge()- o2.getAge();
                return ageResult ==0?o1.getName().compareTo(o2.getName()):ageResult;

            }
        });
        ts.add(new Student("张三",26));
        ts.add(new Student("张三",26));
        ts.add(new Student("张三",26));
        ts.add(new Student("张三",26));
        System.out.println(ts);
    }

}
