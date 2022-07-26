// InfyTQ first Program.
import java.util.*;

class Tester {
	public static void main(String[] args) {
	    int start =1, pval,i;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many Terms:\n");
	    pval = sc.nextInt();
	    for (i=0;i<pval ;i++){   
	        System.out.print(start + " ");
	        start *= 2;
	    } 
	    
	}
}