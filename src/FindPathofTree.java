import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/9.
 */
public class FindPathofTree {

    public ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return pathlist;
        list.add(root.val);
        target -= root.val;
        if (target==0&&root.left==null&&root.right==null){
            pathlist.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return pathlist;
    }



}
