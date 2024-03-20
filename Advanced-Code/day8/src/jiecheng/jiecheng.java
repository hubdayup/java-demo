package jiecheng;

public class jiecheng {
    public static void main(String[] args) {
        int i = he(5);
        System.out.println(i);
        int shentued = shentu(20);
        System.out.println(shentued);


    }
    public static int he(int n){
        if(n == 1){
            return 1;
        }else {
            n=n+he(n-1);
        }
        return n;
    }
    public static int shentu(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return shentu(n-1)+shentu(n-2);
        }
    }
}
