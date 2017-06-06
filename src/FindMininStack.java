/**
 * Created by Lcrit_Z on 2017/5/7.
 */
import java.util.Stack;
import java.util.*;
public class FindMininStack {

    Stack stack ;
    public FindMininStack(){
        stack = new Stack();
    }
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        if (stack.size()==0){
            return;
        }
        stack.pop();
    }

    public int top() {
        return (Integer)stack.peek();
    }

    public int min() {
        int temp = top();
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            int com = (Integer)iterator.next();
            if (temp>=com){
                temp = com;
            }
        }
        return temp;
    }
}