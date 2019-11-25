import java.util.*;

public class DNASequence {
    public static int beginIndex(String seq,int n){
        int GCcount = 0;
        int maxCount = 0;
        int index = 0;
        for(int i = 0;i + n < seq.length();i++){
            GCcount = 0;
            for(int j = i;j < i + n;j++){
                if(seq.charAt(j) == 'G' || seq.charAt(j) == 'C'){
                    GCcount++;
                }
            }
            if(GCcount > maxCount){  //若有多个则返回第一个字串，故相等时不改变maxCount
                maxCount = GCcount;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String seq = sc.next();
            int n = sc.nextInt();
            int start = beginIndex(seq,n);
            for(int i = start;i < start + n;i++){
                System.out.print(seq.charAt(i));
            }
            System.out.println();
        }
    }
}
