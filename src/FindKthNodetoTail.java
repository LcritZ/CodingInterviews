/**
 * Created by Lcrit_Z on 2017/5/7.
 */

public class FindKthNodetoTail {
    public  ListNode FindKthToTail(ListNode head,int k) {
        if (head==null){
            return null;
        }
        ListNode temp = new ListNode(1);
        ListNode h = head;
        ListNode tail;
        ListNode pointer = head;
        int count = 1;
        while(pointer.next!=null){
            count++;
            pointer = pointer.next;
        }
        tail = pointer;
        if (k>count||k<0){
            return null;
        }
        pointer = h;
        int c = 1;

        while (c<(count-k+1)){
            pointer = pointer.next;
            c++;
        }
        temp = pointer;
        return temp;
    }
}
