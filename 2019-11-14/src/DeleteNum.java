import java.util.*;

public class DeleteNum {
    public static int func(int n){
       Queue list = new LinkedList();
       for(int i = 0;i < n;i++){
           list.offer(i);
       }
       //每次将两个元素插到队尾，然后删除下一个元素，重复此操作，直到剩下一个元素
       while(list.size() != 1){
           for(int j = 0;j < 2;j++){
               list.offer(list.poll());
           }
           list.poll();
       }
       return (int) list.poll();
    }

    public static int func1(int n){
        int last = 0;
        for(int i = 2;i <= n;i++){
            last = (last + 3) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n > 1000){
                n = 999;
            }
            System.out.println(func(n));
        }
    }
}
