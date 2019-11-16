import java.util.*;

//题目要求是走的网格格子而不是网格线的交点！！！
public class RobotWalk {
    //考点：动态规划，递归

    //方法1：基本动态规划
    public static int countWays(int x, int y) {
        int[][] dp = new int[x][y];
        //第一列进行初始化，因为只有竖着走一种走法
        for(int i = 1;i < x;i++){
            dp[i][0] = 1;
        }
        //第一行进行初始化，因为只有横着走一种走法
        for(int i = 1;i < y;i++){
            dp[0][i] = 1;
        }
        //dp[i][j]的走法等于走到上边一格和走到左边一格的走法之和
        for(int i = 1;i < x;i++){
            for(int j = 1;j < y;j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[x - 1][y - 1];
    }
    //方法2：递归
    public static int countWays1(int x, int y){
        if(x == 1 || y == 1){  //当只有一行或一列时只有一种走法
            return 1;
        }
        return countWays1(x - 1,y) + countWays1(x,y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(countWays(x,y));
        }
    }
}
