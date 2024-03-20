package Person.Employee;

public class Test {
    public static void main(String[] args) {
        Coder cc = new Coder("张三",27,5000);
        cc.work();
        Manager m = new Manager("李四",22,15000,5000);
        m.work();
    }

}
