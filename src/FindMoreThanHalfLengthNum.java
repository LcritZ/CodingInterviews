import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Lcrit_Z on 2017/5/22.
 */
public class FindMoreThanHalfLengthNum {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array.length==1){
            return array[0];
        }
        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<Integer>(array.length);
        for (int i = 0;i<array.length;i++){
            list.add(array[i]);
        }
        int len = array.length/2;
        int pos = 0;
        while(pos<len){
            if ((list.lastIndexOf(array[pos])-pos)>len-1){
                return array[pos];
            }else {
                pos = list.lastIndexOf(array[pos])+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
    
}
