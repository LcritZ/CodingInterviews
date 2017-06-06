/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class IsSubTree {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean  flag = false;
        if (root1==null){
            //System.out.println("1");
            return false;
        }
        if (root2==null){
            //System.out.println("1");
            return false;
        }
        TreeNode temp1 = root1;
        TreeNode temp2 = root2;
        boolean res = judgeNode(temp1,temp2);
        if (res){
            flag = true;
        }
        if (!flag){
            flag = HasSubtree(temp1.left,temp2);
            if (!flag){
                flag = HasSubtree(temp1.right,temp2);
            }
        }
        return flag;
    }
    public static boolean judgeNode(TreeNode t1,TreeNode t2){
        if (t2==null) return true;
        if (t1==null) return false;
        boolean flag = false;
        if (t1.val == t2 .val){
            return judgeNode(t1.left,t2.left)&&judgeNode(t1.right,t2.right);
        }else {
            return false;
        }
    }
}
