package cal;

public class StrCal 
{
   
	public int add(String str)
	 {
		int i,sum=0;
		 for(i=0;i<str.length();i++) 
	     { 	
			
		     sum=sum+(str.charAt(i)-48);
	     }
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
