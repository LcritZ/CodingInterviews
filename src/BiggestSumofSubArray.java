/**
 * Created by Lcrit_Z on 2017/5/22.
 */

public class BiggestSumofSubArray {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            int tsum = array[i];
            int temp = 0;
            for (int j = i;j<array.length;j++){
                temp += array[j];
                if (tsum<=temp){
                    tsum = temp;
                }
            }
            if (sum<=tsum){
                sum = tsum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,-2,-5};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }

}


