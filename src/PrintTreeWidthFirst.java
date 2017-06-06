import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/4/24.
 */
public class PrintTreeWidthFirst {
    public ArrayList<Integer> breadFirst(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode p=root;
        Queue q = new Queue();
        if (p!=null) {
            q.enqueue(p);
            while(!q.isEmpty()){
                p = (TreeNode) q.dequeue();
                list.add(p.val);
                if (p.left!=null) {
                    q.enqueue(p.left);
                }
                if (p.right!=null) {
                    q.enqueue(p.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}


class Queue {
   private java.util.LinkedList list = new java.util.LinkedList();
   public Queue() {
   }
   public void clear() {
       list.clear();
   }
   public boolean isEmpty() {
       return list.isEmpty();
   }
   public Object firstEl() {
       return list.getFirst();
   }
   public Object dequeue() {
       return list.removeFirst();
   }
   public void enqueue(Object el) {
       list.add(el);
   }
   @Override
   public String toString() {
       return list.toString();
   }
}

