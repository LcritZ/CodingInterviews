import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lcrit_Z on 2017/5/22.
 */
public class FindLeastNNums {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k>input.length){
            return list;
        }
        for (int i = 0;i<input.length;i++){
            list.add(input[i]);
        }
        Collections.sort(list);
        ArrayList<Integer> res = new ArrayList<>(list.subList(0,k)) ; 
        return res;
    }

    public static void main(String[] args) {
        int[] input = {1,4,2,3,6,4};
        System.out.println(GetLeastNumbers_Solution(input,3));
    }
}
