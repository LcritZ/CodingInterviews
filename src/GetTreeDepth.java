/**
 * Created by Lcrit_Z on 2017/5/29.
 */
public class GetTreeDepth {
    public int TreeDepth(TreeNode root) {
        int depth = 0;
        if (root == null){
            return depth;
        }
        Queue queue = new Queue();
        TreeNode node = root;
        queue.enqueue(node);
        boolean flag = true;
        while(!queue.isEmpty()&&flag){
            node = (TreeNode) queue.dequeue();
            if (node.left!=null||node.right!=null){
                depth++;
            }
            if (node.left!=null) {
                queue.enqueue(node.left);
            }
            if (node.right!=null) {
                queue.enqueue(node.right);
            }
        }
        
        return depth;
    }
    
    public int TreeDepth2(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = TreeDepth2(root.left)+1;
        int rightDepth = TreeDepth2(root.right)+1;
        return leftDepth>rightDepth ? leftDepth : rightDepth;
    }

    public static void main(String[] args) {
        
    }
    
}
