package itheima.mstatic.tools;

/**
 * 以后在所有的主类上面打上注释，这个项目的功能是做什么
 *     /**这三个字符打出来敲回车就可以自动出现注释
 *     左边行数的旁边，绿色条是git上没有的代码，是你新增的
 *     蓝色条是修改了的代码
 *     灰色条是删除的代码
 *     点击条可以查看线上代码与本地代码对比
 */
public class Test {
    public static void main(String[] args) {
        Coder C = new Coder();

    }
}
    class emplyee{
        private String name;
        private int age;
        private double salary;

        public emplyee() {
        }

        public emplyee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
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
         * @return salary
         */
        public double getSalary() {
            return salary;
        }

        /**
         * 设置
         * @param salary
         */
        public void setSalary(double salary) {
            this.salary = salary;
        }

        }
        class Coder extends emplyee{

        }
        class Manager extends  emplyee{

        }


