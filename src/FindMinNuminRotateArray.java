/**    
 *  name：FindMinNuminRotateArray   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月2日 下午4:12:15 
 *  @version 
 */


public class FindMinNuminRotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,6,1,2,2,3};
		System.out.println(minNumberInRotateArray(arr));
	}
	
	public static int minNumberInRotateArray(int [] array) {
//			int size = array.length;
//			if (size== 0) {
//				return 0;
//			}else if(size == 1) {
//				return array[0];
//			}
//	    	if (array[size-1]<=array[size-2]) {
//				return array[size-1];
//			}
//	    	int min  = array[1];
//	    	for(int i = 1;i<size-1;i++){
//	    		if (array[i] >= array[i+1]) {
//	    			if (array[i+1]<=min) {
//						min = array[i+1];
//					}
//					
//				}
//	    	}
//	    	return min;
		int low = 0 ; int high = array.length - 1;
		while(low < high){
		int mid = low + (high - low) / 2;
		if(array[mid] > array[high]){
			low = mid + 1;
		}else if(array[mid] == array[high]){
			high = high - 1;
		}else{
			high = mid;
		}
		}
		return array[low];
	}
}
