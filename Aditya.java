Class Student
{
int RNo,total,m[];
float per;
String Name = new String(); 
m = new int[5];
void read()   {                                                                             
Scanner sc = new Scanner(System.in);
System.out.println("Name?");
Name = sc.nextLine();
System.out.println("Roll No.?\n");
RNo = sc.nextInt();
total = 0;
for(int i=0;i<5;i++){
System.out.println("Roll No.?\n");
m[i] = sc.nextInt();
total += m[i];
}
per = total/5.0;
}


void display()
{
//System.out.println("Name:" + Name+"Roll No.:"+ RNo+ "Percentage:"+per);
if(per>=70.0)
	System.out.println("Distinction");
else if(per>=60)
	System.out.println("First Class!");
else if(per>=50)
	System.out.println("Second Class!");
else if(per>=40)
	System.out.println("Pass");
else 
	System.out.println("Fail");

}
}

Class Aditya{
	public static void main(String[] args){
		Student s1 = new Student();
		// Student s2 = new Student();
		s1.read();
		s1.display();
}
}


