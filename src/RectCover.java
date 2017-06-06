/**    
 *  name：RectCover   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午7:29:19 
 *  @version 
 */

/**
 *   @date：2017年4月2日 下午7:29:19 
 *  @author Lcrit_Z
 *  description：   
 */
public class RectCover {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RectCover(4));
	}
    public static int RectCover(int target) {
		if (target==1) {
			return 1;
		}
		int f1 =1,f2 = 1;
		if (target>1) {
			while(target>1){
				f2 = f1+f2;
				f1 = f2-f1;
				target -- ;
			}
		}
		return f2;
    }
}
