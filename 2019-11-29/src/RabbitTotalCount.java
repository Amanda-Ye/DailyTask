import java.util.*;

public class RabbitTotalCount {
    public static int getTotalCount(int monthCount){
        if(monthCount < 3){
            return 1;
        }
        return getTotalCount(monthCount - 1) +
                getTotalCount(monthCount - 2);
    }

    public static int getTotalCount1(int monthCount){
        int ones = 1;  //一个月大的兔子数目
        int twos = 0;  //两个月大的兔子数目
        int threes = 0;  //三个月大的兔子数目
        while(--monthCount > 0){
            threes += twos;
            twos = ones;
            ones = threes;
        }
        return ones + twos + threes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int monthCount = in.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}
