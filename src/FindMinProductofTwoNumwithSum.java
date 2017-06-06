import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/30.
 */
public class FindMinProductofTwoNumwithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array.length == 0){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>(array.length);
        for (int i = 0;i<array.length;i++){
            list.add(array[i]);
        }
        ArrayList<Integer> res = new ArrayList(2);
        int s = sum;
        int k = array[0];
        while (s>0){
            if (list.contains(s)&&list.contains(sum-s)){
                res.add(sum-s);
                res.add(s);
                break;
            }
            s--;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {};
        System.out.println(FindNumbersWithSum(arr,7));
    }
}
