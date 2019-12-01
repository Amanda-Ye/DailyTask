import java.util.*;

//字符集合：输出字符串中的字母，重复出现并靠后的不输出
public class CharSet {
    public static void charSet(String str){
        String chars = "";
        for(int i = 0;i < str.length();i++){
            if(!chars.contains(str.substring(i,i + 1))){
                chars += str.charAt(i);
            }
        }
        System.out.println(chars);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.next();
            charSet(str);
        }
    }
}
