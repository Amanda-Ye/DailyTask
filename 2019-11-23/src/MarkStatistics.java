import java.util.*;

public class MarkStatistics {
    public static int count(int n,int[] score,int val){    //通过全部测试用例
        int count = 0;
        for(int i = 0;i < n;i++){
            if(score[i] == val){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] score = new int[n];
            for(int i = 0;i < n;i++){
                score[i] = sc.nextInt();
            }
            int val = sc.nextInt();
            System.out.println(count(n,score,val));
        }
    }
}
