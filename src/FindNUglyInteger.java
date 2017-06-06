/**
 * Created by Lcrit_Z on 2017/5/23.
 */
public class FindNUglyInteger {
    public static int GetUglyNumber_Solution(int index) {
        if (index == 0){
            return 0;
        }
        int[] res = new int[index];
        int count = 0;
        int sec = 0;
        int thr = 0;
        int fiv = 0;
        int temp = 0;
        res[0] = 1;
        while (count < index-1){
            temp = min(res[sec]*2,res[thr]*3,res[fiv]*5);
            System.out.println();
            System.out.println(temp);
            for(int i = 0;i<3;i++){
                System.out.print(res[i]+" ,");
            }
            if (temp == res[sec]*2) sec++;
            if (temp == res[thr]*3) thr++;
            if (temp == res[fiv]*5) fiv++;
            res[++count] = temp;
        }
        
        return res[index-1];
        
    }
    
    public static int min(int x,int y,int z){
        int res = Math.min(x,y);
        res = Math.min(res,z);
        return res;
    }

    public static void main(String[] args) {
        //for (int i = 1;i<10;i++){
            System.out.println(GetUglyNumber_Solution(4)+",");
        //}
    }
    
}
