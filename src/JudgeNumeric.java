/**
 * Created by Lcrit_Z on 2017/6/7.
 */
public class JudgeNumeric {
    public static boolean isNumeric(char[] str) {
        int len = str.length;
        if (len == 0) {
            return false;
        }
        boolean flag = false;
        String numstring = new String(str);
        if (str[0] == '+') {
            if (len == 1) {
                return false;
            }
            numstring = numstring.substring(1);
        }
        if (str[0] == '-') {
            if (len == 1) {
                return false;
            }
            numstring = numstring.substring(1);
        }
        
        if (numstring.lastIndexOf('e') == (numstring.length()-1)) {
            return false;
        }
        System.out.println(numstring.contains("e")+"..");
        if (numstring.contains("e")||numstring.contains("E")) {
            if (numstring.matches("[0-9]*\\.?[0-9]*[e,E]?['+','\\-']?[0-9]*")){
                flag = true;
            }else {
                flag = false;
            }
        }else {
            if (numstring.matches("[0-9]*\\.?[0-9]*")) {
                flag = true;
            }else {
                flag = false;
            }
        }
        
        return flag;
    }

    public static void main(String[] args) {
        char[] str = {'1','+','2','3'};
        System.out.println(isNumeric(str));
    }
    
}
