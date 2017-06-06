/**    
 *  name：ImplQueueWithStack   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午2:05:44 
 *  @version 
 */

import java.util.Stack;

/**
 *   @date：2017年4月2日 下午2:05:44 
 *  @author Lcrit_Z
 *  description：   
 */
public class ImplQueueWithStack {
	 	Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	        stack2.insertElementAt(node, 0);
	    }
	    
	    public int pop() {
	    	if (stack2.isEmpty()) {
	    		while(!stack1.isEmpty()){
	    			stack2.push(stack1.pop());
	    		}
			}
	    	int top = stack2.pop();
	    	return top;
	    }
	    
	    public static void main(String[] args) {
			ImplQueueWithStack test = new ImplQueueWithStack();
			test.push(3);
			test.push(2);
			test.push(6);
			test.push(8);
			test.push(9);
			test.push(123);
			System.out.println(test.pop());
			System.out.println(test.pop());
			System.out.println(test.pop());
		}
}
