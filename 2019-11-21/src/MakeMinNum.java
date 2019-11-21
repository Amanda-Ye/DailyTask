import java.util.Scanner;

//数组中的10个数依次表示我们拥有的0，1，2，...9的个数
public class MakeMinNum {
    public static String func(int[] nums){
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < nums.length;i++){
            while(nums[i] != 0){
                sb.append(i);
                nums[i]--;
            }
        }
        if(nums[0] != 0){
            String s = "";
            while(nums[0] != 0){
                s += "0";
                nums[0]--;
            }
            sb.insert(1,s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        while(sc.hasNext()){
            for(int i = 0;i < nums.length;i++){
                nums[i] = sc.nextInt();
            }
        }
        System.out.println(func(nums));
    }
}
