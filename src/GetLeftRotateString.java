/**
 * Created by Lcrit_Z on 2017/5/30.
 */
public class GetLeftRotateString {
    public static String LeftRotateString(String str,int n) {
        String s = "";
        if (str == null||str.length() == 0){
            return s;
        }
        StringBuilder resstr = new StringBuilder(str.substring(n)+str.substring(0,n));
        s = resstr.toString();
        return s;
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("",4));
    }
}
