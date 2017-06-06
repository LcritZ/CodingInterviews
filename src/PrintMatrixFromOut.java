import java.util.ArrayList;

/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class PrintMatrixFromOut {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix.length == 0){
            return new ArrayList<>(0);
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int size = row*col;
        ArrayList<Integer> list = new ArrayList<>(size);
        int m = row,n = col;
        int x = 0,y = 0;
        for(int i  =0 ;i<size;){
            //向左
            for (int j = y,l = 1;l<=n;l++,j++){
                i++;
                list.add(matrix[x][j]);
                System.out.print(matrix[x][j]+" ");
                y = j;
            }
            if (i==size){
                break;
            }
            x++;
            m--;
            System.out.println("now:x:"+x+"y: "+y);
            //向下
            for (int k = x,l = 1; l<=m; l++,k++){
                i++;
                list.add(matrix[k][y]);
                System.out.print(matrix[k][y]+" ");
                x = k;
            }
            if (i==size){
                break;
            }
            y--;
            n--;
            System.out.println("now:x:"+x+"y: "+y+"N:"+n);
            //向右
            for (int q = y,l = 1;l<=n;l++,q--){
                i++;
                list.add(matrix[x][q]);
                System.out.print(matrix[x][q]+" ");
                y = q;
            }
            if (i==size){
                break;
            }
            x--;
            m--;
            //向上
            System.out.println("now:x:"+x+"y: "+y);
            for (int t =x, l=1;l<=m;l++,t--){
                i++;
                list.add(matrix[t][y]);
                System.out.print(matrix[t][y]+" ");
                x = t;
            }
            if (i==size){
                break;
            }
            y++;
            n--;
        }

        return list;
    }
}
