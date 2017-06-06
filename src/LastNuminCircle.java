import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/6/6.
 */
public class LastNuminCircle {
    public static int LastRemaining_Solution(int n, int m) {
        if (n == 0) {
            return -1;
        }
        int res = -1;
        ArrayList list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count++;
            if (count == m ) {
                list.remove(i);
                count = 0;
                i--;
            }
            if (list.size() == 1) {
                break;
            }
            
            if (i == list.size()-1) {
                i = -1;
            }
            
        }
        res = (Integer)list.get(0);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(10,10));
    }
    
}
