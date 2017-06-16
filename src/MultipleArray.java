/**
 * Created by Lcrit_Z on 2017/6/7.
 */
public class MultipleArray {
    public static int[] multiply(int[] A) {
        if (A.length == 0) {
            return A;
        }
        int[] res = new int[A.length];
        res[0] = 1;
        for (int i = 1; i < A.length; i ++) {
            res[i] = res[i-1] * A[i-1];
        }
        int temp = 1;
        for (int j = A.length-2; j >= 0; j--) {
            temp *= A[j+1];
            res[j] *= temp; 
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] res = multiply(A);
        for (int i: res) {
            System.out.print(i+",");
        }
    }
    
}
