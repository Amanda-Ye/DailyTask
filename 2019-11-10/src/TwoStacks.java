import java.util.Scanner;
import java.util.Stack;

public class TwoStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int t = stack1.pop();
                stack2.push(t);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoStacks queue = new TwoStacks();
        while(sc.hasNext()){
            int node = sc.nextInt();
            queue.push(node);
        }
        queue.pop();
    }
}