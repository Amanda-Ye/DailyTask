import java.util.Scanner;

public class ReverseNum {
    //方法1：逐个取出末尾数字连接到字符串
    public static String func(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int val = n % 10;
            sb.append(val);
            n /= 10;
        }
        return sb.toString();
    }
    //方法2：将整数转换为字符串，进行逆置
    public static String func1(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
}
