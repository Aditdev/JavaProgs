class Third_prog {
	public static void main(String[] args) {
	    String s = "13931";
	    char CH, CH2;
	    int i,flag=0;
	    int len = s.length();
	    for (i=0; i< len/2;i++ ){
	        CH = s.charAt(i);
	        CH2 = s.charAt(len - i - 1);
	        if (CH==CH2){
	            flag=1;
	        }
	        else{
	            flag =0;
	            break;
	        }
	    }
	    if (flag ==1){
	        System.out.println(s + " is a pallyndrome");
	    }
	    else
	    {
	        System.out.println(s+" is not a pallyndrome");
	    }
	}
}

