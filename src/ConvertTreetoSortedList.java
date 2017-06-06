/**
 * Created by Lcrit_Z on 2017/5/22.
 */
public class ConvertTreetoSortedList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){  //root 为空则返回空
            return null;
        }
        if (pRootOfTree.left == null&&pRootOfTree.right == null){
            return pRootOfTree;  //左右子树为空则返回root
        }
        TreeNode left = Convert(pRootOfTree.left); //递归调用自身，最后一个为左链表的头节点，即最小的那个
        TreeNode mid = left;
        while (mid != null && mid.right !=null){
            mid = mid.right;   //找到左链表的最后节点
        }
        if (left != null){
            mid.right = pRootOfTree;  //将根节点加入链表
            pRootOfTree.left = mid;
        }
        TreeNode right = Convert(pRootOfTree.right);  //找到右子树最小的节点即头节点
        if (right != null ){
            pRootOfTree.right = right;      //加入右链表
            right.left = pRootOfTree;
        }
        return left != null ? left:pRootOfTree;
    }
}
