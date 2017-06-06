import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Lcrit_Z on 2017/6/2.
 */
public class JudgeContinuous {
    public static boolean isContinuous(int [] numbers) {
        if (numbers.length == 0){
            return false;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i:numbers){
            list.add(i);
        }
        while (list.contains((Integer)0)) {
            list.remove((Integer)0);
        }
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if ((list.indexOf(index)-list.lastIndexOf(index)) != 0) {
                return false;
            }
        }

        int count = 5-list.size();
        if (count == 5) {
            return true;
        }
        int[] arr = new int[list.size()];
        Iterator iterator = list.iterator();
        HashSet<Integer> hashSet = new HashSet<>();
        while (iterator.hasNext()) {
            hashSet.add((Integer)iterator.next());
        }
        int i = 0;
        Iterator iteratorset = hashSet.iterator();
        while (iteratorset.hasNext()) {
            arr[i] = (Integer)iteratorset.next();
            i++;
        }
        for (int j = 1; j < arr.length; j++) {
            if (count < 0) {
                return false;
            }
            count -= (arr[j]-arr[j-1] -1);
        }
        if (count < 0){
            return false;
        }
        return true;
    }

    public static boolean judgeContious(int[] arr, int count){
        return false;
    }
    
    public static void main(String[] args) {
        int [] arr = {0,0,0,6,1};
        System.out.println(isContinuous(arr));
    }
}
