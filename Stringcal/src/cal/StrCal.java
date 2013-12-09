package cal;

public class StrCal 
{
   
	public int add(String str)
	 {
		int i,sum=0;
		sum=sum+str.charAt(0)-48;
		sum=sum+str.charAt(1)-48;
		sum=sum+str.charAt(2)-48;
		 System.out.println( sum);
		/*
	    for(i=0;i<str.length();i++) 
	     { 	
	    	if((str.charAt(i)-48)>=0 || (str.charAt(i)-48)<=9 )
	    	   sum=sum+str.charAt(i)-48;
	        
	        System.out.println( sum);
	      
	     }
	    
	  }
    */
		 return sum;
	 }		 
	  
	
}
