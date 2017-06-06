import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/30.
 */
public class FindContinueSequenceSum100 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int k = new Double(Math.sqrt(2*sum)).intValue()+1;
        System.out.println("k:"+k);
        int start = 1;
        while (k>=2){
            int mid = sum/k;
            start = mid - (k-1)/2;
            start = (start>0?start:1);
            if (isSum100(k,start,sum)){
                ArrayList<Integer> list = new ArrayList<Integer>();
                int len = k;
                for (int i = start;len>0;i++,len--){
                    list.add(i);
                }
                res.add(list);
            }
            k--;
        }
        return res;
    }
    
    public static boolean isSum100(int k,int start,int s){
        int sum = 0;
        while (k>0){
            sum += start;
            start++;
            k--;
        }
        if (sum == s){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(300));
    }
    
}
