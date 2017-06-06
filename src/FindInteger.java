/**    
 *  name：FindInteger   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月30日 下午8:25:34 
 *  @version 
 */

/**
 *   @date：2017年3月30日 下午8:25:34 
 *  @author Lcrit_Z
 *  description：   
 */
public class FindInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		boolean res = Find(7, array);
		System.out.println(res);
	}
	
	
	public static boolean Find(int target, int [][] array) {
		if (array.length==0) {
			return false;
		}
		for(int i = 0;i<array.length;i++){
			int low = 0;
			int high = array[i].length-1;
			if (high == 0) {
				continue;
			}
			while(low<=high){
				int mid = (low+high)/2 ;
				if (target == array[i][mid]) {
					return true;
				}else if (target<array[i][mid]) {
					high = mid -1;
				}else {
					low = mid+1;
				}
			}
		}
		
		return false;
		
	}

}


