import java.util.*;

public class GrayCode {

    /*递归的思路：即n位gray码是由n - 1位gray码生成
    *比如求n = 3的gray码，首先知道n = 2的gray码是（00，01，11，10）
    * 那么n = 3的gray码其实是对n = 2的gray码首位添加0或1生成的，
    * 添加 0 后变成（000，001，011，010）
    * 添加 1 后需要顺序反向就变成（110，111，101，100）
    * 组合在一起就是（000，001，011，010，110，111，101，100）
     */
    public static String[] getGray(int n) {
        String[] strs = null;
        if(n == 1){
            strs =  new String[]{"0","1"};
        }else{
            String[] ret = getGray(n - 1);
            strs = new String[2 * ret.length];
            for(int i = 0;i < ret.length;i++){
                strs[i] = "0" + ret[i];
                strs[strs.length - i - 1] = "1" + ret[i];
            }
        }
        return strs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(Arrays.toString(getGray(n)));
        }
    }
}
