import java.util.Scanner;

public class NumsOfZero {

    /*思路：
    * 能被5（5^1）整除的提供1个0
    * 能被25（5^2）整除的提供2个0
    * 能被125（5^3）整除的提供3个0
    * 能被625（5^4）整除的提供4个0
    * 结果 = n/5 + n/25 + n/125 + n/625
     */
    public static int func(int n){
        int count = 0;
        while(n > 0){
            count += n / 5;
            n /= 5;
        }
        return count;
    }
    public static int func1(int n){
        int count = 0;
        for(int i = 1;i <= n;i++){
            if(i % 5 == 0){
                count++;
            }
            if(i % 25 == 0){
                count++;
            }
            if(i % 125 == 0){
                count++;
            }
            if(i % 625 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
}
