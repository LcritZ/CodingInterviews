/**    
 *  name：JumpFloorII   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午6:52:33 
 *  @version 
 */

/**
 *   @date：2017年4月2日 下午6:52:33 
 *  @author Lcrit_Z
 *  description：   
 */
public class JumpFloorII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloorII(3));
	}
    public static int JumpFloorII(int target) { //还是根据数学归纳法，得到f(n)与f(n-1)的关系，
        if (target==0) {						//即f(n)=f(n-1)*2,而f(1)==1;f(2)==2;
			return 0;							//所以f(n) = 2^(n-1);	
		}
        if (target == 1) {
			return 1;
		}
        int f2 = 1;
        if (target>1) {
			while(target>1){
				f2 = f2*2;
				target--;
			}
		}
        return f2;
    }
}
