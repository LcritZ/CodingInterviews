/**    
 *  name：Fobinacci   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午4:50:43 
 *  @version 
 */


public class Fobinacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++){
			System.out.println(Fibonacci(i));
		}
	}
	
	 public static int Fibonacci(int n) {
//		 if (n<=1) {  //递归的解法由于可能是一个很大的数，所以可能会stack overflow
//			return 1;
//		}else {
//			return Fibonacci(n-1)+Fibonacci(n-2);
//		}
		//继而采用迭代的想法，迭代的意思是通过一个循环，在循环里面进行迭代，实现从0计算到n
		 if (n == 0) {
			return 0;
		}
		 if (n<3) {
			return 1;
		}
		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		while(n>2){
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			n--;
		}
		return f3;
	 }
	
}
