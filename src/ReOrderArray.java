import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class ReOrderArray {
    public void reOrderArray(int [] array){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 1){
                odd.add(array[i]);
            }else {
                even.add(array[i]);
            }
        }
        odd.addAll(even);
        for (int i = 0;i<array.length;i++){
            array[i] = odd.get(i);
        }
    }
}
