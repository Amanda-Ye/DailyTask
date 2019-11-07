import java.util.Scanner;
//三个空汽水瓶换一瓶汽水
public class PressurizedBottle {
    public static int nums(int n){
        int sum = 0;
        while(n > 1){
            sum += n / 3;
            n = n / 3 + n % 3;
            if(n == 2){
                sum += 1;
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("请输入测试数据：");
        while(scanner.hasNext()){
            n = scanner.nextInt();
            System.out.println(nums(n));
        }
    }
}
