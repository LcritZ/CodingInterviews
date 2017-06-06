/**
 * Created by Lcrit_Z on 2017/5/29.
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 =pHead2;
        while (p1!=p2){
            p1 = (p1==null? pHead2:p1.next);
            p2 = (p2==null? pHead1:p2.next);
        }
        
        return p1;
    }
    
    public ListNode FindFirstCommonNode2(ListNode pHead1,ListNode pHead2){
        if (pHead1==null||pHead2==null){
            return null;
        }
        int len1 =getLen(pHead1);
        int len2 = getLen(pHead2);
        if (len1>len2){
            int differ = len1 - len2;
            while (differ>0){
                pHead1 = pHead1.next;
                differ--;
            }
        }else {
            int differ = len2 - len1;
            while (differ>0){
                pHead2 = pHead2.next;
                differ--;
            }
        }
        while (pHead1!=null){
            if (pHead1 == pHead2){
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
    
    public int getLen(ListNode node){
        int len = 0;
        while (node!=null){
            node = node.next;
            len++;
        }
        return len;
    }
    
}
