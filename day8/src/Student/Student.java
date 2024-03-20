package Student;

public class Student {
    private String name ;
    private int age;
    private double math;
    private double english;
    private double yuwen;

    public Student() {
    }

    public Student(String name, int age, double math, double english, double yuwen) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.english = english;
        this.yuwen = yuwen;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) throws StudnetException {

        if(0<=math&&math<=100){
            this.math = math;
        }else {throw new StudnetException("成绩输入有误，需要0~100");
         }
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english)throws StudnetException {
        if(0<=english&&english<=100){
            this.english = english;
        }else {throw new StudnetException("成绩输入有误，需要0~100");
        }
    }

    /**
     * 获取
     * @return yuwen
     */
    public double getYuwen() {
        return yuwen;
    }

    /**
     * 设置
     * @param yuwen
     */
    public void setYuwen(double yuwen)throws StudnetException {
        if(0<=yuwen&&yuwen<=100){
            this.yuwen = yuwen;
        }else {throw new StudnetException("成绩输入有误，需要0~100");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", math = " + math + ", english = " + english + ", yuwen = " + yuwen + "}";
    }


}
