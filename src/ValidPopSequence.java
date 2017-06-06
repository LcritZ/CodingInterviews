import java.util.Stack;

/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class ValidPopSequence {
    public boolean IsPopOrder(int [] pushA,int [] popA){
        Stack<Integer> pushStack = new Stack();
        int count = 0;
        for (int i = 0;i<popA.length;i++){
            while(!pushStack.contains((Integer)popA[i])){
                pushStack.push(pushA[count]);
                if (pushA[count]==popA[i]){
                    count++;
                    break;
                }
                count++;
                if (count==pushA.length){
                    break;
                }
            }
            if (pushStack.pop()!=popA[i]){
                return false;
            }

        }
        return true;
    }
}
