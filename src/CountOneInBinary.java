/**    
 *  name：CountOneInBinary   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午7:35:58 
 *  @version 
 */

import java.util.ArrayList;

/**
 *   @date：2017年4月2日 下午7:35:58 
 *  @author Lcrit_Z
 *  description：   
 */
public class CountOneInBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(-23));
		System.out.println(Integer.bitCount(-23));
	}
    public static int NumberOf1(int n) {
    	boolean flag = false;
    	boolean isodd = false;
    	if (n%2==0) {
			isodd = true;
		}
    	int num = n;
    	if (n<0) {
    		flag = true;
			n = -n;
		}
    	
    	int countone = 0;
    	int countzero = 0;
    	while(n>0){    		
    		if (n%2==1) {
    			countone++;				
			}else {
				countzero++;
			}    		
    		n = n/2;
    	}
    	if (flag==true) {
    		if (num == Integer.MIN_VALUE) {
				return 1;
			}else if(isodd==false){
				int sum = 32-(countone+countzero);
				return ++countzero+sum;
			}else {
				int sum = 32-(countone+countzero);
				return countzero+sum;
			}
    		
		}else {
			return countone;
		}
    }
}
