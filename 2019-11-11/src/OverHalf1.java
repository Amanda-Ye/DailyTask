import java.util.*;

public class OverHalf1 {
    public static void method(int[] a){
        int t = a[0];
        int count = 1;
        for(int i = 1;i < a.length;i++){
            if(a[i] == t){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                t = a[i];
                count++;
            }
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while(sc.hasNext()){
            a[i++] = sc.nextInt();
        }
        method(a);
    }
}
