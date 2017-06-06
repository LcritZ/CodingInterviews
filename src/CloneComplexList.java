import com.sun.xml.internal.ws.api.pipe.NextAction;

/**
 * Created by Lcrit_Z on 2017/5/9.
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

class MyNode extends RandomListNode{      
    

    MyNode(RandomListNode root) {
        super(root.label);
        //label = root.label;
//        if (root.next!=null){
//            this.next =  new RandomListNode(root.next.label);
//        }
//        if (root.random!=null){
//            this.random =  new RandomListNode(root.random.label);
//        }
    }
}


public class CloneComplexList {
    
    public static RandomListNode Clone(RandomListNode pHead){
        if (pHead==null){
            return null;
        }
        MyNode node = new MyNode(pHead);
        MyNode temp = node;
        while (pHead.next!=null){
            temp.next = new MyNode(pHead.next);
            temp.random = new MyNode(pHead.random);
            pHead = pHead.next;            
            temp = (MyNode) temp.next;
        }
        return (RandomListNode)node;
    }
    
    public static RandomListNode clone(RandomListNode pHead){
        if (pHead == null){
            return null;
        }
        RandomListNode head = new RandomListNode(pHead.label);
        RandomListNode res = head;
        if (pHead.random != null){
            head.random = new RandomListNode(pHead.random.label);
        }
        while (pHead.next != null){
            pHead = pHead.next;
            head.next = new RandomListNode(pHead.label);
            if (pHead.random != null){
                head.next.random = new RandomListNode(pHead.random.label);
            }
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        RandomListNode head = new RandomListNode(3);
        head.next = new RandomListNode(5);
        head.random = new RandomListNode(9);
        head.next.next = new RandomListNode(7);
        head.next.random = new RandomListNode(3);
        head.next.next.next = new RandomListNode(9);
        head.next.next.random = new RandomListNode(5);
        RandomListNode node = clone(head);
        while (node.next!=null){
            System.out.println(node.label+","+node.next.label+","+node.random.label);
            node = node.next;
        }
    }
}
