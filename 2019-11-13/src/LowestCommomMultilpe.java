import java.util.*;

//最小公倍数
public class LowestCommomMultilpe {
    //方法1：（倍数试除法）
    // 用其中一个的倍数按序去除以另一个整数，找到第一个就返回
    public static int func1(int a,int b){
        int i = 1;
        int value = 0;
        while(true){
            value = a * i;
            if(value % b == 0){
                break;
            }
            i++;
        }
        return value;
    }

    //方法2：（辗转相除法）
    //两个数的乘积等于这两个数的最大公约数与最小公倍数的乘积，故可以先求出 最大公约数
    public static int func2(int a,int b){
        int mult = a * b;
        int t = 0;
        while(a % b != 0){
            t = a;
            a = b;
            b = t % b;
        }
        return mult / b;
    }

    //其他思考：如果两个数是互质数，则最小公倍数就是这两个数的乘积

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(func1(a,b));
        }
    }
}
