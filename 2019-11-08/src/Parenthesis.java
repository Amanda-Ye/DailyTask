import java.util.Stack;

public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < A.length();i++) {
            if(A.charAt(i) == '('){
                stack.push('(');
            }else if(A.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(chkParenthesis(s,s.length()));
    }
}