import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class DeleteSameChar1 {
    private static String deleteSame(String s1, String s2){
        if(s2 == null){
            return s1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s2.length();i++){
            int count = map.getOrDefault(s2.charAt(i),0);
            map.put(s2.charAt(i),count + 1);
        }
        StringBuilder ret = new StringBuilder();
        for(int i = 0;i < s1.length();i++){
            int count = map.getOrDefault(s1.charAt(i),0);
            if(count == 0){
                ret.append(s1.charAt(i));
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String s1 = "They are students";
        String s2 = "aeiou";
        String ret = deleteSame(s1,s2);
        System.out.println(ret);
    }
}

