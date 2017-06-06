import java.util.*;

/**
 * Created by Lcrit_Z on 2017/5/8.
 */
public class VerifyPostOrderofBST {
    public static  boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length<1){
            return false;
        }
        return judgeSub(sequence,0,sequence.length-1);
    }

    public static boolean judgeSub(int[] seq,int start,int end){
        if (start>=end) return true;
        int i = end-1;
        while (seq[i]>seq[end]){
            i--;
            if (i==0){
                return true;
            }
        }
        int j = i;
        while (j>=start){
            if (seq[j]>seq[end]){
                return false;
            }
            j--;
        }
        return judgeSub(seq,start,i)&&judgeSub(seq,i+1,end-1);
    }

    public static void main(String[] args) {
        int []seq = {5,4,3,2,1};
        System.out.println(VerifySquenceOfBST(seq));
    }

}
