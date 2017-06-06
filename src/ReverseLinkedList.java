import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class ReverseLinkedList {
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode temp = head;
        while (temp.next!=null){
            arrayList.add(temp.val);
            temp = temp.next;
        }
        arrayList.add(temp.val);
        int i = arrayList.size()-1;
        ListNode h = head;
        while (h.next!=null){
            h.val = arrayList.get(i);
            i--;
            h = h.next;
        }
        h.val = arrayList.get(0);
        return head;
    }
}
