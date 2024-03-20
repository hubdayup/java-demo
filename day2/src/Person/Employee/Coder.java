package Person.Employee;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为"+super.getName()+
                ",年龄为"+super.getAge()+",工资为"+
                super.getSalary()+"正在工作");
    }
}
