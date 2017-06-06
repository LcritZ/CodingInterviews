import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lcrit_Z on 2017/5/22.
 */
public class PermutationofString {
    public static ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0){
            return null;
        }
        char[] seqs = str.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        helper(res,0,seqs);
        Collections.sort(res);
        return res;
    }
    
    public static void helper(ArrayList list, int index , char[] seqs){
        if (index == seqs.length){
            list.add(new String(seqs));
        }
        for (int i = index;i<seqs.length;i++){
            if (i == index || seqs[i]!=seqs[index]){
                swap(seqs,i,index);           
                helper(list , index+1,seqs);
                swap(seqs,i,index);
            }
        }
    }
    
    public static void swap(char[] strs,int i,int j){
        char temp= strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abs";
        ArrayList<String> list = Permutation(str);
        System.out.println(list);
    }
}
