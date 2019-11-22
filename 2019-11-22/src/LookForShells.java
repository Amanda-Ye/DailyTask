import java.util.Scanner;

/*起始位置 x ，设f(x)=4x+3,g(x)=8x+7。目标位置 10_0000_0007 的倍数
计算可以得到以下两个规律：
（1）g(f(x))=f(g(x))   即f和g的执行顺序没有影响。
（2）f(f(f(x)))=g(g(x))    即做3次f变换等价于做2次g变换
 由于规律（1）对于一个可行方案，我们可以调整其变换的顺序。如ffggfggff，我们可以转化成 fffffgggg。
 由于规律（2），并且为了使执行次数最少，每3个f我们可以转化成2个g，如方案fffffgggg，可以转化成ffgggggg。
 因此一个最优的策略，f的执行次数只能为0,1,2。
 对于输入的x，我们只需要求x，4x+3,4（4x+3）+3 的最小 g 执行次数就可以了。*/
public class LookForShells {
    public static void func(int x){
        int count = 0;
        while(x != 0 && count <= 30_0000){
            count++;
            x = (2 * x + 1) % 10_0000_0007;
        }
        if((count + 2) / 3 <= 10_0000){  //最优的策略：f的执行次数只能为0,1,2
            System.out.println((count + 2) / 3);
        }else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            func(x);
        }
    }
}
