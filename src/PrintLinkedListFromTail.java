/**    
 *  name：PrintTreeFromTail   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月1日 下午12:17:06 
 *  @version 
 */

import java.util.ArrayList;

/**
 *   @date：2017年4月1日 下午12:17:06 
 *  @author Lcrit_Z
 *  description：   
 */

class ListNode {
        int val;
       ListNode next = null;

      ListNode(int val) {
         this.val = val;
     }
   }
public class PrintLinkedListFromTail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			ListNode l1 = new ListNode(3);
			l1.next = new ListNode(4);
			l1.next.next = new ListNode(5);
			System.out.println(printListFromTailToHead(l1));
		}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
			
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        if (listNode==null) {
				return list;
			}
	        ListNode temp = listNode;
	        while(listNode.next!= null){
	        	list.add(listNode.val);
	        	listNode = listNode.next;
	        }
	        list.add(listNode.val);
	        int len = list.size();
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        while(len>0){
	        	res.add(list.get(len-1));
	        	len--;
	        }
	        return res;
		}
}
