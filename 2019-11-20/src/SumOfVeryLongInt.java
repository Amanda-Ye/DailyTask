import java.util.Scanner;

public class SumOfVeryLongInt {
    public static String func(String addend, String augend){
        StringBuilder sb = new StringBuilder();
        int cy = 0;   //进位
        int ret = 0;    //做加法时的临时值
        while(addend.length() < augend.length()){
            addend = "0" + addend;
        }
        //System.out.println(addend);
        while(augend.length() < addend.length()){
            augend = "0" + augend;
        }
        //System.out.println(augend);
        for(int i = addend.length() - 1;i >= 0;i--){
            ret = Integer.valueOf(addend.substring(i,i + 1)) + Integer.valueOf(augend.substring(i,i + 1)) + cy;
            //System.out.println(ret);
            cy = ret / 10;
            sb.append(String.valueOf(ret % 10));
        }
        //System.out.println(cy);
        //System.out.println(sb.toString());
        if(cy == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String addend = sc.next();
            String augend = sc.next();
            System.out.println(func(addend,augend));
        }
    }
}
