package Student;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) throws StudnetException {

            Student student= extracted();

        System.out.println(student);
    }

    private static Student extracted() throws StudnetException {
        Scanner sc = new Scanner(System.in);
        Student sut = new Student();
        System.out.println("请输入姓名");
        sut.setName(sc.nextLine());
        System.out.println("请输入年龄");
        sut.setAge(sc.nextInt());
        System.out.println("请输入英语成绩");
        while (true) {
            try { sut.setEnglish(sc.nextDouble());
                    break;
            }catch (NumberFormatException e){
                System.out.println("输入格式不对");
            } catch (StudnetException e){
                String message = e.getMessage();
                System.out.println(message);
            }
        }

        System.out.println("请输入数学成绩");
        while (true) {
            try { sut.setMath(sc.nextDouble());
                break;
            }catch (NumberFormatException e){
                System.out.println("输入格式不对");
            } catch (StudnetException e){
                String message = e.getMessage();
                System.out.println(message);
            }
        }

        System.out.println("请输入语文成绩");
        while (true) {
            try { sut.setYuwen(sc.nextDouble());
                break;
            }catch (NumberFormatException e){
                System.out.println("输入格式不对");
            } catch (StudnetException e){
                String message = e.getMessage();
                System.out.println(message);
            }
        }

        return sut;
    }
}

