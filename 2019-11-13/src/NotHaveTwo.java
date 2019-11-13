import java.util.*;
/*
*不要二：（任意两块蛋糕之间的欧几里得数不等于2）
* 只要数清楚每个四行中  行（0 ~ h - 1） 列（0 ~ w - 1）
* i 或 i + 1 行的蛋糕数为 (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2)
* i + 2 或 i + 3 行的蛋糕数为 ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2)
* 然后算清楚一共有多少个完整的4行，当然是共有 m / 4 个
* 唯一要注意的就是处理行数除以4有余数的情况，把最后可能剩余的1 - 3 行加进去*/
public class NotHaveTwo {
    public static int numOfCake(int w,int h){
        int evenCount = (w / 4) * 2 + (w % 4 < 2 ? w % 4 : 2);
        int oddCount = ((w - 2) / 4) * 2 + ((w - 2) % 4 < 2 ? (w - 2) % 4 : 2);
        int ans = h / 4 * (evenCount + oddCount) * 2;
        if(h % 4 > 0){
            ans += evenCount;
        }
        if(h %4 > 1){
            ans += evenCount;
        }
        if(h %4 > 2){
            ans += oddCount;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int w = sc.nextInt();
            int h = sc.nextInt();
            System.out.println(numOfCake(w,h));
        }
    }
}
