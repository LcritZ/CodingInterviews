import java.util.Stack;

/**
 * Created by Lcrit_Z on 2017/5/30.
 */
public class GetReverseSentence {
    public static String ReverseSentence(String str) {
        String res = "";
        int len = str.length();
        if (len == 0){
            return res;
        }
        Stack<String> strstack = new Stack<>();
        for (int i = 0;i<len;){
            int start = i;
            int end = i;
            int j = start;
            boolean flag = false;
            for (;j<len;j++){
                if (str.charAt(j) == ' '){
                    flag = true;
                    break;
                }
            }
            end = j;
            i = j+1;
            strstack.push(str.substring(start,end));
            if (flag){
                strstack.push(" ");
            }
        }
        while (!strstack.empty()){
            res += strstack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "i am a student. ";
        System.out.println(ReverseSentence(str));
    }
    
}
