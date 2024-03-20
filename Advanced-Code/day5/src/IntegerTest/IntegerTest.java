package IntegerTest;

public class IntegerTest {
    public static void main(String[] args) {
        String s ="10,50,30,20,40";
        String arr[] = s.split(",");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);}

            int max = num[0];
            for (int i1 = 0; i1 < num.length; i1++) {
                if(num[i1]>max){
                    max = num[i1];
                }
            }
        System.out.println("最大值为："+max);
        }

    }

