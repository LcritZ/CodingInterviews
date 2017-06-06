import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/29.
 */
public class CountFrequency {
    public static int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        ArrayList<Integer> list = new ArrayList<Integer>(len);
            for (int i:array){
            list.add(i);
        }
        if (list.contains(k)){
            int start = list.indexOf(k);
            int last = list.lastIndexOf(k);
            return last - start+1;
        }else {
            return 0;
        }
        
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,4};
        System.out.println(GetNumberOfK(arr,3));
    }
}
