import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/6/6.
 */
public class FindDuplicatedNumber {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        if (length == 0) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< numbers.length; i++) {
            list.add(numbers[i]);
        }
        for (int i = 0;i < numbers.length; i++) {
            int temp = list.get(i);
            if(list.indexOf(temp) != list.lastIndexOf(temp)) {
                duplication[0] = temp;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,1,2};
        int[] dup = new int[2];
        int len = arr.length;
        System.out.println(duplicate(arr,len,dup));
    }
}
