import java.util.Arrays;
import java.util.Scanner;

public class NumOfCandy {
    private  int[] values = new int[4];  //A-B, B-C, A+B, B+C

    private void method(){
        int a = (values[0] + values[2]) / 2;
        int c = (values[3] - values[1]) / 2;
        int b1 = (values[1] + values[3]) / 2;  //b 有两种计算方法，若两个结果相等则正确
        int b2 = (values[2] - values[0]) / 2;
        if(b1 == b2){
            System.out.println(a + " " + b1 + " " + c);
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        NumOfCandy p = new NumOfCandy();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < p.values.length;i++){
            p.values[i] = sc.nextInt();
        }
       p.method();
    }
}
