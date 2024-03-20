package Person;

public class Student extends Person{
    private double score;
    public Student() {
    }

    public Student(String name, int age,double score) {
        super(name, age);
        this.score = score;
    }
    public void study(){
        System.out.println("姓名为"+super.getName()+"年龄为"+super.getAge()+"分数为"+score+"正在学习");
    }

}
