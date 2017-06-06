/**    
 *  name：ReplaceString   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月1日 上午11:22:31 
 *  @version 
 */

/**
 *   @date：2017年4月1日 上午11:22:31 
 *  @author Lcrit_Z
 *  description：   
 */
public class ReplaceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(replaceSpace(s2));
	}
	 public static String replaceSpace(StringBuffer str) {
	    	if (str.length()==0) {
				return null;
			}
	    	String s1 = str.toString();	    	
	    	s1 = s1.replaceAll(" ", "%20");
	    	return s1;
	    }
}
