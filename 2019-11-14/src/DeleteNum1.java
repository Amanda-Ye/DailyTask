import java.util.*;

public class DeleteNum1 {
    public static int func(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(i);
        }
        int index = 0;
        //模拟循环队列删除，隔两个删一个
        while(list.size() > 1){
            index = (index + 2) % list.size();
            list.remove(index);
        }
        return list.get(0);
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
