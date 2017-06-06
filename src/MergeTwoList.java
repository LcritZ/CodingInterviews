import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class MergeTwoList {
    public ListNode Merge(ListNode list1,ListNode list2){
        if (list1==null){
            if (list2==null){
                return null;
            }else {
                return list2;
            }
        }
        if (list2 == null){
            return list1;
        }
        ListNode head = new ListNode(3);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ArrayList<Integer> merge = new ArrayList<>();
        int flag1 = 0,flag2 = 0;
        while (temp1.next!=null&&temp2.next!=null){
            if (temp1.val>temp2.val){
                merge.add(temp2.val);
                merge.add(temp1.val);
            }else {
                merge.add(temp1.val);
                merge.add(temp2.val);
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1.next==null){
                flag1 = 1;
            }
            if (temp2.next == null){
                flag2 = 2;
            }
        }
        if (flag1 == 1){
            merge.add(temp1.val);
        }else {
            while (temp1.next!=null){
                merge.add(temp1.val);
                temp1 = temp1.next;
            }
            merge.add(temp1.val);
        }

        if (flag2 == 2){
            merge.add(temp2.val);
        }else {
            while (temp2.next!=null){
                merge.add(temp2.val);
                temp2 = temp2.next;
            }
            merge.add(temp2.val);
        }
        temp1.next = list2;
        int flag = 0;
        for (int i = 0;i<merge.size();i++){
            flag = 0;
            for(int j = 1;j<merge.size()-i;j++){
                int temp = 0;
                if (merge.get(j)<merge.get(j-1)){
                    flag =1;
                    temp = merge.get(j);
                    merge.set(j,merge.get(j+1));
                    merge.set(j-1,temp);
                }
            }
            if (flag == 0){
                break;
            }
        }
        temp1 = list1;
        int k = 0;
        while (temp1.next!=null){
            temp1.val = merge.get(k);
            k++;
            temp1 = temp1.next;
        }
        temp1.val = merge.get(k);
        head = list1;
        return head;
    }
}
