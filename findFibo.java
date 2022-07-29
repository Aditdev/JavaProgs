import java.util.*;

class findFibo {
    
    public static int findFibonacci(int n) {
        if (n==1) return 0;
        else if (n==2) return 1;
        return (findFibonacci(n-2)+findFibonacci(n-1));
        
    }

    public static void main(String args[]) {
        int n ;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n!=0)
            System.out.println(findFibonacci(n));
        else
            System.out.println("Please enter a valid value for n");
    }
}
