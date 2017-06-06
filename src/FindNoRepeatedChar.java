/**
 * Created by Lcrit_Z on 2017/5/23.
 */
public class FindNoRepeatedChar {
    public static int FirstNotRepeatingChar(String str) {
        if (str == ""){
            return -1;
        }
        if (str == null){
            return -1;
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                continue;
            }
            if (str.lastIndexOf(str.substring(i,i+1)) == i){
                return i;
            }else {
                str = str.replace(str.charAt(i),' ');
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("asffdagesfe"));
    }
    
}
