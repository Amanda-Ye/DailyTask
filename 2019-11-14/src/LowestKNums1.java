import java.util.*;

public class LowestKNums1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int k = Integer.parseInt(str[str.length - 1]);
        int[] array = new int[str.length - 1];
        for(int i = 0;i < array.length;i++){
            array[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < k;i++){
            if(i == k - 1){
                sb.append(array[i]);
            }else{
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
