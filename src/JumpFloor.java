/**    
 *  name：JumpFloor   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午6:28:51 
 *  @version 
 */


public class JumpFloor {
	static int type = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloor(4));
	}
    public static int JumpFloor(int target) { //可以通过f(n) = f(n-1) +f(n-2)发现这
    	if (target<0) {
			return -1;
		}							//是一个斐波那契数列从而得出结论
    	if (target == 0) {
			return 0;
		}
    	if (target<2) {
			return 1;
		}
    	int f1 = 1,f2 = 1,f3 = 0;
    	while(target>=2){
    		f3 = f1+f2;
    		f1 = f2;
    		f2 = f3;
    		target--;
    	}
    	return f3;
    }
}
