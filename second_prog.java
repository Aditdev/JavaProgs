class Tester {
	public static void main(String[] args) {
	    char food_type ='N';
	    int km=3, sum,qty=2,vegPrice = 12,nVegPrice =15;
	    if (km-6 >0)
	     {
	         sum =3;
	         sum += 2*(km-6);
	     }
	     else if (km - 3 >0){
	         sum = km-3;
	     }
	     else if (km >0){
	         sum =0;
	     }
	     else{
	         sum =0;
	     }
	     switch (food_type){
	         case 'V':
	             sum +=vegPrice*qty;
	             break;
	         case 'N': 
	             sum += nVegPrice*qty;
	             break;
	         default:
	             sum =-1;
	     }
	     System.out.println(sum);
	}
}