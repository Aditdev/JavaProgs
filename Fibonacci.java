class Fibonacci{
	public static void main(String args[]){
	int a = 0,b = 1,c,n,i;
	n = Integer.parseInt(args[0]);
	System.out.print(a+" "+b);
	for(i=2;i<n;i++)
		{
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}
/*
java Fibonacci 5
0 1 1 2 3
*/
