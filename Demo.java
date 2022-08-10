import java.util.Scanner;

Class Demo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a[],i,j,temp;
		a = new int[5];
		for(i=0;i<5;i++)
			a[i]= scan.nextInt();
		System.out.print("The unsorted array is\n ");
		for(i=0;i<5;i++)
			System.out.print(a[i]+" ");
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
				{
				if(a[i]>a[j])
					{
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}//if ends
			}//forj ends
		}//fori end

		System.out.print("The sorted array is\n ");		
		for(i=0;i<5;i++)
			System.out.print(a[i]+" ");
		
	} // Main ends
}//Demo ends