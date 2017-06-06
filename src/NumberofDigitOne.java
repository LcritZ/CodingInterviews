/**
 * Created by Lcrit_Z on 2017/5/23.
 */
public class NumberofDigitOne {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        while (n>0){
            String num = Integer.toString(n);
            char[] chars = num.toCharArray();
            for (int i = 0;i<num.length();i++){
                if (chars[i] == '1'){
                    count++;
                }
            }
            n--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(12456));
    }
    
}
