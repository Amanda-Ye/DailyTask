import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BalanceTree {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int gap = leftHeight - rightHeight;
        if(gap >= -1 && gap <= 1){
            return true;
        }else{
            return false;
        }
    }
    //求树的高度
    private static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return Math.max(1 + height(root.left),1 + height(root.right));
    }
}
