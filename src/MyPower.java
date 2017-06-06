/**
 * Created by Lcrit_Z on 2017/5/7.
 */
public class MyPower {
    public double Power(double base, int exponent) {
        boolean flag = false;
        double res = 1.0;
        if (exponent<0){
            flag = true;
            exponent = -exponent;
        }
        if (exponent == 0){
            return  1.0;
        }
        for (;exponent>0;exponent/=2){
            if (exponent%2==1){
                res *= base;
            }
            base *= base;
        }
        if (flag == true) {
            res = 1.0/res;
        }

        return  res;

    }

}
