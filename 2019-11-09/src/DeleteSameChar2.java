import java.util.*;

public class DeleteSameChar2 {
    private static String deleteSame(String s1,String s2){
        int[] hash = new int[256];
        for(int i = 0;i < s2.length();i++){
            hash[s2.charAt(i)]++;
        }
        String ret = "";
        for(int i = 0;i < s1.length();i++){
            if(hash[s1.charAt(i)] == 0){
                ret += s1.charAt(i);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String ret = deleteSame(s1,s2);
            System.out.println(ret);
        }
    }
}
