import java.text.DecimalFormat;
import java.util.*;

public class NumClassify {
    private static int A1 = 0;  //能被5整除的数字中所有偶数的和
    private static int A2 = 0;  //被5除后余1的数字按给出顺序进行交错求和，即n1-n2+n3-n4...
    private static int A3 = 0;  //被5除后余2的数字的个数
    private static double A4 = 0;  //被5除后余3的数字的平均数，精确到小数点后1位
    private static int A5 = Integer.MIN_VALUE;  //被5除后余4的数字中的最大数

    private static int flag = 1;  //进行交错求和时的符号
    private static int count1 = 0;  //被5除后余1的数的个数
    private static int count2 = 0;  //被5除后余3的数的个数
    static DecimalFormat df = new DecimalFormat("#.0");  //精确到小数点后一位

    public static void classify(int[] arr,int n){
        for(int i = 0;i < n;i++){
            int odd = arr[i] % 5;  //被5除后的余数
            switch(odd){
                case 0:{
                    if(arr[i] % 2 == 0){
                        A1 += arr[i];
                    }
                    break;
                }
                case 1:{
                    count1++;
                    A2 += (arr[i] * flag);
                    flag = -flag;
                    break;
                }
                case 2:{
                    A3++;
                    break;
                }
                case 3:{
                    count2++;
                    A4 += arr[i];  //余3的数字之和
                    break;
                }
                case 4:{
                    if(arr[i] > A5){
                        A5 = arr[i];
                    }
                }
                default:
                    break;
            }
        }
        System.out.print(A1 == 0 ? "N " : A1 + " ");
        System.out.print(count1 == 0 ? "N " : A2 + " ");
        System.out.print(A3 == 0 ? "N " : A3 + " ");
        System.out.print(A4 == 0 ? "N " : df.format(A4 / count2) + " ");
        System.out.print(A5 == Integer.MIN_VALUE ? "N" : A5);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = in.nextInt();
            }
            classify(arr,n);
        }
    }
}
