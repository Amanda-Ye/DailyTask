import java.util.LinkedList;

//二叉树的镜像
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeMirror {
    public void Mirror(TreeNode root) {    //通过所有测试用例
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public void mirror(TreeNode root){
        if(root == null){
            return;
        }
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        while(!list.isEmpty()){
            root = list.removeFirst();
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null){
                list.add(root.left);
            }
            if(root.right != null){
                list.add(root.right);
            }
        }
    }
}
