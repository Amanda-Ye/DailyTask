import java.util.*;

//神奇的口袋（总体积为40，已知 n 种物体的体积，求有多少种方法可以组成体积为 40 的整体）
public class MagicPocket {
    private static int n;
    private static int[] values;
    /*
    * 递归：将物品数目和物品体积设为全局变量
    * methods(i ,sum) = methods(i + 1 , sum - values[i]) + methods(i + 1,sum)
    * methods(i ,sum)表示从i开始统计和为sum的方法数
    * methods(i + 1 , sum - values[i])表示从i + 1开始统计和为sum - values[i]的方法数
    * methods(i + 1,sum)表示从i + 1开始统计和为sum的方法数*/
    private static int methods(int i, int sum){
        if(sum == 0){
            return 1;  //找到一组和为sum的组合
        }
        if(i == n || sum < 0){
            return 0;   //i == n 说明没有其他的数来组合；sum < 0 说明组合不出
        }
        return methods(i + 1,sum - values[i]) + methods(i + 1,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        values = new int[n];
        for(int i = 0;i < n;i++){
            values[i] = sc.nextInt();
        }
        System.out.println(methods(0,40));
        /*n = 3;
        values = new int[n];
        values[0] = 20;
        values[1] = 20;
        values[2] = 20;*/
    }
}
