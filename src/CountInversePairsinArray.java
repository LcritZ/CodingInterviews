/**
 * Created by Lcrit_Z on 2017/5/23.
 */
public class CountInversePairsinArray {
    public static int InversePairs(int [] array) {  //这是O(n)的解法，遍历两层数组，每次遍历得到下标为i时比后面数大的情况
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i; j<array.length; j++){
                if (array[i]>array[j]){
                    count++;
                }
            }
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,1,2};
        System.out.println(InversePairs(arr));
    }
    
}
