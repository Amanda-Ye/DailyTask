import java.util.Scanner;

public class NumStatistic {
    //输入为一个不超过 1000位 的正整数，故组要用字符串来保存该整数
    public static void func(String n){
        int[] a = new int[10];
        for(int i = 0;i < n.length();i++){
            a[n.charAt(i) - '0']++;
        }
        for(int i = 0;i < a.length;i++){
            if(a[i] != 0){
                System.out.println(i + ":" + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String n = sc.next();
            func(n);
        }
    }
}
