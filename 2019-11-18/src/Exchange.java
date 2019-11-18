import java.util.*;

public class Exchange {
    public static int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] AB = new int[2];
        while(sc.hasNext()){
            AB[0] = sc.nextInt();
            AB[1] = sc.nextInt();
            System.out.println(Arrays.toString(exchangeAB(AB)));
        }
    }
}