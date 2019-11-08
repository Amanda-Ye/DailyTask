//import java.util.Scanner;

//在一行内输出 str 中连续最长的数字串
public class LongestString {
    public static void longest(String s) {
        char[] a = s.toCharArray();
        int max = 0;
        int count = 0;
        int index = 0;
        String r = "";
        for(int i = 0;i < a.length;i++){
            if((a[i] >= '0') && (a[i] <= '9')){
                count++;
                if(max < count){
                    max = count;
                    index = i;
                }
            }else{
                count = 0;
            }
        }
        for(int i = index - max + 1;i <= index;i++){
            r += a[i];
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        String s = "abcd12345ed125ss123456789";
        longest(s);
    }
}
