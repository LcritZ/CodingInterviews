/**    
 *  name：ReBuildBinaryTree   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月1日 下午6:34:43 
 *  @version 
 */

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
}
public class ReBuildBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pre = {1,2,4,6,7,3,5,8};
		int [] in = {2,6,4,7,1,3,5,8};
		TreeNode t1 = reConstructBinaryTree(pre, in);
		printTree(t1);
	}
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if (pre.length == 0) {
			return null;
		}
		ArrayList<Integer> preList = new ArrayList<>();
		ArrayList<Integer> inList = new ArrayList<>();
		for (int i = 0; i < pre.length; i++) {
			preList.add(pre[i]);
		}
		for (int i = 0; i < in.length; i++) {
			inList.add(in[i]);
		}
		int len = preList.size();
		TreeNode root = new TreeNode(preList.get(0));
		if (len == 1) {
			root.left = null;
			root.right = null;
			return root;
		}
		int index = inList.indexOf(root.val);
		List<Integer> leftpre = preList.subList(1, index+1);
		List<Integer> rightpre = preList.subList(index+1,len);
		List<Integer> leftin = inList.subList(0, index);
		List<Integer> rightin = inList.subList(index+1,len);
		root.left = reConstructBinaryTree(leftpre, leftin);
		root.right = reConstructBinaryTree(rightpre, rightin);
		return root;
    }
	
	public static TreeNode reConstructBinaryTree(List<Integer> pre,
			List<Integer> in){
		int len = pre.size();
		if (len == 0) {
			return null;
		}
		TreeNode root = new TreeNode(pre.get(0));
		if (len == 1) {
			root.left = null;
			root.right = null;
			return root;
		}
		int index = in.indexOf(root.val);
		List<Integer> leftpre = pre.subList(1, index+1);
		List<Integer> rightpre = pre.subList(index+1,len);
		List<Integer> leftin = in.subList(0, index);
		List<Integer> rightin = in.subList(index+1,len);
		if (index == 0 ) {
			root.left = null;
			root.right = reConstructBinaryTree(rightpre, rightin);
		}else {
			root.left = reConstructBinaryTree(leftpre, leftin);
			root.right = reConstructBinaryTree(rightpre, rightin);
		}
		return root;
	}
	
	public static void printTree(TreeNode treeNode){
		if (treeNode.left!=null) {
			printTree(treeNode.left);
		}
		if (treeNode.right!=null) {
			printTree(treeNode.right);
		}
		if (treeNode!=null) {
			System.out.print(treeNode.val);
		}	
		
	}
}
