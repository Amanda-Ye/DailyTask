import java.util.Scanner;

//数组中的逆序对（前面一个数字大于后面一个数字，则这两个数组成一个逆序对）
public class AntiOrder {
    public static int count(int[] A, int n) {
        int count = 0;
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[8];
        int i = 0;
        System.out.println("请输入数据：");
        while(i < A.length){
            A[i++] = scanner.nextInt();
        }
        System.out.println(count(A,A.length));
    }
}