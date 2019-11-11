import java.util.*;

public class OverHalf {
    private static void method(int[] nums,int n){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < n;i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
        }
        for(Map.Entry e : map.entrySet()){
            if((int)e.getValue() >= nums.length / 2){
                System.out.println((int)e.getKey());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while(sc.hasNext()){
            a[i++] = sc.nextInt();
        }
        method(a,i);
    }
}
