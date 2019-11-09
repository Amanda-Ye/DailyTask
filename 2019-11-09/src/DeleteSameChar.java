import java.util.HashSet;
import java.util.Set;
//import java.util.Scanner;

public class DeleteSameChar {
    private static String deleteSame(String s1, String s2){
        if(s2 == null){
            return s1;
        }
        Set<Character> set = new HashSet<>();
        StringBuilder ret = new StringBuilder();
        for(int i = 0;i < s2.length();i++){
                set.add(s2.charAt(i));
        }
        for(int i = 0;i < s1.length();i++){
            if(!set.contains(s1.charAt(i))){
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
