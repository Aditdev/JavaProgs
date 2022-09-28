class Factorial{
	public static void main(String args[]){
		int n, i, fact=1;
		n = Integer.parseInt(args[0]);
		for(i=2;i<=n;i++){
		fact *= i;
		}
		System.out.println("The Factorial of "+n+" = "+fact);
	}

}
