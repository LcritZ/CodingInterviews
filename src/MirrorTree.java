/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class MirrorTree {
    public void Mirror(TreeNode root) {
        TreeNode temp ;
        if (root!=null){
            temp = root.right;
            root.right = root.left;
            root.left = temp;
            Mirror(root.left);
            Mirror(root.right);
        }

    }
}
