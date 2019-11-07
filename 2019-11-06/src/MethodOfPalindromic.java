import java.util.Scanner;

public class MethodOfPalindromic {
    private static int count = 0;
    public static int methods(String s1,String s2){
        for(int i = 0;i < s1.length() + 1;i++){
            String s = s1.substring(0,i) + s2 + s1.substring(i,s1.length());
            StringBuffer str = new StringBuffer(s);
            if(str.reverse().toString().equals(s)){
                count++;
            }
            /*
            if(isPalindromic(s)){
                count++;
            }
            */
        }
        return count;
    }

    /*
    private static boolean isPalindromic(String s) {
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            if(array[left] == array[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串1：");
        String s1 = scanner.next();
        System.out.println("请输入字符串2：");
        String s2 = scanner.next();
        System.out.println(methods(s1,s2));
    }
}
