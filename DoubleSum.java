/*
This Prints 1+1/2+1/3+1/4+.....1/n in double.
*/
import java.util.*;

class DoubleSum {

    public static double findHPSum(int num) {
        if(num>1) return((double)1/num +findHPSum(num-1));
    return num;
        
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println(findHPSum(n));
    }
}