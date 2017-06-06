import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Lcrit_Z on 2017/5/23.
 */
public class MinSplicedNumfromArray {
    public static String PrintMinNumber(int [] numbers) {
        String res = "";
        String [] strings = new String[numbers.length];
        for (int i = 0;i<numbers.length ; i++){
            strings[i] = Integer.toString(numbers[i]);
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s1.compareTo(s2);
            }
        });
        for (String str:list){
            res += str;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {32,3,4,14};
        System.out.println(PrintMinNumber(arr));
    }
    
}
