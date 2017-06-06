
/**
 * Created by Lcrit_Z on 2017/6/6.
 */
public class GetSumofOnetoN {
    public static int Sum_Solution(int n) {
        int sum = (int)(Math.pow(n,2)+n);
        return sum>>1;
    }

    public static int Sum_Solution2(int n) {
        int sum = n;
        boolean flag = (sum>0) && ((sum += Sum_Solution2(n-1))>0);
        return sum;
    }
    
    
    public static void main(String[] args) {
        System.out.println(Sum_Solution2(5));
    }
}
