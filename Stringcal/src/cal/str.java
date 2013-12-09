package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class str
{
  	
	@Test
	public void  tester()
	 {
		 StrCal temp=new  StrCal();
		 
		System.out.println(temp.add(" ")); 
	 }

	
	@Test	
	public void  calculateZero()
	 {
		 StrCal temp=new  StrCal();
		System.out.println(temp.add("0"));
		 
	 }
	
	@Test	
	public void  calculateOnechar()
	{
		 StrCal temp=new  StrCal();
		System.out.println(temp.add("1")); 
	}
 	  
	@Test	
	public void calculateTwoNumbers()
	{
		 StrCal temp=new  StrCal();
		System.out.println(temp.add("1,2"));
	}
	
	@Test	
	public void  calculateSumOfString()
	{
		 StrCal temp=new  StrCal();
		 System.out.println(temp.add("1,2,a.f,#,#,#,#,#,#,#,#,#,1,2,3,a"));
	}
	
  	 
}
