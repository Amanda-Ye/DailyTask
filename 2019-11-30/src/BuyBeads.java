import java.util.*;

public class BuyBeads {
    public static void isCanBuy(String sell,String need){
        int less = 0;   //缺少的珠子
        Map<Character,Integer> haved = new HashMap<>();
        for(int i = 0;i < sell.length();i++){   //卖家珠子及数目的键值映射
            char c = sell.charAt(i);
            int count = haved.getOrDefault(c,0);
            haved.put(c,count + 1);
        }
        char[] needs = need.toCharArray();
        for(int i = 0;i < needs.length;i++){
            if(haved.containsKey(needs[i])){
                if(haved.get(needs[i]) > 0){
                    int count = haved.get(needs[i]);
                    haved.put(needs[i],count - 1);
                }else{
                    less++;   //累计所缺的珠子数目
                }
            }else{
                less++;
            }
        }
        if(less == 0){
            System.out.println("Yes " + (sell.length() - need.length()));
        }else{
            System.out.println("No " + less);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String sell = in.nextLine();
            String need = in.nextLine();
            isCanBuy(sell,need);
        }
    }
}
