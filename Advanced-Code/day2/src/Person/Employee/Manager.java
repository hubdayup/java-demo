package Person.Employee;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为"+super.getName()+",年龄为"
                +super.getAge()+",工资为"+super.getSalary()+",奖金为"+
                bonus+"的项目经理正在分配任务");
    }
}
