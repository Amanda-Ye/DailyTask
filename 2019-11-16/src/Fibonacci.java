import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        int f0 = 0;
        int f1 = 1;
        int f = 0;
        while(f < n){
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return Math.min(f - n,n - f0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(fib(n));
        }
    }
}
