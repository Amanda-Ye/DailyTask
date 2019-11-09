import java.util.Map;
import java.util.TreeMap;

//在一行内输出 str 中连续最长的数字串
public class LongestString {
    public static void longest(String s) {     //不能通过所有测试用例，方法有待考证
        int max = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    index = i;
                }
            } else {
                count = 0;
            }
        }
        for (int i = index - max + 1; i <= index; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "1234s2345s3456";
        longest(s);
    }
}
