import java.util.*;

public class ScoreSort {
    private static String[] names;
    private static int[] scores;

    private static boolean compare(int i,int j,int flag){
        return flag == 0 ? scores[i] > scores[j] : scores[i] < scores[j];
    }

    private static void exchange(int i,int j){
        String tempN = names[j];
        int tempsS = scores[j];
        names[j] = names[i];
        scores[j] = scores[i];
        names[i] = tempN;
        scores[i] = tempsS;
    }

    public static void sort(int flag){
        for(int i = 0;i < names.length;i++){
            for(int j = i;j > 0 && compare(j,j - 1,flag);j--){
                exchange(j,j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int flag = sc.nextInt();
            names = new String[n];
            scores = new int[n];
            for(int i = 0;i < n;i++){
                names[i] = sc.next();
                scores[i] = sc.nextInt();
            }
            sort(flag);
            for(int i = 0;i < n;i++){
                System.out.println(names[i] + " " + scores[i]);
            }
        }
    }
}
