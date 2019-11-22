import java.util.*;

//不使用 + 和其他算数运算符，返回 A+B 的值
public class UnusualAdd {
    //二进制加法：
    //位的异或运算跟求和的结果一致
    //位的与运算跟求进位的结果一致
    public static int addAB(int A, int B) {
        if(A == 0) return B;
        if(B == 0) return A;
        int addNoCarry = 0,carry = 0;
        while(B != 0){
            addNoCarry = A ^ B;
            carry = (A & B) << 1;
            A = addNoCarry;
            B = carry;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(addAB(a,b));
        }
    }
}