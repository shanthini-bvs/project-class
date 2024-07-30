package suite.com;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
	@Test
	public void t1()
	{
		System.out.println("T11");
		
	}
	@Test
	public void t2()
	{
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void t3()
	{
		System.out.println("T13");

	}
	@Test
	public void t4()
	{
		Assert.assertTrue(true);
	}
	@Ignore
	@Test
	public void t5()
	{
		System.out.println("T15");
	}
	
	

}
