import java.util.*;

public class WeiXinRedPacket {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int count = map.getOrDefault(gifts[i],0);
            map.put(gifts[i],count + 1);
            if(count > n / 2){
                return gifts[i];
            }
        }
        return 0;
    }
}

