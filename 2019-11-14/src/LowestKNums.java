import java.util.Arrays;
import java.util.Scanner;

public class LowestKNums {
    public static void func(int[] a,int n,int k){
        int[] b = Arrays.copyOf(a,n);
        Arrays.sort(b);
        for(int i = 0;i < k;i++){
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while(sc.hasNext()){
            a[i++] = sc.nextInt();
        }
        func(a,i - 1,a[i - 1]);
    }
}
