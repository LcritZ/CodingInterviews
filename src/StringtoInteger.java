/**
 * Created by Lcrit_Z on 2017/6/6.
 */
public class StringtoInteger {
    public static int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        boolean flag = true; 
        
        if (str.charAt(0) == '+'  ) {
            if (str.length() == 1) {
                return 0;
            }
            str = str.substring(1);
            flag = true;
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            flag = false;
        }
        int len = str.length();
        if (len == 0) {
            return 0;
        }
        if (!str.matches("[0-9]{"+len+"}")) {
            return 0;
        }
        if (flag) {
            return Integer.valueOf(str);
        }else {
            if(str.equals("2147483648")){
                return -2147483648;
            }else {
                return -Integer.valueOf(str);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("+"));
    }
}
