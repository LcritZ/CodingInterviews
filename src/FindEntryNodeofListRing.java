/**
 * Created by Lcrit_Z on 2017/6/11.
 */
public class FindEntryNodeofListRing {
    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode entry = null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (slow != null && fast.next!= null ) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        
        if (slow == null || fast.next == null) {
            return entry;
        }
        ListNode h = pHead;
        while (true) {
            if (h.val == fast.val) {
                break;
            }
            h = h.next;
            fast = fast.next;
         }
        entry = h;
        return entry;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(2);
        //ListNode l6 = new ListNode();
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l3;
        System.out.println(EntryNodeOfLoop(l1).val);
    }
}
