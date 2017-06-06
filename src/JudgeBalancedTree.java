/**
 * Created by Lcrit_Z on 2017/5/29.
 */
public class JudgeBalancedTree {
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        boolean flag = true;
        flag = DepthDifferofChild(root.left,root.right);
        if (!flag){
            return flag;                        //如果是假，立即返回
        }
        flag = IsBalanced_Solution(root.left);    //递归判断左子树
        if (!flag){
            return flag;
        }
        flag = IsBalanced_Solution(root.right);  //递归判断右子树
        if (!flag){
            return flag;
        }
        return flag;
    }

    public static int TreeDepth2(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = TreeDepth2(root.left)+1;
        int rightDepth = TreeDepth2(root.right)+1;
        return leftDepth>rightDepth ? leftDepth : rightDepth;
    }
    
    public static boolean DepthDifferofChild(TreeNode left,TreeNode right){
        int leftDepth = TreeDepth2(left);
        int rightDepth = TreeDepth2(right);
        int differ = 0;
        differ = leftDepth - rightDepth;
        return Math.abs(differ)>1 ? false: true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        //root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        //root.right.left = new TreeNode(4);
        //root.right.right = new TreeNode(4);
        System.out.println(IsBalanced_Solution(root));
    }
    
    
}
