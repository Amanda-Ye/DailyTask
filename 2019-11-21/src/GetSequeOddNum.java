import java.util.Scanner;

//一个数 n 的立方总能写成 n 个奇数的和
public class GetSequeOddNum {
    public static String func(int n){
        StringBuilder sb = new StringBuilder();
        int num = n * (n - 1) + 1;  //第一个奇数
        for(int i = 0;i < n;i++){
            sb.append(num);
            sb.append('+');
            num += 2;
        }
        return sb.substring(0,sb.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
           int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
}
