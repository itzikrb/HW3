package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class str
{
  	
	@Test
	public void  tester()
	 {
		 StrCal temp=new  StrCal();
		 
		 temp.add(" ");
	 }

	
	@Test	
	public void  calculateZero()
	 {
		 StrCal temp=new  StrCal();
		 temp.add("0");
		 
	 }
	
	@Test	
	public void  calculateOnechar()
	{
		 StrCal temp=new  StrCal();
		 temp.add("1");
	}
 	  
	@Test	
	public void  calculateString()
	{
		 StrCal temp=new  StrCal();
		 temp.add("1,2");
	}
	
	 
}
