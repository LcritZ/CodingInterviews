import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Lcrit_Z on 2017/5/29.
 */
public class FindTwoNumOnceinArray {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0;i<array.length;i++){
            list.add(array[i]);
        }
        ArrayList res = new ArrayList(0);
        int pos = 0;
        while (true){
            int first = list.get(pos);
            if (pos!=list.lastIndexOf(first)){
                list.remove(pos);
                list.remove((Integer) first);
                continue;
            }else {
                pos++;
                res.add(first);
            }
            if (res.size()==2){
                break;
            }
        }
        num1[0] = (Integer)res.get(0);
        num2[0] = (Integer)res.get(1);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,5,4,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(arr,num1,num2);
        System.out.println("--------");
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
