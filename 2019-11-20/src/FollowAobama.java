import java.util.Scanner;

public class FollowAobama {
    public static void func(int n,char c){
        int row = (n + 1) / 2;    //行数是列数的50%（四舍五入取整）
        for(int i = 0;i < row;i++){
            if(i == 0 || i == row - 1){
                for(int j = 0;j < n;j++){
                    System.out.print(c);
                }
                System.out.println();
            }else{
                System.out.print(c);
                for(int j = 1;j < n - 1;j++){
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String c = sc.next();
            func(n,c.charAt(0));
        }
    }
}
