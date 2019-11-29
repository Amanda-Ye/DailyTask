import java.util.*;

public class MostDifficultProblem {
    public static void decrypt(char[] cip){
        System.out.println(cip.length);
        for(int i = 0;i < cip.length;i++){
            char c = cip[i];
            if(c == ' '){
                System.out.print(c);
            }else{
                char t = c > 'E' ? (char)(c - 5) : (char)(c + 21);
                System.out.print(t);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String ciphertext = in.nextLine();  //切记要用nextLine(); next()不接收空格
            char[] arr = ciphertext.toCharArray();
            decrypt(arr);
        }
    }
}

