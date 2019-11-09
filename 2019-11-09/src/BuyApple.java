import java.util.Scanner;

public class BuyApple {
    /*
    * n 为偶数时 y 的可能值只有0，2，4，6
    * 8 + 0 = 8（1个） 8 + 2 = 10（-1）
    * 8 + 8 + 2 = 18(x - 2 + 3即x + 1)
    * 8 + 4 = 12（x - 1 + 2即x + 1）
    * 8 + 6 = 14(x + 1)
    */
    public static int leastBags(int n){
        int x = n / 8;
        int y = n % 8;
        if(n % 2 != 0){
            return -1;
        }else if(n == 10){
            return -1;
        }else{
            if(y == 0){
                return x;
            }else{
                return x + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(leastBags(n));
        }
        //System.out.println(leastBags(20));
    }
}
